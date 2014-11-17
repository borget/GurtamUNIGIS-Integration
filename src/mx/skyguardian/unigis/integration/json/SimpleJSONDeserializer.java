package mx.skyguardian.unigis.integration.json;

import java.util.ArrayList;
import java.util.List;

import mx.skyguardian.unigis.integration.bean.UNIGISEvent;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SimpleJSONDeserializer extends AbstractJSONDeserializer {
		private static Logger log = Logger.getLogger(SimpleJSONDeserializer.class);
	
	
	public List<UNIGISEvent> getListOfUnitEvents(JSONObject jsonObj) throws JSONException{
		
		List <UNIGISEvent> units = new ArrayList<UNIGISEvent>();
		
		if (!jsonObj.isNull("searchSpec")) {
			JSONArray jsonArray = (JSONArray) jsonObj.getJSONArray("items");
			if (jsonArray.length() > 0) {
				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject jsonItem = (JSONObject) jsonArray.get(i);

					UNIGISEvent unit = new UNIGISEvent();
					//unit.setDomain((jsonItem.isNull("id")) ? "" : jsonItem.get("id").toString());
					
					if (!jsonItem.isNull("pos")) {
						JSONObject geoPos = jsonItem.getJSONObject("pos");
						unit.setPosixDatetimeEvent(Long.valueOf(Long.parseLong((geoPos.isNull("t"))?"0":geoPos.get("t").toString())));
						unit.setLatitude(Double.parseDouble((geoPos.isNull("y"))?"0.0":geoPos.get("y").toString()));
						unit.setLongitude(Double.parseDouble((geoPos.isNull("x"))?"0.0":geoPos.get("x").toString()));
						unit.setAltitude(Double.valueOf(Integer.parseInt((geoPos.isNull("z"))?"0":geoPos.get("z").toString())));
						unit.setSpeed(Double.valueOf(Integer.parseInt((geoPos.isNull("s"))?"0":geoPos.get("s").toString())));
						
					}
					if (!jsonItem.isNull("flds")) {
						
						JSONObject customFieldsObj = (JSONObject) jsonItem.getJSONObject("flds");

						for (int j = 1; j <= customFieldsObj.length(); j++) {
							if (!customFieldsObj.isNull(String.valueOf(j))) {
								JSONObject customFieldsItem = (JSONObject) customFieldsObj.getJSONObject(String.valueOf(j));
								String n = customFieldsItem.isNull("n")?"n-not-found":customFieldsItem.get("n").toString();
								if (n.equalsIgnoreCase("Placas")) {
									String v = customFieldsItem.isNull("v")?"SINPLACA00":customFieldsItem.get("v").toString();
									v=v.replaceAll("\\s+","");
									unit.setDomain(v.length()==0?"SINPLACA00":v);
									break;
								}
							}
						}
					}
					units.add(unit);
				}

			}
		}
		
		
		return units;
	}
}

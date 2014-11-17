package mx.skyguardian.unigis.integration.json;

import java.util.List;

import mx.skyguardian.unigis.integration.bean.UNIGISEvent;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbstractJSONDeserializer {
	public abstract List<UNIGISEvent> getListOfUnitEvents(JSONObject jsonObj) throws JSONException;
}

/**
 * JSONNull クラス
 */
package com.lightspeedworks.json;

/**
 * JSONNull クラス
 *
 * @author LightSpeedC (Kazuaki Nishizawa; 西澤 和晃)
 */
public class JSONNull extends JSON {
	/**
	 * returns type of JSON object {JSONオブジェクトの型を返す}
	 *
	 * @return JSONType.NULL
	 */
	@Override
	public JSONType typeof() {
		return JSONType.NULL; // JSONType.OBJECT;
	}

	/**
	 * returns value of JSON null object {JSONヌル・オブジェクトの値を返す}
	 *
	 * @return null value of JSON null object {JSONヌル・オブジェクトの値}
	 */
	@Override
	public Object valueOf() {
		return null;
	}

	/**
	 * returns string value of JSON object {JSONオブジェクトの文字列値を返す}
	 *
	 * @return String value {文字列値}
	 */
	@Override
	public String toString() {
		return "null";
	}
}

/**
 * JSONInteger クラス
 */
package com.lightspeedworks.json;

/**
 * JSONInteger クラス
 *
 * @author LightSpeedC (Kazuaki Nishizawa; 西澤 和晃)
 */
public class JSONInteger extends JSON {
	/**
	 * returns type of JSON number object {JSON数値オブジェクトの型を返す}
	 *
	 * @return JSONType.NUMBER
	 */
	@Override
	public JSONType typeof() {
		return JSONType.NUMBER;
	}

	/**
	 * integer value {整数値}
	 */
	private int intVal;

	/**
	 * constractor {コンストラクタ}
	 *
	 * @param intVal integer value {整数値}
	 */
	public JSONInteger(int intVal) {
		this.intVal = intVal;
	}

	/**
	 * returns value of JSON number/int object. {JSON整数オブジェクトの値を返す}
	 *
	 * @return int value of JSON number/int object {JSON整数オブジェクトの値}
	 */
	@Override
	public Object valueOf() {
		return intVal; // new Integer(intVal);
	}
}

/**
 * JSONDouble クラス
 */
package com.lightspeedworks.json;

/**
 * JSONDouble クラス
 *
 * @author LightSpeedC (Kazuaki Nishizawa; 西澤 和晃)
 */
public class JSONDouble extends JSON {
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
	 * double value {実数値}
	 */
	private double doubleVal;

	/**
	 * constractor {コンストラクタ}
	 *
	 * @param doubleVal double value {実数値}
	 */
	public JSONDouble(double doubleVal) {
		this.doubleVal = doubleVal;
	}

	/**
	 * returns value of JSON number/double object {JSON実数オブジェクトの値を返す}
	 *
	 * @return double value of JSON number/double object {JSON実数オブジェクトの値}
	 */
	@Override
	public Object valueOf() {
		return doubleVal; // new Double(doubleVal);
	}
}

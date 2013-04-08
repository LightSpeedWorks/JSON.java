/**
 * JSONDouble クラス
 */
package com.lightspeedworks.json;

/**
 * JSONDouble クラス
 *
 * @author LightSpeedC (Kazuaki Nishizawa; 西澤 和晃)
 */
public class JSONBoolean extends JSON {
	/**
	 * returns type of JSON boolean object {JSONブーリアン・オブジェクトの型を返す}
	 *
	 * @return JSONType.BOOLEAN
	 */
	@Override
	public JSONType typeof() {
		return JSONType.BOOLEAN;
	}

	/**
	 * boolean value {ブーリアン値}
	 */
	private boolean boolVal = false;

	/**
	 * constractor {コンストラクタ}
	 *
	 * @param boolVal boolean value {ブーリアン値}
	 */
	public JSONBoolean(boolean boolVal) {
		this.boolVal = boolVal;
	}

	/**
	 * returns value of JSON boolean object {JSONブーリアン・オブジェクトの値を返す}
	 *
	 * @return boolean value of JSON boolean object {JSONブーリアン・オブジェクトの値}
	 */
	@Override
	public Object valueOf() {
		return boolVal;
	}
}
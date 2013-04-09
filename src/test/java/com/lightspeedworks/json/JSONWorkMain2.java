package com.lightspeedworks.json;

public class JSONWorkMain2 {

	/**
	 * main
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		JSON obj;

		try {
			// NUMBER int
			obj = JSON.parse("123");
			int intNum = (Integer) obj.valueOf();
			System.out.println(obj.typeof() + "\tint:\t" + obj.stringify() + "\t" + obj + "\t" + intNum);

			// NUMBER double
			obj = JSON.parse("12.3");
			double doubleNum = (Double) obj.valueOf();
			System.out.println(obj.typeof() + "\tdbl:\t" + obj.stringify() + "\t" + obj + "\t" + doubleNum);

			// BOOLEAN
			obj = JSON.parse("true");
			boolean bool = (Boolean) obj.valueOf();
			System.out.println(obj.typeof() + "\tbool:\t" + obj.stringify() + "\t" + obj + "\t" + bool);

			// STRING
			obj = JSON.parse("\"xyz\"");
			String str = (String) obj.valueOf();
			System.out.println(obj.typeof() + "\tstr:\t" + obj.stringify() + "\t" + obj + "\t" + str);

			// NULL
			obj = JSON.parse("null");
			Object nil = (Object) obj.valueOf();
			System.out.println(obj.typeof() + "\tnil:\t" + obj.stringify() + "\t" + obj + "\t" + nil);

			// ARRAY
			obj = JSON.parse("[]");
			System.out.println(obj.typeof() + "\t[]:\t" + obj.stringify() + "\t" + obj);

			// OBJECT
			obj = JSON.parse("{}");
			System.out.println(obj.typeof() + "\t{}:\t" + obj.stringify() + "\t" + obj);





			obj = JSON.parse("[123, 456, \"xyz\"]");

			System.out.println("obj[0] = " + obj.get(0).toString());
			System.out.println("obj[1] = " + obj.get(1)); // .toString() omitted
			System.out.println("obj[2] = " + obj.get(2));

			System.out.println("stringify = " + JSON.stringify(obj));
			System.out.println("stringify = " + obj.stringify()); // same of above

			obj = JSON.createArray();
			obj.push(123);

			obj = JSON.parse("{\"x\": 123, \"y\": \"abc\", \"z\": \"x\\\\y\"}");

			System.out.println("obj.x = " + obj.get("x"));
			System.out.println("obj.y = " + obj.get("y"));
			System.out.println("obj.z = " + obj.get("z"));
			System.out.println("obj.z = " + obj.get("z").stringify());
			System.out.println("stringify = " + obj.stringify());

			obj = JSON.createObject();
			obj.put("x", 123);
			obj.put("y", "abc");
			obj.put("z", "x\\y");
			System.out.println("stringify = " + obj.stringify());

			obj = JSON.create(1234);		// NUMBER int
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(12.3);		// NUMBER double
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(true);		// BOOLEAN
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create("str");		// STRING
			System.out.println("stringify = " + obj.stringify());

			obj = JSON.createNumber(1234);	// NUMBER int
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.createNumber(12.3);	// NUMBER double
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.createBoolean(true);	// BOOLEAN
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.createString("str");	// STRING
			System.out.println("stringify = " + obj.stringify());

			obj = JSON.create();			// OBJECT
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.createObject();		// OBJECT
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.createArray();		// ARRAY
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.createNull();		// NULL
			System.out.println("stringify = " + obj.stringify());

			obj = JSON.create(12, 34);	// ARRAY of NUMBER int
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(12.3, 45.6);	// ARRAY of NUMBER double
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(true, false);	// ARRAY of BOOLEAN
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create("abc", "xyz");	// ARRAY of STRING
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(null, null);	// ARRAY of NULL
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(12, 12.3, true, "abc", null);	// ARRAY of ANY
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(new int[] {12, 34});	// ARRAY of NUMBER int
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(new double[] {12.3, 45.6});	// ARRAY of NUMBER double
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(new boolean[] {true, false});	// ARRAY of BOOLEAN
			System.out.println("stringify = " + obj.stringify());
			obj = JSON.create(new String[] {"abc", "xyz", null});	// ARRAY of STRING
			System.out.println("stringify = " + obj.stringify());

			obj = JSON.create(12, 34, JSONType.OBJECT, JSONType.ARRAY, Object.class);
			System.out.println("stringify = " + obj.stringify());
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}

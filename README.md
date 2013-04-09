JSON.java
==========================

LightSpeedWorks pages {光速工房}

Light JSON Library for Java
{軽量JSONライブラリ(Java向け)}

[LightSpeedWorks/JSON.java#readme] (https://github.com/LightSpeedWorks/JSON.java#readme "LightSpeedWorks/JSON.java#readme")

## usage: {使用方法:}

## JSON.parse(String) to JSON Array, and stringify

``` java
import com.lightspeedworks.json.JSON;

JSON obj = JSON.parse("[123, 456, \"xyz\"]");

System.out.println("obj[0] = " + obj.get(0).toString());
System.out.println("obj[1] = " + obj.get(1)); // .toString() omitted
System.out.println("obj[2] = " + obj.get(2));

System.out.println("stringify = " + JSON.stringify(obj));
System.out.println("stringify = " + obj.stringify()); // same of above
```

output:
```
obj[0] = 123
obj[1] = 456
obj[2] = xyz
stringify = [123, 456, "xyz"]
stringify = [123, 456, "xyz"]
```

## JSON.parse(String) to JSON Object, and stringify

``` java
JSON obj = JSON.parse("{\"x\": 123, \"y\": \"abc\", \"z\": \"x\\\\y\"}");

System.out.println("obj.x = " + obj.get("x").toString());
System.out.println("obj.y = " + obj.get("y"));
System.out.println("obj.z = " + obj.get("z"));
System.out.println("obj.z = " + obj.get("z").stringify());

System.out.println("stringify = " + obj.stringify());
```

output:
```
obj.x = 123
obj.y = abc
obj.z = x\y
obj.z = "x\\y"
stringify = {"x": 123, "y": "abc", "z": "x\\y"}
```

## JSON.create*() to create JSON Objects

``` java
JSON obj;

obj = JSON.create(1234);		// NUMBER int
obj = JSON.create(12.3);		// NUMBER double
obj = JSON.create(true);		// BOOLEAN
obj = JSON.create("str");		// STRING

obj = JSON.createNumber(1234);	// NUMBER int
obj = JSON.createNumber(12.3);	// NUMBER double
obj = JSON.createBoolean(true);	// BOOLEAN
obj = JSON.createString("str");	// STRING

obj = JSON.create();			// OBJECT
obj = JSON.createObject();		// OBJECT
obj = JSON.createArray();		// ARRAY
obj = JSON.createNull();		// NULL

obj = JSON.create(12, 34);			// ARRAY of NUMBER int
obj = JSON.create(12.3, 45.6);		// ARRAY of NUMBER double
obj = JSON.create(true, false);		// ARRAY of BOOLEAN
obj = JSON.create("abc", "xyz");	// ARRAY of STRING

obj = JSON.create(12, 12.3, true, "xyz", null);	// ARRAY of ANY

obj = JSON.create(new int[] {12, 34});			// ARRAY of NUMBER int
obj = JSON.create(new double[] {12.3, 45.6});	// ARRAY of NUMBER double
obj = JSON.create(new boolean[] {true, false});	// ARRAY of BOOLEAN
obj = JSON.create(new String[] {"abc", "xyz", null});	// ARRAY of STRING
```

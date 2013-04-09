JSON.java
==========================

LightSpeedWorks pages {光速工房}

Light JSON Library for Java
{軽量JSONライブラリ(Java向け)}

[LightSpeedWorks/JSON.java#readme] (https://github.com/LightSpeedWorks/JSON.java#readme "LightSpeedWorks/JSON.java#readme")

## usage: {使用方法:}

## JSON.parse(String), stringify(), toString(), valueOf() and typeof()

``` java
import com.lightspeedworks.json.JSON;

JSON obj;

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
```

## JSON Array

``` java
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

## JSON Object

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

obj = JSON.create(1234);                                // NUMBER int
obj = JSON.create(12.3);                                // NUMBER double
obj = JSON.create(true);                                // BOOLEAN
obj = JSON.create("str");                               // STRING

obj = JSON.createNumber(1234);                          // NUMBER int
obj = JSON.createNumber(12.3);                          // NUMBER double
obj = JSON.createBoolean(true);                         // BOOLEAN
obj = JSON.createString("str");                         // STRING

obj = JSON.create();                                    // OBJECT
obj = JSON.createObject();                              // OBJECT
obj = JSON.createArray();                               // ARRAY
obj = JSON.createNull();                                // NULL

obj = JSON.create(12, 34);                              // ARRAY of NUMBER int
obj = JSON.create(12.3, 45.6);                          // ARRAY of NUMBER double
obj = JSON.create(true, false);                         // ARRAY of BOOLEAN
obj = JSON.create("abc", "xyz");                        // ARRAY of STRING

obj = JSON.create(12, 12.3, true, "xyz", null);         // ARRAY of any type

obj = JSON.create(new int[] {12, 34});                  // ARRAY of NUMBER int
obj = JSON.create(new double[] {12.3, 45.6});           // ARRAY of NUMBER double
obj = JSON.create(new boolean[] {true, false});         // ARRAY of BOOLEAN
obj = JSON.create(new String[] {"abc", "xyz", null});   // ARRAY of STRING
```

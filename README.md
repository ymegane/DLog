# [WIP] DLog [![Build Status](https://travis-ci.org/ymegane/DLog.svg?branch=master)](https://travis-ci.org/ymegane/DLog)
The better log output library for Android.

## Why
In many cases, `android.util.Log` requests a `TAG` in many classes.
Also we want to add to the log in other than character information.(e.g method name, line number..

## Feature
- Class name(and package name) based tag
- Automatically add the line number and the method name
- When release build is automatically disable

## Usage
Work in progress...
I'm going to upload to any repository.

Open your application class and add the below code.

```java
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        DLog.init(this);
    }
}
```

And add somewhere in your code
```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DLog.d("test");

        doSomething();
    }

    private void doSomething() {
        DLog.printMethod();
    }
}
```

The output, as follows
```
com.github.ymegane.android.dlog.sample D/MainActivity: onCreate [L.15] test
com.github.ymegane.android.dlog.sample D/MainActivity: doSomething [L.21]
```

## Licence

```
Copyright 2016 ymegane

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
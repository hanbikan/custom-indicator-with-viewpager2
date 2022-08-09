# custom-indicator-with-viewpager2
A simple example of custom indicator for ViewPager2.

<img src="https://user-images.githubusercontent.com/58168528/183252255-a66e1fb3-aed1-4cd1-a025-292cf57fdb92.gif" width="300px"/> | <img src="https://user-images.githubusercontent.com/58168528/183554925-4cec3182-cdcd-41ee-941d-034328f2f8ff.gif" width="300px"/>

<img src="https://user-images.githubusercontent.com/58168528/183553596-3119e688-3e43-4698-8254-745857199a0e.gif" width="300px"/> | <img src="https://user-images.githubusercontent.com/58168528/183554385-476d3ead-0652-479a-87c9-57de5d8b4096.gif" width="300px"/>

## In XML layout
```
<com.hanbitkang.custom_indicator_with_viewpager2.CustomIndicator
            android:id="@+id/custom_indicator"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:customIndicatorSize="10dp"
            app:indicatorRadius="5dp"
            app:selectedIndicatorWidthScale="5"
            app:indicatorWidthScale="2"
            app:indicatorMargin="7dp"
            app:indicatorColor="@color/light_gray"
            app:selectedIndicatorColor="@color/light_blue"/>
```
## Arrtibutes
|Attributes|Description|
|----|----|
|customIndicatorSize|Base size of the indicators|
|indicatorRadius|Corner radius of the indicators|
|selectedIndicatorWidthScale|Determines how large the selected indicator will be(scale by customIndicatorSize)|
|indicatorWidthScale|Determines how large the indicators will be(scale by customIndicatorSize)|
|indicatorMargin|Margin between the indicators|
|selectedIndicatorColor|Color of the selected indicator|
|indicatorColor|Color of the indicators|

## In Kotlin
```
customIndicator.setupViewPager2(viewPager2, viewPager2.currentItem)
```

# License
```
Copyright 2022 Hanbit Kang

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

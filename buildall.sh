#!/usr/bin/env bash
#
./gradlew clean

./gradlew build

./gradlew assembleRelease
#
#
#./rmdir /s/q %userprofile%\desktop\apk
#
#./xcopy %userprofile%\AndroidProjects\A_kotlin_demo\GankClient-Kotlin\app\build\outputs\apk  %userprofile%\desktop\apk\ /s/e




*work in progress*

# Lightning-Shopper [![Build Status](https://travis-ci.org/SierraGolf/lightning-shopper.svg)](https://travis-ci.org/SierraGolf/lightning-shopper)
This is supposed to become an android app which implements a clever shopping list. Key features:
* adding items to the shopping list
* being able to tag items (one tag per item) in the shopping list in order to group them by their location in the supermarket, e.g. nudels, drink, sweets, cheese, meat ...
* being able to maintain tags (add, remove, edit)
* being able to maintain "supermarkets" (add, remove, edit)
* being able to maintain an ordered tag list (add, remove, edit) for each supermarket indicating the usual/optimal route through the market
* showing items in the shopping list
* being able to sort the shopping list by the sorted tag list of the supermarket

## Technologies
Since this project is mainly a toy project, I am planning to experiment with several android technologies I am interested in.
Currently I am experimenting with the build/test and automation setup, afterwards I want to spent some time checking out RxJava and Realm as well as android's new material design.

## Build
* either add ```./scripts``` to your path or prepend it to the following scripts
* run unit tests with ```uts```
* run integration tests with ```its```
* run user acceptance tests with ```uats```
* run user acceptance tests with coverage ```uats-coverage```
* install debug version on the device ```installDebug```

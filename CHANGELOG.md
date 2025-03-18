# Changelog

## 0.8.0 (2025-03-18)

Full Changelog: [v0.7.0...v0.8.0](https://github.com/braintrustdata/braintrust-java/compare/v0.7.0...v0.8.0)

### ⚠ BREAKING CHANGES

* **client:** refactor multipart formdata impl ([#132](https://github.com/braintrustdata/braintrust-java/issues/132))

### Features

* **api:** api update ([#64](https://github.com/braintrustdata/braintrust-java/issues/64)) ([f1d956d](https://github.com/braintrustdata/braintrust-java/commit/f1d956dec36db180eba1333303361fe577229fbd))
* **api:** api update ([#66](https://github.com/braintrustdata/braintrust-java/issues/66)) ([02b0490](https://github.com/braintrustdata/braintrust-java/commit/02b0490c081fc51c4c11b12cf8592dc513ac7a1f))
* **api:** api update ([#67](https://github.com/braintrustdata/braintrust-java/issues/67)) ([2ca59f7](https://github.com/braintrustdata/braintrust-java/commit/2ca59f78f8e775f10b4c09e040e7f55ec27612b1))
* **api:** api update ([#68](https://github.com/braintrustdata/braintrust-java/issues/68)) ([288a26d](https://github.com/braintrustdata/braintrust-java/commit/288a26dc55ba27313879a00ace18304408adefe9))
* **api:** manual updates ([#100](https://github.com/braintrustdata/braintrust-java/issues/100)) ([8aea924](https://github.com/braintrustdata/braintrust-java/commit/8aea924ce9c2992c1f620f63c077de8e508852f6))
* **api:** manual updates ([#107](https://github.com/braintrustdata/braintrust-java/issues/107)) ([893c7c9](https://github.com/braintrustdata/braintrust-java/commit/893c7c9d9397aa0b5abd0b13f8d3d889aa2c6636))
* **api:** manual updates ([#148](https://github.com/braintrustdata/braintrust-java/issues/148)) ([03f4bce](https://github.com/braintrustdata/braintrust-java/commit/03f4bce0a262fd275057a74fc5cc6736e9df6a70))
* **api:** manual updates ([#149](https://github.com/braintrustdata/braintrust-java/issues/149)) ([98e4bf7](https://github.com/braintrustdata/braintrust-java/commit/98e4bf7ddd7fd4709b2c4bc12d6f208316f98ac0))
* **api:** manual updates ([#150](https://github.com/braintrustdata/braintrust-java/issues/150)) ([be6e2a6](https://github.com/braintrustdata/braintrust-java/commit/be6e2a679a76caf1e7ef03422ef91087a2c75981))
* **api:** manual updates ([#151](https://github.com/braintrustdata/braintrust-java/issues/151)) ([be0354d](https://github.com/braintrustdata/braintrust-java/commit/be0354dbb77893f24083ea294531d8f7a1e00309))
* **api:** manual updates ([#91](https://github.com/braintrustdata/braintrust-java/issues/91)) ([5e9b07e](https://github.com/braintrustdata/braintrust-java/commit/5e9b07e8f84aff42457a97000302fa2e890282b2))
* **api:** manual updates ([#93](https://github.com/braintrustdata/braintrust-java/issues/93)) ([3c635ad](https://github.com/braintrustdata/braintrust-java/commit/3c635adb8c1d2e6e26f20e764ac5b9de50b4f2db))
* **api:** manual updates ([#95](https://github.com/braintrustdata/braintrust-java/issues/95)) ([0e97915](https://github.com/braintrustdata/braintrust-java/commit/0e97915cf7aaa7f1610d56b7c281c28b84ead0ac))
* **api:** manual updates ([#96](https://github.com/braintrustdata/braintrust-java/issues/96)) ([711a5bc](https://github.com/braintrustdata/braintrust-java/commit/711a5bcf08739214cb62ef99a8de9e267c7afb34))
* **api:** manual updates ([#97](https://github.com/braintrustdata/braintrust-java/issues/97)) ([f229777](https://github.com/braintrustdata/braintrust-java/commit/f229777ec23714e3e3adfdb6678cffccb13a89f9))
* **api:** manual updates ([#98](https://github.com/braintrustdata/braintrust-java/issues/98)) ([d27a782](https://github.com/braintrustdata/braintrust-java/commit/d27a7828e50e8e0c91c6b9a527796d0352a8a554))
* **api:** manual updates ([#99](https://github.com/braintrustdata/braintrust-java/issues/99)) ([eb3e689](https://github.com/braintrustdata/braintrust-java/commit/eb3e6891d822772b04258b63d3ecb1db96537186))
* **client:** accept `InputStream` and `Path` for file params ([#136](https://github.com/braintrustdata/braintrust-java/issues/136)) ([92073d0](https://github.com/braintrustdata/braintrust-java/commit/92073d0365dcb479ba2565a41305f56f882fecb3))
* **client:** add logging when debug env is set ([#106](https://github.com/braintrustdata/braintrust-java/issues/106)) ([0bad87e](https://github.com/braintrustdata/braintrust-java/commit/0bad87e1644242cfdbe21d92bf19d138536900f0))
* **client:** allow configuring timeouts granularly ([#130](https://github.com/braintrustdata/braintrust-java/issues/130)) ([606ebb7](https://github.com/braintrustdata/braintrust-java/commit/606ebb74dcc339190eeefe2b072f273783445edc))
* **client:** detect binary incompatible jackson versions ([#137](https://github.com/braintrustdata/braintrust-java/issues/137)) ([de216b5](https://github.com/braintrustdata/braintrust-java/commit/de216b560305cb737647cbc34e7775d84ee0e11e))
* **client:** get rid of annoying checked exceptions ([#118](https://github.com/braintrustdata/braintrust-java/issues/118)) ([0aabe74](https://github.com/braintrustdata/braintrust-java/commit/0aabe74100f814d12b472e5f4d8344b851804d0a))
* **client:** support `JsonField#asX()` for known values ([#114](https://github.com/braintrustdata/braintrust-java/issues/114)) ([550e1a8](https://github.com/braintrustdata/braintrust-java/commit/550e1a8e92513d874055b527c8b20188078fe312))
* **client:** support raw response access ([#131](https://github.com/braintrustdata/braintrust-java/issues/131)) ([cc8b5a5](https://github.com/braintrustdata/braintrust-java/commit/cc8b5a5d66ca1a077e58cbf145e468effbfba2c3))
* **client:** update enum `asX` methods ([#113](https://github.com/braintrustdata/braintrust-java/issues/113)) ([ed83ac5](https://github.com/braintrustdata/braintrust-java/commit/ed83ac52612873519062919eae567a1e82b3b221))
* generate and publish docs ([#138](https://github.com/braintrustdata/braintrust-java/issues/138)) ([d951553](https://github.com/braintrustdata/braintrust-java/commit/d9515531787d8f63c33c977118ea6c58378ee7f9))


### Bug Fixes

* **client:** add missing `@JvmStatic` ([#124](https://github.com/braintrustdata/braintrust-java/issues/124)) ([c4e0b8a](https://github.com/braintrustdata/braintrust-java/commit/c4e0b8ad6755613242bcc135c36dd7538adb8c99))
* **client:** mark some request bodies as optional ([#120](https://github.com/braintrustdata/braintrust-java/issues/120)) ([274c95c](https://github.com/braintrustdata/braintrust-java/commit/274c95c6df23554f747392fb51a50f3a327125af))


### Chores

* **api:** manual updates ([#72](https://github.com/braintrustdata/braintrust-java/issues/72)) ([b6c9f43](https://github.com/braintrustdata/braintrust-java/commit/b6c9f43a2a14533b88d39666809b5ee7ce670504))
* **client:** expose `Optional`, not nullable, from `ClientOptions` ([#135](https://github.com/braintrustdata/braintrust-java/issues/135)) ([bd8a24d](https://github.com/braintrustdata/braintrust-java/commit/bd8a24d41ddc414c3797a303c2b48ecd643d772b))
* **client:** refactor multipart formdata impl ([#132](https://github.com/braintrustdata/braintrust-java/issues/132)) ([a32b711](https://github.com/braintrustdata/braintrust-java/commit/a32b7113952189d2624dcbb534a6da5dc36a3224))
* **client:** use deep identity methods for primitive array types ([#126](https://github.com/braintrustdata/braintrust-java/issues/126)) ([effc197](https://github.com/braintrustdata/braintrust-java/commit/effc19754eb651f3531959839e9a803d4b056587))
* **deps:** bump jackson to 2.18.1 ([#101](https://github.com/braintrustdata/braintrust-java/issues/101)) ([1d5c887](https://github.com/braintrustdata/braintrust-java/commit/1d5c887b11473e110a197d004a278f9abf8ed4c4))
* **docs:** add faq to readme ([#119](https://github.com/braintrustdata/braintrust-java/issues/119)) ([5b4d07f](https://github.com/braintrustdata/braintrust-java/commit/5b4d07fc3da4e77c62bdffddd4f6e215401755b2))
* **docs:** reorganize readme ([#115](https://github.com/braintrustdata/braintrust-java/issues/115)) ([b65c599](https://github.com/braintrustdata/braintrust-java/commit/b65c5991e1451302fd20fb345d82c89fbd47bc80))
* **internal:** add `.kotlin` to `.gitignore` ([#139](https://github.com/braintrustdata/braintrust-java/issues/139)) ([1e4c3e5](https://github.com/braintrustdata/braintrust-java/commit/1e4c3e584f71562c26dde78c3366c75e1e5dd8bb))
* **internal:** add async service tests ([#125](https://github.com/braintrustdata/braintrust-java/issues/125)) ([5dc06c8](https://github.com/braintrustdata/braintrust-java/commit/5dc06c8acd281951e841146b1b16803f017c9948))
* **internal:** add generated comment ([#154](https://github.com/braintrustdata/braintrust-java/issues/154)) ([28a3568](https://github.com/braintrustdata/braintrust-java/commit/28a35683de525b8de0ca345bb246ed537104788d))
* **internal:** codegen related update ([#105](https://github.com/braintrustdata/braintrust-java/issues/105)) ([ad0fed3](https://github.com/braintrustdata/braintrust-java/commit/ad0fed3824772a29ce635f672c2feb6f7c2beb17))
* **internal:** codegen related update ([#109](https://github.com/braintrustdata/braintrust-java/issues/109)) ([a8b7cd7](https://github.com/braintrustdata/braintrust-java/commit/a8b7cd7d1e5346b702483b336f9a1d9f71f38c11))
* **internal:** codegen related update ([#111](https://github.com/braintrustdata/braintrust-java/issues/111)) ([029cbc7](https://github.com/braintrustdata/braintrust-java/commit/029cbc78bf94c707da26f3550db354480909bd78))
* **internal:** codegen related update ([#117](https://github.com/braintrustdata/braintrust-java/issues/117)) ([aaaef18](https://github.com/braintrustdata/braintrust-java/commit/aaaef188d4fbe8ba97fcc55fe1dac15d527cf1ec))
* **internal:** codegen related update ([#122](https://github.com/braintrustdata/braintrust-java/issues/122)) ([c9d3840](https://github.com/braintrustdata/braintrust-java/commit/c9d3840c4fded6c0ece296ceb60a5526c3d81c75))
* **internal:** codegen related update ([#123](https://github.com/braintrustdata/braintrust-java/issues/123)) ([9dbc537](https://github.com/braintrustdata/braintrust-java/commit/9dbc537a6271bc2bbd2839515f77eeb58951e4ab))
* **internal:** codegen related update ([#145](https://github.com/braintrustdata/braintrust-java/issues/145)) ([23f0da4](https://github.com/braintrustdata/braintrust-java/commit/23f0da4fecedf41ae2a2f573ed0f8e25938057cf))
* **internal:** codegen related update ([#146](https://github.com/braintrustdata/braintrust-java/issues/146)) ([4a82e6f](https://github.com/braintrustdata/braintrust-java/commit/4a82e6f3159a2b6697f8dbe23304a693e0448ebb))
* **internal:** don't use `JvmOverloads` in interfaces ([84daad7](https://github.com/braintrustdata/braintrust-java/commit/84daad738819f265ff28ab6c351008a7018e0340))
* **internal:** get rid of configuration cache ([#116](https://github.com/braintrustdata/braintrust-java/issues/116)) ([1a69b73](https://github.com/braintrustdata/braintrust-java/commit/1a69b73fdc5eb657e72fd3b3d8d3c4f34378cbc3))
* **internal:** improve sync service tests ([5dc06c8](https://github.com/braintrustdata/braintrust-java/commit/5dc06c8acd281951e841146b1b16803f017c9948))
* **internal:** make body class constructors private ([b417ac7](https://github.com/braintrustdata/braintrust-java/commit/b417ac7d07cc916a3928a17a57406b08ed014fa0))
* **internal:** make body classes for multipart requests ([b417ac7](https://github.com/braintrustdata/braintrust-java/commit/b417ac7d07cc916a3928a17a57406b08ed014fa0))
* **internal:** make test classes internal ([#153](https://github.com/braintrustdata/braintrust-java/issues/153)) ([f4d9990](https://github.com/braintrustdata/braintrust-java/commit/f4d99903225690cfb6fad53ac26fee5c3615977f))
* **internal:** misc formatting changes ([b417ac7](https://github.com/braintrustdata/braintrust-java/commit/b417ac7d07cc916a3928a17a57406b08ed014fa0))
* **internal:** reenable warnings as errors ([#141](https://github.com/braintrustdata/braintrust-java/issues/141)) ([84daad7](https://github.com/braintrustdata/braintrust-java/commit/84daad738819f265ff28ab6c351008a7018e0340))
* **internal:** refactor `ErrorHandlingTest` ([#129](https://github.com/braintrustdata/braintrust-java/issues/129)) ([f61300b](https://github.com/braintrustdata/braintrust-java/commit/f61300b640f71f7d5ce0dee685b0d0524da59d08))
* **internal:** refactor `PhantomReachableClosingAsyncStreamResponse` impl ([#110](https://github.com/braintrustdata/braintrust-java/issues/110)) ([d1647df](https://github.com/braintrustdata/braintrust-java/commit/d1647dff5977260e2346ad1eeaa5105cc82f8463))
* **internal:** refactor `ServiceParamsTest` ([#127](https://github.com/braintrustdata/braintrust-java/issues/127)) ([4104744](https://github.com/braintrustdata/braintrust-java/commit/410474405bf5b56695aea53e7d560d7cc48bc144))
* **internal:** refactor query param serialization impl and tests ([#156](https://github.com/braintrustdata/braintrust-java/issues/156)) ([f141195](https://github.com/braintrustdata/braintrust-java/commit/f1411950e6f4807ac2ec5f34ed12ecbc70b51fad))
* **internal:** remove unnecessary non-null asserts in tests ([274c95c](https://github.com/braintrustdata/braintrust-java/commit/274c95c6df23554f747392fb51a50f3a327125af))
* **internal:** remove unused script ([#147](https://github.com/braintrustdata/braintrust-java/issues/147)) ([6eee272](https://github.com/braintrustdata/braintrust-java/commit/6eee2722878aa0bfd85f8f11b6a99fb5aa2b4036))
* **internal:** rename internal body classes ([b417ac7](https://github.com/braintrustdata/braintrust-java/commit/b417ac7d07cc916a3928a17a57406b08ed014fa0))
* **internal:** update some formatting in `Values.kt` ([550e1a8](https://github.com/braintrustdata/braintrust-java/commit/550e1a8e92513d874055b527c8b20188078fe312))
* **internal:** update variable names in tests ([#142](https://github.com/braintrustdata/braintrust-java/issues/142)) ([e8882a7](https://github.com/braintrustdata/braintrust-java/commit/e8882a710bff95c91accdcd7bd293f24a724fb7f))
* **internal:** use `assertNotNull` in tests for type narrowing ([274c95c](https://github.com/braintrustdata/braintrust-java/commit/274c95c6df23554f747392fb51a50f3a327125af))
* **internal:** use `getOrNull` instead of `orElse(null)` ([#140](https://github.com/braintrustdata/braintrust-java/issues/140)) ([1db71f8](https://github.com/braintrustdata/braintrust-java/commit/1db71f8bc37728717ecbfcffb31f6b3afbe4380a))
* **internal:** use better test example values ([#112](https://github.com/braintrustdata/braintrust-java/issues/112)) ([b417ac7](https://github.com/braintrustdata/braintrust-java/commit/b417ac7d07cc916a3928a17a57406b08ed014fa0))
* rebuild project due to codegen change ([#69](https://github.com/braintrustdata/braintrust-java/issues/69)) ([a7c0606](https://github.com/braintrustdata/braintrust-java/commit/a7c0606dca2139ba230c5d4813dcf76f1ec59d08))
* rebuild project due to codegen change ([#70](https://github.com/braintrustdata/braintrust-java/issues/70)) ([ccb8dd5](https://github.com/braintrustdata/braintrust-java/commit/ccb8dd583d9783e0466503fa848a1ef5fd577e20))
* rebuild project due to codegen change ([#71](https://github.com/braintrustdata/braintrust-java/issues/71)) ([0c35214](https://github.com/braintrustdata/braintrust-java/commit/0c35214c2e1b903f741cf39c6a4d7289b13b6271))
* rebuild project due to codegen change ([#73](https://github.com/braintrustdata/braintrust-java/issues/73)) ([a7a6379](https://github.com/braintrustdata/braintrust-java/commit/a7a6379e2b4e7a8944aa89df8de05ca116db8af8))
* rebuild project due to codegen change ([#74](https://github.com/braintrustdata/braintrust-java/issues/74)) ([d665d0f](https://github.com/braintrustdata/braintrust-java/commit/d665d0f6cfd44d1bee4ea5dd02d00c0a63203b0c))
* rebuild project due to codegen change ([#75](https://github.com/braintrustdata/braintrust-java/issues/75)) ([9ac5669](https://github.com/braintrustdata/braintrust-java/commit/9ac566913ab54368b5e1eb10c5e6c20fc86ff75a))
* rebuild project due to codegen change ([#76](https://github.com/braintrustdata/braintrust-java/issues/76)) ([6498c99](https://github.com/braintrustdata/braintrust-java/commit/6498c997bc0fb2ae68e842ab6b69110115fa458b))
* rebuild project due to codegen change ([#77](https://github.com/braintrustdata/braintrust-java/issues/77)) ([7c9b2ad](https://github.com/braintrustdata/braintrust-java/commit/7c9b2adb46f8e24d9a3c908400596d96795b8ede))
* rebuild project due to codegen change ([#78](https://github.com/braintrustdata/braintrust-java/issues/78)) ([fa5ee1f](https://github.com/braintrustdata/braintrust-java/commit/fa5ee1f34562b8ac88122f183ee307aec99ff496))
* rebuild project due to codegen change ([#79](https://github.com/braintrustdata/braintrust-java/issues/79)) ([9e17de0](https://github.com/braintrustdata/braintrust-java/commit/9e17de04225a4a334fe068f5cbd7e3116c765782))
* rebuild project due to codegen change ([#80](https://github.com/braintrustdata/braintrust-java/issues/80)) ([223ed2e](https://github.com/braintrustdata/braintrust-java/commit/223ed2e21d18538cff3875f3697b2c0ded1b4ad3))
* rebuild project due to codegen change ([#81](https://github.com/braintrustdata/braintrust-java/issues/81)) ([44f5fbe](https://github.com/braintrustdata/braintrust-java/commit/44f5fbe68fcb12f0d08a091c88c39bf87f8855af))
* rebuild project due to codegen change ([#83](https://github.com/braintrustdata/braintrust-java/issues/83)) ([c9d6eae](https://github.com/braintrustdata/braintrust-java/commit/c9d6eae2658ce543a3ccba996373b923e4371cd7))
* rebuild project due to codegen change ([#84](https://github.com/braintrustdata/braintrust-java/issues/84)) ([8f2a24b](https://github.com/braintrustdata/braintrust-java/commit/8f2a24b0683f51df845f3a433d66994288149e6a))
* rebuild project due to codegen change ([#86](https://github.com/braintrustdata/braintrust-java/issues/86)) ([d83611f](https://github.com/braintrustdata/braintrust-java/commit/d83611fa8e3155f295f276573235d1bfd6f68371))
* rebuild project due to codegen change ([#88](https://github.com/braintrustdata/braintrust-java/issues/88)) ([2e62835](https://github.com/braintrustdata/braintrust-java/commit/2e62835d07807e4e1aa018180fac6ca3de574e8e))
* rebuild project due to codegen change ([#90](https://github.com/braintrustdata/braintrust-java/issues/90)) ([e353324](https://github.com/braintrustdata/braintrust-java/commit/e35332464b9e4a83bef95f90866c0de79bc8c0ff))
* rebuild project due to codegen change ([#94](https://github.com/braintrustdata/braintrust-java/issues/94)) ([1cd427d](https://github.com/braintrustdata/braintrust-java/commit/1cd427d2b43bbfb35c1ef70ae0e20ff7c66bb876))


### Documentation

* add `build` method comments ([#155](https://github.com/braintrustdata/braintrust-java/issues/155)) ([6b504cb](https://github.com/braintrustdata/braintrust-java/commit/6b504cbb091ddbfff7b2487dd143cab9e3d4da01))
* add immutability explanation to readme ([#121](https://github.com/braintrustdata/braintrust-java/issues/121)) ([6a15c6f](https://github.com/braintrustdata/braintrust-java/commit/6a15c6f103419b9ebd420a5a40de9b675c5302f0))
* add more phantom reachability docs ([d1647df](https://github.com/braintrustdata/braintrust-java/commit/d1647dff5977260e2346ad1eeaa5105cc82f8463))
* add raw response readme documentation ([#133](https://github.com/braintrustdata/braintrust-java/issues/133)) ([711d655](https://github.com/braintrustdata/braintrust-java/commit/711d6554708df00be676d724775d090a8f1f5723))
* deduplicate and refine comments ([#152](https://github.com/braintrustdata/braintrust-java/issues/152)) ([73fb462](https://github.com/braintrustdata/braintrust-java/commit/73fb462b4574596a30820dbab116ba57fab47460))
* document `JsonValue` construction in readme ([#144](https://github.com/braintrustdata/braintrust-java/issues/144)) ([33fa7ab](https://github.com/braintrustdata/braintrust-java/commit/33fa7ab33b83c408b14fc770b451ac9bb10bd1ca))
* note required fields in `builder` javadoc ([#134](https://github.com/braintrustdata/braintrust-java/issues/134)) ([c0d11e5](https://github.com/braintrustdata/braintrust-java/commit/c0d11e5cd44c38cb272cab21f18432e25dc204a0))
* readme parameter tweaks ([5dc06c8](https://github.com/braintrustdata/braintrust-java/commit/5dc06c8acd281951e841146b1b16803f017c9948))
* revise readme docs about nested params ([#143](https://github.com/braintrustdata/braintrust-java/issues/143)) ([0a06490](https://github.com/braintrustdata/braintrust-java/commit/0a06490b643d90b0666d2f3505dd20e8d519251c))
* update URLs from stainlessapi.com to stainless.com ([#128](https://github.com/braintrustdata/braintrust-java/issues/128)) ([57e17de](https://github.com/braintrustdata/braintrust-java/commit/57e17de51ce9372dee4dab1f3ad67a040d7900bb))


### Styles

* **internal:** move identity methods to bottom of error class ([#104](https://github.com/braintrustdata/braintrust-java/issues/104)) ([fd04071](https://github.com/braintrustdata/braintrust-java/commit/fd04071cbeb2abb04310bd4389279dbaadb9a302))
* **internal:** reduce verbosity of identity methods ([#103](https://github.com/braintrustdata/braintrust-java/issues/103)) ([f09c5a0](https://github.com/braintrustdata/braintrust-java/commit/f09c5a01a41e464796e781e9923a96f501786242))

## 0.7.0 (2024-10-01)

Full Changelog: [v0.6.0...v0.7.0](https://github.com/braintrustdata/braintrust-java/compare/v0.6.0...v0.7.0)

### Features

* add model ProjectScoreCategory ([#42](https://github.com/braintrustdata/braintrust-java/issues/42)) ([1609ae3](https://github.com/braintrustdata/braintrust-java/commit/1609ae37c474698aa6e0d416974a105af25d7df2))
* **api:** deduplication ([#59](https://github.com/braintrustdata/braintrust-java/issues/59)) ([4ba216e](https://github.com/braintrustdata/braintrust-java/commit/4ba216efa54fe650feb52867b47f3ffa8d32d148))
* **api:** manual updates ([#43](https://github.com/braintrustdata/braintrust-java/issues/43)) ([fbe2ed0](https://github.com/braintrustdata/braintrust-java/commit/fbe2ed03ffa376b2ca64225852c9d64b8550a664))
* **api:** manual updates ([#44](https://github.com/braintrustdata/braintrust-java/issues/44)) ([324bff1](https://github.com/braintrustdata/braintrust-java/commit/324bff18fe4bef1ac4e44b3020a45955e06f4571))
* **api:** manual updates ([#45](https://github.com/braintrustdata/braintrust-java/issues/45)) ([ba55a6f](https://github.com/braintrustdata/braintrust-java/commit/ba55a6f59fd1073440db50b3c0ea62e31edb256d))
* **api:** manual updates ([#60](https://github.com/braintrustdata/braintrust-java/issues/60)) ([ce1c596](https://github.com/braintrustdata/braintrust-java/commit/ce1c596d0d09b0c850e14caf503f43d8adfc4eee))
* **api:** manual updates ([#61](https://github.com/braintrustdata/braintrust-java/issues/61)) ([774a260](https://github.com/braintrustdata/braintrust-java/commit/774a2605f5be40d1098a61abfd659cc3239998c0))
* **api:** manual updates ([#62](https://github.com/braintrustdata/braintrust-java/issues/62)) ([349cd21](https://github.com/braintrustdata/braintrust-java/commit/349cd217672cec925651ad7b94e538c80dbafe67))
* **api:** update via SDK Studio ([#39](https://github.com/braintrustdata/braintrust-java/issues/39)) ([d03930e](https://github.com/braintrustdata/braintrust-java/commit/d03930e4f8fe411250bc25c85873ab2ef1a2e9b3))
* **api:** update via SDK Studio ([#40](https://github.com/braintrustdata/braintrust-java/issues/40)) ([8dd13cc](https://github.com/braintrustdata/braintrust-java/commit/8dd13ccebd653af4d69f42179fa69ea13fbf9074))
* **api:** update via SDK Studio ([#41](https://github.com/braintrustdata/braintrust-java/issues/41)) ([50ccd19](https://github.com/braintrustdata/braintrust-java/commit/50ccd1973a6e4e3c1f14c39922bd8a9d77accc5e))
* **api:** update via SDK Studio ([#47](https://github.com/braintrustdata/braintrust-java/issues/47)) ([7f9fe1e](https://github.com/braintrustdata/braintrust-java/commit/7f9fe1ece4d91d680e95aee235192526aa780a3a))
* **api:** update via SDK Studio ([#49](https://github.com/braintrustdata/braintrust-java/issues/49)) ([8a3d6b2](https://github.com/braintrustdata/braintrust-java/commit/8a3d6b2e9f67ebce533c457813fcfd821bd7474b))
* **api:** update via SDK Studio ([#50](https://github.com/braintrustdata/braintrust-java/issues/50)) ([277c229](https://github.com/braintrustdata/braintrust-java/commit/277c2299de6e91310d0f89f764177454746a09be))
* **api:** update via SDK Studio ([#51](https://github.com/braintrustdata/braintrust-java/issues/51)) ([9f851a5](https://github.com/braintrustdata/braintrust-java/commit/9f851a5373bbea0a783575f9b8e95b3482d6e8b9))
* **api:** update via SDK Studio ([#52](https://github.com/braintrustdata/braintrust-java/issues/52)) ([4e6ba2b](https://github.com/braintrustdata/braintrust-java/commit/4e6ba2b6238dded244fbf5f59e44f83908fc350a))
* **api:** update via SDK Studio ([#53](https://github.com/braintrustdata/braintrust-java/issues/53)) ([338bd4d](https://github.com/braintrustdata/braintrust-java/commit/338bd4d9c0ad0c6ce1f4ac9e6c288a8250e12ff8))
* **api:** update via SDK Studio ([#54](https://github.com/braintrustdata/braintrust-java/issues/54)) ([9c103d7](https://github.com/braintrustdata/braintrust-java/commit/9c103d758ea864a8df8dd3e7389bda9a221f4163))
* **api:** update via SDK Studio ([#55](https://github.com/braintrustdata/braintrust-java/issues/55)) ([af97a69](https://github.com/braintrustdata/braintrust-java/commit/af97a6942e641231ebb9665998dea3e9e6aef3dc))
* **api:** update via SDK Studio ([#56](https://github.com/braintrustdata/braintrust-java/issues/56)) ([11c77ae](https://github.com/braintrustdata/braintrust-java/commit/11c77aed6dcd9c82eeffb1999f2a01649ba15506))


### Bug Fixes

* **api:** fix go build ([#58](https://github.com/braintrustdata/braintrust-java/issues/58)) ([ae79bfb](https://github.com/braintrustdata/braintrust-java/commit/ae79bfb8cb67d020b3ef4cec208bbe805628abed))
* **internal:** fix issues with imports and categories ([faab28a](https://github.com/braintrustdata/braintrust-java/commit/faab28acaf11c172d63ea083624eabf31f2cccad))


### Chores

* **ci:** bump prism mock server version ([#46](https://github.com/braintrustdata/braintrust-java/issues/46)) ([e6e0133](https://github.com/braintrustdata/braintrust-java/commit/e6e01338a9642fff75a6513fb02091ee0756a7e8))
* **internal:** codegen related update ([#48](https://github.com/braintrustdata/braintrust-java/issues/48)) ([6edf919](https://github.com/braintrustdata/braintrust-java/commit/6edf9196f11cbdafdc50876179584bc16d602388))
* **internal:** codegen related update ([#57](https://github.com/braintrustdata/braintrust-java/issues/57)) ([5af784d](https://github.com/braintrustdata/braintrust-java/commit/5af784d555bffe9384084c39c2d84b0d8cd11369))
* update SDK settings ([#37](https://github.com/braintrustdata/braintrust-java/issues/37)) ([2cc773b](https://github.com/braintrustdata/braintrust-java/commit/2cc773b2fbab5fb6c29f5c6b96c04bdef21c2880))

## 0.6.0 (2024-07-23)

Full Changelog: [v0.5.0...v0.6.0](https://github.com/braintrustdata/braintrust-java/compare/v0.5.0...v0.6.0)

### Features

* **api:** update via SDK Studio ([#29](https://github.com/braintrustdata/braintrust-java/issues/29)) ([840638a](https://github.com/braintrustdata/braintrust-java/commit/840638a44afae4963d7041895c77a49013f39e8a))
* **api:** update via SDK Studio ([#31](https://github.com/braintrustdata/braintrust-java/issues/31)) ([126efb6](https://github.com/braintrustdata/braintrust-java/commit/126efb6a148e9a077cff53e58416d14cc5849719))
* **api:** update via SDK Studio ([#32](https://github.com/braintrustdata/braintrust-java/issues/32)) ([6af81bd](https://github.com/braintrustdata/braintrust-java/commit/6af81bdd07524b0ef414f16dd276a28f2857a09b))
* **api:** update via SDK Studio ([#33](https://github.com/braintrustdata/braintrust-java/issues/33)) ([dd12d65](https://github.com/braintrustdata/braintrust-java/commit/dd12d6564cf175c78347a25b3affc8a676d0772c))
* **api:** update via SDK Studio ([#35](https://github.com/braintrustdata/braintrust-java/issues/35)) ([046e559](https://github.com/braintrustdata/braintrust-java/commit/046e559c7a961a0d00090bcce35c05c2694702cc))


### Chores

* **internal:** codegen related update ([#34](https://github.com/braintrustdata/braintrust-java/issues/34)) ([be915fc](https://github.com/braintrustdata/braintrust-java/commit/be915fc03006dc05ad3aafc0333683f35ab2d920))

## 0.5.0 (2024-05-17)

Full Changelog: [v0.4.0...v0.5.0](https://github.com/braintrustdata/braintrust-java/compare/v0.4.0...v0.5.0)

### Features

* **api:** update via SDK Studio ([#27](https://github.com/braintrustdata/braintrust-java/issues/27)) ([c353b7c](https://github.com/braintrustdata/braintrust-java/commit/c353b7c653228759db623634a54694807a883fe6))


### Chores

* **internal:** version bump ([#25](https://github.com/braintrustdata/braintrust-java/issues/25)) ([cdc20fe](https://github.com/braintrustdata/braintrust-java/commit/cdc20fea2f8ee2614bb4303687ba4a8964c340fc))

## 0.4.0 (2024-05-16)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/braintrustdata/braintrust-java/compare/v0.3.0...v0.4.0)

### Features

* **api:** update via SDK Studio ([#20](https://github.com/braintrustdata/braintrust-java/issues/20)) ([b90b1c7](https://github.com/braintrustdata/braintrust-java/commit/b90b1c7a1f0a7bcdac53423ec83b9a56f1bf8c81))
* **api:** update via SDK Studio ([#22](https://github.com/braintrustdata/braintrust-java/issues/22)) ([e19ada2](https://github.com/braintrustdata/braintrust-java/commit/e19ada2c4d3c0920a49371ff0a7d39b996934c24))
* **api:** update via SDK Studio ([#23](https://github.com/braintrustdata/braintrust-java/issues/23)) ([fad58eb](https://github.com/braintrustdata/braintrust-java/commit/fad58ebca24090a55895ae186194949f2637b425))

## 0.3.0 (2024-05-10)

Full Changelog: [v0.2.0...v0.3.0](https://github.com/braintrustdata/braintrust-java/compare/v0.2.0...v0.3.0)

### Features

* **api:** update via SDK Studio ([#11](https://github.com/braintrustdata/braintrust-java/issues/11)) ([e7431bf](https://github.com/braintrustdata/braintrust-java/commit/e7431bfb36d8e9bbd967f893648c7b4013468a0f))
* **api:** update via SDK Studio ([#12](https://github.com/braintrustdata/braintrust-java/issues/12)) ([3dee163](https://github.com/braintrustdata/braintrust-java/commit/3dee1631b3b40ccdfc4727f157d661f7f86e854c))
* **api:** update via SDK Studio ([#13](https://github.com/braintrustdata/braintrust-java/issues/13)) ([943833b](https://github.com/braintrustdata/braintrust-java/commit/943833b1f7d71ad9abad66ed6a9d99f589a3c88a))
* **api:** update via SDK Studio ([#14](https://github.com/braintrustdata/braintrust-java/issues/14)) ([eefe809](https://github.com/braintrustdata/braintrust-java/commit/eefe809f17c80c40c1c2dc92fec19bf0dd84ccdf))
* **api:** update via SDK Studio ([#15](https://github.com/braintrustdata/braintrust-java/issues/15)) ([34977ad](https://github.com/braintrustdata/braintrust-java/commit/34977add39d13c775360149efd2345717f414447))
* **api:** update via SDK Studio ([#16](https://github.com/braintrustdata/braintrust-java/issues/16)) ([c01130d](https://github.com/braintrustdata/braintrust-java/commit/c01130dad248533e0b22a60684d6d3d7b89aed1d))
* **api:** update via SDK Studio ([#17](https://github.com/braintrustdata/braintrust-java/issues/17)) ([1789858](https://github.com/braintrustdata/braintrust-java/commit/17898586f47d312746d8bed4415c866b71124845))
* **api:** update via SDK Studio ([#18](https://github.com/braintrustdata/braintrust-java/issues/18)) ([2472bdc](https://github.com/braintrustdata/braintrust-java/commit/2472bdc0b50ee16530887ffd8de34f7fca8f23d7))
* **api:** update via SDK Studio ([#9](https://github.com/braintrustdata/braintrust-java/issues/9)) ([637f325](https://github.com/braintrustdata/braintrust-java/commit/637f3253e6e236eacceb6a99d07180822cf01235))

## 0.2.0 (2024-02-04)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/braintrustdata/braintrust-java/compare/v0.1.0...v0.2.0)

### Features

* OpenAPI spec update ([#3](https://github.com/braintrustdata/braintrust-java/issues/3)) ([bb49155](https://github.com/braintrustdata/braintrust-java/commit/bb49155cd813dcabc7cf96217e10e7e875eae12b))

## 0.1.0 (2024-02-03)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/braintrustdata/braintrust-java/compare/v0.0.1...v0.1.0)

### Features

* Add initial Stainless SDK ([520f7de](https://github.com/braintrustdata/braintrust-java/commit/520f7de5a7a6cf46aba5d0ab537b783dc7594a4b))
* create default branch ([3c5a726](https://github.com/braintrustdata/braintrust-java/commit/3c5a726a0c9b8801d44955b94d3e4b4f565b684b))
* OpenAPI spec update ([#1](https://github.com/braintrustdata/braintrust-java/issues/1)) ([e26d471](https://github.com/braintrustdata/braintrust-java/commit/e26d4714aba88e9b88c326ccebcffcf57a58ad28))

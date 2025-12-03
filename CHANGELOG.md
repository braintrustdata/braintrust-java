# Changelog

## 0.10.0 (2025-12-03)

Full Changelog: [v0.9.0...v0.10.0](https://github.com/braintrustdata/braintrust-java/compare/v0.9.0...v0.10.0)

### ⚠ BREAKING CHANGES

* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* add retryable exception ([ad8114f](https://github.com/braintrustdata/braintrust-java/commit/ad8114f1410bdf0b8de7d97803ee1567256beb11))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([0d82daf](https://github.com/braintrustdata/braintrust-java/commit/0d82dafca840d9bab25d431f90bf624161f657d5))
* **client:** add a `withOptions` method ([1da1cfa](https://github.com/braintrustdata/braintrust-java/commit/1da1cfac2d57ac0c4619888357cad8bd8ad8b55a))
* **client:** add https config options ([0ae6f5d](https://github.com/braintrustdata/braintrust-java/commit/0ae6f5d5c5d0236d95f801afe0f648021c9f4c27))
* **client:** allow configuring env via system properties ([bbca12c](https://github.com/braintrustdata/braintrust-java/commit/bbca12cb7c4c9a3b4914c31c1e3767ee944c9f6b))
* **client:** allow providing some params positionally ([5d14bd0](https://github.com/braintrustdata/braintrust-java/commit/5d14bd085513672de3d1c064e2db919b5f0bffa2))
* **client:** ensure compat with proguard ([cf76b62](https://github.com/braintrustdata/braintrust-java/commit/cf76b62a5d08699560aada21ebbe26d809a2a87e))
* **client:** expose sleeper option ([0cf2fec](https://github.com/braintrustdata/braintrust-java/commit/0cf2fec7e371018483fa266379d854fc0a461c05))
* **client:** extract auto pagination to shared classes ([42ec597](https://github.com/braintrustdata/braintrust-java/commit/42ec597072a9392a0a8fadf99bdf228960a66e37))
* **client:** implement per-endpoint base URL support ([4610a9c](https://github.com/braintrustdata/braintrust-java/commit/4610a9cfca70a2b0567c952044434739beb591cd))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([755910d](https://github.com/braintrustdata/braintrust-java/commit/755910da108b3010293d0d84bfc0e2696796448a))
* **ci:** use java-version 21 for publish step ([f69d0fe](https://github.com/braintrustdata/braintrust-java/commit/f69d0fed4cf2ae0119e0bcf84503782208de89a0))
* **client:** accidental mutability of some classes ([641c2dc](https://github.com/braintrustdata/braintrust-java/commit/641c2dc41ddbc04b225e944033fedb5f2efa7d02))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([e817e93](https://github.com/braintrustdata/braintrust-java/commit/e817e93b721d4bdbc4fcbf50c5e6dd019e1d6d1d))
* **client:** cancel okhttp call when future cancelled ([4e9004a](https://github.com/braintrustdata/braintrust-java/commit/4e9004a568ad7c4309f30995df9bb7514d12ded7))
* **client:** deserialization of empty objects ([599e59c](https://github.com/braintrustdata/braintrust-java/commit/599e59c37526f17fb2813776f35bf10ed7d176f9))
* **client:** don't close client on `withOptions` usage when original is gc'd ([76d0366](https://github.com/braintrustdata/braintrust-java/commit/76d0366cca717ebf63a425cd6674b933b31519c9))
* **client:** ensure error handling always occurs ([7f3b3e0](https://github.com/braintrustdata/braintrust-java/commit/7f3b3e052acb0e5053e3d470b9a67e226252e488))
* **client:** ensure single timer is created per client ([0cf2fec](https://github.com/braintrustdata/braintrust-java/commit/0cf2fec7e371018483fa266379d854fc0a461c05))
* **client:** incorrect `getPackageVersion` impl ([48913a4](https://github.com/braintrustdata/braintrust-java/commit/48913a4f26fae541609b186470f5e4d21a5892b3))
* **client:** multi-value header serialization ([84f72e2](https://github.com/braintrustdata/braintrust-java/commit/84f72e20dea2803431834f698337574545c1ab29))
* **client:** r8 support ([4796a86](https://github.com/braintrustdata/braintrust-java/commit/4796a86bef99bc10c8db95c0f8eae469542dbdcb))
* **client:** remove `@MustBeClosed` for future returning methods ([fd77b27](https://github.com/braintrustdata/braintrust-java/commit/fd77b2799b7c290451a1fdc2cb3bde9970c8ccc8))
* fix casing issue ([89a22c7](https://github.com/braintrustdata/braintrust-java/commit/89a22c7ada67d638f3c3a95b9b5dc83a57d6436c))
* update singularization rules ([ed3c3b2](https://github.com/braintrustdata/braintrust-java/commit/ed3c3b22c536f4fdc470eca6ed3129af7e4176c7))


### Performance Improvements

* **internal:** make formatting faster ([12585ed](https://github.com/braintrustdata/braintrust-java/commit/12585ed0aa09ac429ba618d7efb82d18c556bdc0))


### Chores

* **ci:** add build job ([72ca2fc](https://github.com/braintrustdata/braintrust-java/commit/72ca2fc6ecb8aeca739eb3c7e2c8364bf9b13431))
* **ci:** bump `actions/setup-java` to v4 ([a5b0e85](https://github.com/braintrustdata/braintrust-java/commit/a5b0e85efaf25619a2f027bc6ba26fded780c78d))
* **ci:** enable for pull requests ([40d994c](https://github.com/braintrustdata/braintrust-java/commit/40d994c4a4deb433bb789f085a77a3e98bab9357))
* **ci:** ensure docs generation always succeeds ([067e7c8](https://github.com/braintrustdata/braintrust-java/commit/067e7c85b66f03fe03432bd8f56f5b9f752568d4))
* **ci:** only run for pushes and fork pull requests ([ed7f8d9](https://github.com/braintrustdata/braintrust-java/commit/ed7f8d9b135466d13af8d2a504446d9116e87df4))
* **ci:** only use depot for staging repos ([e4dbfbc](https://github.com/braintrustdata/braintrust-java/commit/e4dbfbc0c747acdef7625c3a9f5c8a90411ad8c5))
* **ci:** reduce log noise ([57adf59](https://github.com/braintrustdata/braintrust-java/commit/57adf598e9d61a5d2358cedb6153fdeb1cc4d1ff))
* **client:** refactor closing / shutdown ([d72b3c9](https://github.com/braintrustdata/braintrust-java/commit/d72b3c9e7b16775bfad37b6041b1fc2ba8fc4de7))
* **docs:** grammar improvements ([bac039c](https://github.com/braintrustdata/braintrust-java/commit/bac039cbe2257071de867bd0111c9c1979dedc25))
* **example:** fix run example comment ([3f434c4](https://github.com/braintrustdata/braintrust-java/commit/3f434c47346d6a3eeee86bc55fa516d9f4e73d49))
* improve formatter performance ([7e03e85](https://github.com/braintrustdata/braintrust-java/commit/7e03e8533c820200ddfe9d4d39ba0d9bc533f4b8))
* improve formatter performance ([b6e41d0](https://github.com/braintrustdata/braintrust-java/commit/b6e41d05764a88105cee99bd26d17eb60f80352b))
* increase max gradle JVM heap to 8GB ([e88d096](https://github.com/braintrustdata/braintrust-java/commit/e88d096c45bf5a8b192aa25290bcefa1b98105c6))
* **internal:** add async lock helper ([62dce85](https://github.com/braintrustdata/braintrust-java/commit/62dce854fa19a3c1a53f881e95f4d625f7cbaa54))
* **internal:** allow running specific example from cli ([ff998ed](https://github.com/braintrustdata/braintrust-java/commit/ff998ed099c02f1340558bd274685a7d6273873c))
* **internal:** bump ci test timeout ([c823880](https://github.com/braintrustdata/braintrust-java/commit/c8238804faed172d1a6ab5678287e840631b4bd2))
* **internal:** codegen related update ([cd321c9](https://github.com/braintrustdata/braintrust-java/commit/cd321c953fd40a9ad9b4acd2c6394ed08afc78eb))
* **internal:** codegen related update ([2ed652b](https://github.com/braintrustdata/braintrust-java/commit/2ed652b7ce471d4a551e391a14c97bf5a10e4a2b))
* **internal:** codegen related update ([1e2fa56](https://github.com/braintrustdata/braintrust-java/commit/1e2fa560ec11e9e31e2d2328cd8dffa027c20f4a))
* **internal:** codegen related update ([f28bc60](https://github.com/braintrustdata/braintrust-java/commit/f28bc603c8009ea98477ede33c8a87ea12b8bb93))
* **internal:** dynamically determine included projects ([9fcff68](https://github.com/braintrustdata/braintrust-java/commit/9fcff686b6ca947d06f80eeaff88174ac4aa6bda))
* **internal:** java 17 -&gt; 21 on ci ([ce64b45](https://github.com/braintrustdata/braintrust-java/commit/ce64b45664323ae4d427aadae817c2178be94b5a))
* **internal:** reduce proguard ci logging ([4d23bb8](https://github.com/braintrustdata/braintrust-java/commit/4d23bb89a38926be3620b70f048526ce30a05742))
* **internal:** refactor delegating from client to options ([8b05411](https://github.com/braintrustdata/braintrust-java/commit/8b054110bd40910f22f52ec943cedc2e6dc5ecb8))
* **internal:** remove flaky `-Xbackend-threads=0` option ([3b5c63c](https://github.com/braintrustdata/braintrust-java/commit/3b5c63c53cf8b742f151bbb8429322b36ac84a6a))
* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([bbd6ab6](https://github.com/braintrustdata/braintrust-java/commit/bbd6ab68df9cdce2607548f7c8b2e6a288ed94a8))
* **internal:** support passing arguments to test script ([26ca502](https://github.com/braintrustdata/braintrust-java/commit/26ca502a788e989316c314a8a204a9d5531d7942))
* **internal:** support running formatters directly ([1bfd53a](https://github.com/braintrustdata/braintrust-java/commit/1bfd53a5fe245df0acb8ebc0b39b88ff146e8961))
* **internal:** update comment in script ([fb33197](https://github.com/braintrustdata/braintrust-java/commit/fb331975009e27f40c13e448d90ec23b0f090669))
* **internal:** update java toolchain ([f9f4254](https://github.com/braintrustdata/braintrust-java/commit/f9f4254689cae85a734c79c0cf25f283163b6382))
* remove memory upper bound from publishing step ([d8ca7a9](https://github.com/braintrustdata/braintrust-java/commit/d8ca7a9e64d50078c399d9d7552a3d2c14df8a40))
* update @stainless-api/prism-cli to v5.15.0 ([7138c31](https://github.com/braintrustdata/braintrust-java/commit/7138c31970ba385cf1548e63af3746c61872a256))


### Documentation

* fix missing readme comment ([d1346c2](https://github.com/braintrustdata/braintrust-java/commit/d1346c2f1c8be9157d5e77d7db8a20b746b933e3))
* more code comments ([cba7926](https://github.com/braintrustdata/braintrust-java/commit/cba79267f1c5e2a82b728fec6e44709d9387bd92))
* remove `$` for better copy-pasteabality ([c162005](https://github.com/braintrustdata/braintrust-java/commit/c162005e4957239975573760d8e07cdb0e0b851f))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([1dc2b4d](https://github.com/braintrustdata/braintrust-java/commit/1dc2b4d4f57bab9408f18407c877569540a6e7f0))

## 0.9.0 (2025-04-23)

Full Changelog: [v0.8.0...v0.9.0](https://github.com/braintrustdata/braintrust-java/compare/v0.8.0...v0.9.0)

### ⚠ BREAKING CHANGES

* **client:** refactor exception structure and methods ([#164](https://github.com/braintrustdata/braintrust-java/issues/164))
* **client:** **Migration:** Previously you would access error JSON on an exception via `exception.error()._additionalProperties()`, which would return `Map<String, JsonValue>`. Now you would access this via `exception.body()`, which returns `JsonValue`. You should no longer assume that the returned error JSON is an object. You can check via `exception.body().asObject()`.

### Features

* **client:** add enum validation method ([7fe60b3](https://github.com/braintrustdata/braintrust-java/commit/7fe60b33c4097370f473c30564fccb8ce55e062a))
* **client:** expose request body setter and getter ([#178](https://github.com/braintrustdata/braintrust-java/issues/178)) ([a36c0b6](https://github.com/braintrustdata/braintrust-java/commit/a36c0b633511abc41164b82429da85bd0810f732))
* **client:** make datetime deserialization more lenient ([#177](https://github.com/braintrustdata/braintrust-java/issues/177)) ([a65987d](https://github.com/braintrustdata/braintrust-java/commit/a65987da85db749c526a110d7e624f38becf8fff))
* **client:** make pagination robust to missing data ([445e30e](https://github.com/braintrustdata/braintrust-java/commit/445e30ebac1dd50e5cfc22aaf1ef9927fc13796f))
* **client:** make union deserialization more robust ([#176](https://github.com/braintrustdata/braintrust-java/issues/176)) ([7fe60b3](https://github.com/braintrustdata/braintrust-java/commit/7fe60b33c4097370f473c30564fccb8ce55e062a))
* **client:** support a lower jackson version ([#170](https://github.com/braintrustdata/braintrust-java/issues/170)) ([803e291](https://github.com/braintrustdata/braintrust-java/commit/803e2917444885e37e3148499f875ef59824f3c2))
* **client:** support setting base URL via env var ([85b334a](https://github.com/braintrustdata/braintrust-java/commit/85b334ae4ce795835275970643f930468753d57a))
* **client:** throw on incompatible jackson version ([803e291](https://github.com/braintrustdata/braintrust-java/commit/803e2917444885e37e3148499f875ef59824f3c2))


### Bug Fixes

* **client:** bump to better jackson version ([a2f69b5](https://github.com/braintrustdata/braintrust-java/commit/a2f69b5a6126c7c8ca17030bea1c0f660183f77f))
* **client:** don't call `validate()` during deserialization if we don't have to ([#173](https://github.com/braintrustdata/braintrust-java/issues/173)) ([e71f053](https://github.com/braintrustdata/braintrust-java/commit/e71f0530ae5462de1089e41b3fefaaf18c140581))
* **client:** limit json deserialization coercion ([#174](https://github.com/braintrustdata/braintrust-java/issues/174)) ([63e2b2c](https://github.com/braintrustdata/braintrust-java/commit/63e2b2ccb213bf215441d4c74dd4aa43f3697481))
* **client:** map deserialization bug ([2a52b9f](https://github.com/braintrustdata/braintrust-java/commit/2a52b9fd35ea33391dad9f3e3098e5eb2afcca0d))
* **client:** return `Optional&lt;T&gt;` instead of `Optional<? extends T>` ([#182](https://github.com/braintrustdata/braintrust-java/issues/182)) ([e3d5b19](https://github.com/braintrustdata/braintrust-java/commit/e3d5b190c14a9f398bfed2b8df461d01b411c1f3))
* **client:** support kotlin 1.8 runtime ([#161](https://github.com/braintrustdata/braintrust-java/issues/161)) ([c9856ed](https://github.com/braintrustdata/braintrust-java/commit/c9856ed81fdfa4f17bdb96d66e45adc2751d4846))
* pluralize `list` response variables ([#175](https://github.com/braintrustdata/braintrust-java/issues/175)) ([8d7b939](https://github.com/braintrustdata/braintrust-java/commit/8d7b939c590714e4344ea80d16b06414154cb691))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#180](https://github.com/braintrustdata/braintrust-java/issues/180)) ([49c0c0a](https://github.com/braintrustdata/braintrust-java/commit/49c0c0af714e2770fe35456a046aff3a1d6759d8))
* **internal:** improve compilation+test speed ([8efd75a](https://github.com/braintrustdata/braintrust-java/commit/8efd75a6d5b017099440e5dbb0b97d2b77d56c13))


### Chores

* **ci:** add timeout thresholds for CI jobs ([15222f8](https://github.com/braintrustdata/braintrust-java/commit/15222f8192f329d22b029a5839d56899d2fc8690))
* **client:** refactor exception structure and methods ([#164](https://github.com/braintrustdata/braintrust-java/issues/164)) ([8463834](https://github.com/braintrustdata/braintrust-java/commit/8463834733a95f1afc905f3cfa74793b458e9a5a))
* **client:** remove unnecessary json state from some query param classes ([7fe60b3](https://github.com/braintrustdata/braintrust-java/commit/7fe60b33c4097370f473c30564fccb8ce55e062a))
* **internal:** add invalid json deserialization tests ([7fe60b3](https://github.com/braintrustdata/braintrust-java/commit/7fe60b33c4097370f473c30564fccb8ce55e062a))
* **internal:** add json roundtripping tests ([7fe60b3](https://github.com/braintrustdata/braintrust-java/commit/7fe60b33c4097370f473c30564fccb8ce55e062a))
* **internal:** codegen related update ([732dd76](https://github.com/braintrustdata/braintrust-java/commit/732dd768a9e4f048edf415d697e89c36551414d8))
* **internal:** codegen related update ([#159](https://github.com/braintrustdata/braintrust-java/issues/159)) ([45cca50](https://github.com/braintrustdata/braintrust-java/commit/45cca506a7c0c1a165c0d4e54bf1950d4256d3a2))
* **internal:** codegen related update ([#162](https://github.com/braintrustdata/braintrust-java/issues/162)) ([a490f5f](https://github.com/braintrustdata/braintrust-java/commit/a490f5fb5977d5347814c0d29a022468c8793e65))
* **internal:** codegen related update ([#163](https://github.com/braintrustdata/braintrust-java/issues/163)) ([140986d](https://github.com/braintrustdata/braintrust-java/commit/140986d47b0e2f62d5ba3b84d459784e683fcda8))
* **internal:** codegen related update ([#179](https://github.com/braintrustdata/braintrust-java/issues/179)) ([d32e7e5](https://github.com/braintrustdata/braintrust-java/commit/d32e7e5d3343041c4404178e0ebf48efd02ddc22))
* **internal:** delete unused methods and annotations ([#171](https://github.com/braintrustdata/braintrust-java/issues/171)) ([2a52b9f](https://github.com/braintrustdata/braintrust-java/commit/2a52b9fd35ea33391dad9f3e3098e5eb2afcca0d))
* **internal:** expand CI branch coverage ([6e596e4](https://github.com/braintrustdata/braintrust-java/commit/6e596e46185da32341ce8d186a96336f26b2cd56))
* **internal:** fix example formatting ([#166](https://github.com/braintrustdata/braintrust-java/issues/166)) ([3ce1a02](https://github.com/braintrustdata/braintrust-java/commit/3ce1a023b3013ffeb9fa9651b42ef3ba5a11fc6e))
* **internal:** generate more tests ([e7cdefc](https://github.com/braintrustdata/braintrust-java/commit/e7cdefcd06a55332f6e7ef6a6b729f33207a7834))
* **internal:** make multipart assertions more robust ([6d40318](https://github.com/braintrustdata/braintrust-java/commit/6d403189bb05ab3934586907f2cb8f093e65c805))
* **internal:** reduce CI branch coverage ([491a2ae](https://github.com/braintrustdata/braintrust-java/commit/491a2aeecc8b972efec17ec3e62e2848d1020158))
* **internal:** reformat some tests ([#160](https://github.com/braintrustdata/braintrust-java/issues/160)) ([e7cdefc](https://github.com/braintrustdata/braintrust-java/commit/e7cdefcd06a55332f6e7ef6a6b729f33207a7834))
* **internal:** remove unnecessary `assertNotNull` calls ([6d40318](https://github.com/braintrustdata/braintrust-java/commit/6d403189bb05ab3934586907f2cb8f093e65c805))
* **internal:** remove unnecessary import ([#167](https://github.com/braintrustdata/braintrust-java/issues/167)) ([03d8ca9](https://github.com/braintrustdata/braintrust-java/commit/03d8ca931ab7599f98cef22d0b43a39b0d002f65))
* **internal:** swap from `Builder().from(...)` to `toBuilder()` ([#172](https://github.com/braintrustdata/braintrust-java/issues/172)) ([d15ef50](https://github.com/braintrustdata/braintrust-java/commit/d15ef50ea2a826653c7b2ddebabefadc60b1864d))
* **internal:** swap from `getNullable` to `getOptional` ([#181](https://github.com/braintrustdata/braintrust-java/issues/181)) ([2fca092](https://github.com/braintrustdata/braintrust-java/commit/2fca092faa8a4679ff792bfd746f9638a7187ba3))
* **internal:** version bump ([#157](https://github.com/braintrustdata/braintrust-java/issues/157)) ([0492bdd](https://github.com/braintrustdata/braintrust-java/commit/0492bddf28ecfea9a5c901e78ff07918a265f6f6))


### Documentation

* add comments for page methods ([445e30e](https://github.com/braintrustdata/braintrust-java/commit/445e30ebac1dd50e5cfc22aaf1ef9927fc13796f))
* add comments to `JsonField` classes ([e3d5b19](https://github.com/braintrustdata/braintrust-java/commit/e3d5b190c14a9f398bfed2b8df461d01b411c1f3))
* **client:** update jackson compat error message ([6039ca5](https://github.com/braintrustdata/braintrust-java/commit/6039ca545cba51e71e02f4db3b26a0964f3bd522))
* document how to forcibly omit required field ([e797de1](https://github.com/braintrustdata/braintrust-java/commit/e797de1a9185adb1dab8f9670fd2d8e4b03e2142))
* explain http client customization ([1388be4](https://github.com/braintrustdata/braintrust-java/commit/1388be42ac426c5d1b934712302c6acecf20c885))
* explain jackson compat in readme ([8fd288d](https://github.com/braintrustdata/braintrust-java/commit/8fd288d5ef4d5053f20b7db81bde980a465d996b))
* minor readme tweak ([#169](https://github.com/braintrustdata/braintrust-java/issues/169)) ([4154acd](https://github.com/braintrustdata/braintrust-java/commit/4154acdf5be17f6b8c3ec26ccf5ca25b61c75404))
* refine comments on multipart params ([#165](https://github.com/braintrustdata/braintrust-java/issues/165)) ([6d40318](https://github.com/braintrustdata/braintrust-java/commit/6d403189bb05ab3934586907f2cb8f093e65c805))
* swap examples used in readme ([#183](https://github.com/braintrustdata/braintrust-java/issues/183)) ([e797de1](https://github.com/braintrustdata/braintrust-java/commit/e797de1a9185adb1dab8f9670fd2d8e4b03e2142))
* update readme exception docs ([#168](https://github.com/braintrustdata/braintrust-java/issues/168)) ([39e01a6](https://github.com/braintrustdata/braintrust-java/commit/39e01a6fb2b29e1c8806ec27191cfef234b012d9))


### Refactors

* **client:** deduplicate page response classes ([445e30e](https://github.com/braintrustdata/braintrust-java/commit/445e30ebac1dd50e5cfc22aaf1ef9927fc13796f))
* **client:** migrate pages to builder pattern ([b61888c](https://github.com/braintrustdata/braintrust-java/commit/b61888c0b3080b0ed42f8179a9fc772333cb0d9c))

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

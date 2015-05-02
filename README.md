# sbt-assets-example

## What contains this example?

This example shows the following sbt assets plugins:
* [sbt-assets-concat](https://github.com/ssachtleben/sbt-assets-concat)
* [sbt-assets-define](https://github.com/ssachtleben/sbt-assets-define)
* [sbt-assets-filter](https://github.com/ssachtleben/sbt-assets-filter)
* [sbt-assets-handlebars](https://github.com/ssachtleben/sbt-assets-handlebars)

## Why these plugins?

I have a private project which is a single page application. The templates should be compiled with handlebars. I wrote a custom require code which only has 50 lines (I dont need the requirejs lib with over 1000 lines of code) and each app file should be wrapped in a define block. This project shows each sbt-plugin in action:

## sbt-assets-handlebars

This plugin precompiles the handlebars templates to javascript code.

## sbt-assets-define

This plugin wraps specific compiled coffeescript files and precompiled handlebar templates in a define block.

## sbt-assets-filter

This plugin cleans up all coffeescript, less, handlebars and other source files.

## sbt-assets-concat

This plugin concats the require coffeescript, the compiled coffeescript and handlebar files which are wrapped in define blocks.

## What next?

Minify of the code is still in develop ...

&copy; Sebastian Sachtleben, 2015

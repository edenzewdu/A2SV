<!DOCTYPE html>
<html class="light" style="color-scheme: light;" lang="en"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8"><meta name="viewport" content="width=device-width"><meta charset="utf-8"><script type="text/javascript" async="" src="Fizz%20Buzz%20-%20LeetCode_files/js"></script><script type="text/javascript" async="" src="Fizz%20Buzz%20-%20LeetCode_files/gtm.js"></script><script>!function(){try {var d=document.documentElement.classList;d.remove('light','dark');var e=localStorage.getItem('lc-dark-side');if("system"===e||(!e&&true)){var t="(prefers-color-scheme: dark)",m=window.matchMedia(t);m.media!==t||m.matches?d.add('dark'):d.add('light')}else if(e) d.add(e)}catch(e){}}()</script><title>Fizz Buzz - LeetCode</title><meta name="description" content="Fizz Buzz - Given an integer n, return a string array answer (1-indexed) where:

 * answer[i] == &quot;FizzBuzz&quot; if i is divisible by 3 and 5.
 * answer[i] == &quot;Fizz&quot; if i is divisible by 3.
 * answer[i] == &quot;Buzz&quot; if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.

&nbsp;

Example 1:

Input: n = 3
Output: [&quot;1&quot;,&quot;2&quot;,&quot;Fizz&quot;]


Example 2:

Input: n = 5
Output: [&quot;1&quot;,&quot;2&quot;,&quot;Fizz&quot;,&quot;4&quot;,&quot;Buzz&quot;]


Example 3:

Input: n = 15
Output: [&quot;1&quot;,&quot;2&quot;,&quot;Fizz&quot;,&quot;4&quot;,&quot;Buzz&quot;,&quot;Fizz&quot;,&quot;7&quot;,&quot;8&quot;,&quot;Fizz&quot;,&quot;Buzz&quot;,&quot;11&quot;,&quot;Fizz&quot;,&quot;13&quot;,&quot;14&quot;,&quot;FizzBuzz&quot;]


&nbsp;

Constraints:

 * 1 &lt;= n &lt;= 104"><meta property="og:title" content="Fizz Buzz - LeetCode"><meta property="og:description" content="Fizz Buzz - Given an integer n, return a string array answer (1-indexed) where:

 * answer[i] == &quot;FizzBuzz&quot; if i is divisible by 3 and 5.
 * answer[i] == &quot;Fizz&quot; if i is divisible by 3.
 * answer[i] == &quot;Buzz&quot; if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.

&nbsp;

Example 1:

Input: n = 3
Output: [&quot;1&quot;,&quot;2&quot;,&quot;Fizz&quot;]


Example 2:

Input: n = 5
Output: [&quot;1&quot;,&quot;2&quot;,&quot;Fizz&quot;,&quot;4&quot;,&quot;Buzz&quot;]


Example 3:

Input: n = 15
Output: [&quot;1&quot;,&quot;2&quot;,&quot;Fizz&quot;,&quot;4&quot;,&quot;Buzz&quot;,&quot;Fizz&quot;,&quot;7&quot;,&quot;8&quot;,&quot;Fizz&quot;,&quot;Buzz&quot;,&quot;11&quot;,&quot;Fizz&quot;,&quot;13&quot;,&quot;14&quot;,&quot;FizzBuzz&quot;]


&nbsp;

Constraints:

 * 1 &lt;= n &lt;= 104"><meta property="og:image" content="https://leetcode.com/static/images/LeetCode_Sharing.png"><meta property="og:url" content="https://leetcode.com/problems/fizz-buzz/description"><meta name="twitter:card" content="summary"><meta name="twitter:site" content="@LeetCode"><meta name="twitter:url" content="https://leetcode.com/problems/fizz-buzz/description"><script type="application/ld+json">{"@context":"https://schema.org","@type":"BreadcrumbList","itemListElement":[{"@type":"ListItem","position":1,"item":{"@id":"https://leetcode.com/problems/fizz-buzz/description","name":"Problem"}},{"@type":"ListItem","position":2,"item":{"@id":"https://leetcode.com/problems/fizz-buzz/discussion","name":"Discussion"}},{"@type":"ListItem","position":3,"item":{"@id":"https://leetcode.com/problems/fizz-buzz/solutions","name":"Solutions"}},{"@type":"ListItem","position":4,"item":{"@id":"https://leetcode.com/problems/fizz-buzz/submissions","name":"Submissions"}}]}</script><meta name="viewport" content="width=device-width"><meta charset="utf-8"><meta name="next-head-count" content="13"><link rel="preload" href="Fizz%20Buzz%20-%20LeetCode_files/56756dde05ceb84a.css" as="style"><link rel="stylesheet" href="Fizz%20Buzz%20-%20LeetCode_files/56756dde05ceb84a.css" data-n-g=""><link rel="preload" href="Fizz%20Buzz%20-%20LeetCode_files/480870a3fce0d85a.css" as="style"><link rel="stylesheet" href="Fizz%20Buzz%20-%20LeetCode_files/480870a3fce0d85a.css" data-n-p=""><link rel="preload" href="Fizz%20Buzz%20-%20LeetCode_files/2c45763ade2696d7.css" as="style"><link rel="stylesheet" href="Fizz%20Buzz%20-%20LeetCode_files/2c45763ade2696d7.css" data-n-p=""><noscript data-n-css=""></noscript><script defer="defer" nomodule="" src="Fizz%20Buzz%20-%20LeetCode_files/polyfills-5cd94c89d3acac5f.js"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/webpack-12527e3ec86f00ec.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/framework-560765ab0625ba27.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/main-fc34d118b74c83c6.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/_app-744f3ac78b783f7e.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/e6848cf3-9e6f363bb4cc35ab.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/4b358913-adf7c06065c94338.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/129-9273e70976d3ce56.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/7081-cd4acaee22e7ea36.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/8498-f7c5665f2f70872f.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/8736-f4b758421d8b1c84.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/4715-1cfe08546cdaa71b.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/3386-3041b240106d1884.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/9131-ba5dbe3098bda80b.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/3774-55e3c3df0ab573c4.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/8764-75c51dbf68058559.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/1613-8cfcc454a887d690.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/6300-67456d61f04c269f.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/930-e60b2a8ff7f1d712.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/4889-f806173a44aad44a.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/1692-f96a1b32d8cbd6f5.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/5518-df81e5e89a41ab95.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/4416-8598478ad00101bb.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/8805-a53ca8d99fd3bb5c.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/7089-61ee9fd491d27b4d.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/3700-3aa1b2eef75d3559.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/7048-45781f9310e6c26e.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/1345-293e1aa181f0e091.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/6817-faaa7b3fb3056822.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/5078-d876a6ceb1514de1.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/5490-6b284a30bbdcf170.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/7027-f1f39341613c9e81.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/7470-3fd13da01b61450b.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/7282-f1fedcb9775a67a1.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/8545-ef4f60cc516c13ec.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/[[...tab]]-0c6a044377f9362b.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/_buildManifest.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/_ssgManifest.js" defer="defer"></script><script src="Fizz%20Buzz%20-%20LeetCode_files/_middlewareManifest.js" defer="defer"></script><style type="text/css">.transform-component-module_wrapper__1_Fgj {
  position: relative;
  width: -moz-fit-content;
  width: fit-content;
  height: -moz-fit-content;
  height: fit-content;
  overflow: hidden;
  -webkit-touch-callout: none; /* iOS Safari */
  -webkit-user-select: none; /* Safari */
  -khtml-user-select: none; /* Konqueror HTML */
  -moz-user-select: none; /* Firefox */
  -ms-user-select: none; /* Internet Explorer/Edge */
  user-select: none;
  margin: 0;
  padding: 0;
}
.transform-component-module_content__2jYgh {
  display: flex;
  flex-wrap: wrap;
  width: -moz-fit-content;
  width: fit-content;
  height: -moz-fit-content;
  height: fit-content;
  margin: 0;
  padding: 0;
  transform-origin: 0% 0%;
}
.transform-component-module_content__2jYgh img {
  pointer-events: none;
}
</style><style id="25225">._30gKN{content:"";display:inline-block;height:0;position:absolute;width:0}</style><style id="48408">._1l1MA pre{background-color:rgba(0,10,32,.03);border-radius:.5rem;color:rgba(38,38,38,.75);font-family:Menlo,sans-serif;font-size:.875rem;line-height:1.25rem;margin-bottom:1rem;margin-top:1rem;padding:1rem;white-space:pre-wrap}.dark ._1l1MA pre{background-color:hsla(0,0%,100%,.07);color:rgba(239,241,246,.75)}._1l1MA pre strong{--tw-text-opacity:1;color:rgb(38 38 38/var(--tw-text-opacity))}.dark ._1l1MA pre strong{--tw-text-opacity:1;color:rgb(255 255 255/var(--tw-text-opacity))}._1l1MA a{--tw-text-opacity:1;color:rgb(0 122 255/var(--tw-text-opacity))}.dark ._1l1MA a{--tw-text-opacity:1;color:rgb(10 132 255/var(--tw-text-opacity))}._1l1MA ul{list-style-type:disc;margin-bottom:1rem;margin-left:1rem;margin-right:1rem}._1l1MA li{margin-bottom:.75rem}._1l1MA p{margin-bottom:1rem}._1l1MA code{background-color:rgba(0,10,32,.03);border-color:rgba(0,0,0,.05);border-radius:5px;border-width:1px;color:rgba(38,38,38,.75);font-family:Menlo,sans-serif;font-size:.75rem;line-height:1rem;padding:.125rem;white-space:pre-wrap}.dark ._1l1MA code{background-color:hsla(0,0%,100%,.07);border-color:rgba(247,250,255,.12);color:rgba(239,241,246,.75)}._1l1MA blockquote{border-color:rgba(0,0,0,.05);border-left-width:4px;color:rgba(38,38,38,.75);padding-left:1rem}.dark ._1l1MA blockquote{border-color:rgba(247,250,255,.12);color:rgba(239,241,246,.75)}.content-example-testcase{--tw-text-opacity:1;color:rgb(38 38 38/var(--tw-text-opacity));font-size:1rem;font-weight:500;line-height:1.5rem;margin-bottom:1rem}.dark .content-example-testcase{--tw-text-opacity:1;color:rgb(255 255 255/var(--tw-text-opacity))}._1l1MA img{height:auto!important;max-width:100%}._1l1MA .zpZd9{font-size:1rem;font-weight:500;line-height:1.5rem;margin-bottom:1rem}._3wq_1 ._1l1MA .zpZd9,._1l1MA .zpZd9{--tw-text-opacity:1;color:rgb(38 38 38/var(--tw-text-opacity))}</style><style id="94150">[contenteditable=true]:empty:before{color:rgba(60,60,67,.3);content:attr(placeholder);display:block}.dark [contenteditable=true]:empty:before{color:rgba(235,235,245,.3)}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-aria-container {
	position: absolute; /* try to hide from window but not from screen readers */
	left:-999em;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* -------------------- IE10 remove auto clear button -------------------- */

::-ms-clear {
	display: none;
}

/* All widgets */
/* I am not a big fan of this rule */
.monaco-editor .editor-widget input {
	color: inherit;
}

/* -------------------- Editor -------------------- */

.monaco-editor {
	position: relative;
	overflow: visible;
	-webkit-text-size-adjust: 100%;
}

/* -------------------- Misc -------------------- */

.monaco-editor .overflow-guard {
	position: relative;
	overflow: hidden;
}

.monaco-editor .view-overlays {
	position: absolute;
	top: 0;
}

/*
.monaco-editor .auto-closed-character {
	opacity: 0.3;
}
*/
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .inputarea {
	min-width: 0;
	min-height: 0;
	margin: 0;
	padding: 0;
	position: absolute;
	outline: none !important;
	resize: none;
	border: none;
	overflow: hidden;
	color: transparent;
	background-color: transparent;
}
/*.monaco-editor .inputarea {
	position: fixed !important;
	width: 800px !important;
	height: 500px !important;
	top: initial !important;
	left: initial !important;
	bottom: 0 !important;
	right: 0 !important;
	color: black !important;
	background: white !important;
	line-height: 15px !important;
	font-size: 14px !important;
}*/
.monaco-editor .inputarea.ime-input {
	z-index: 10;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .margin-view-overlays .line-numbers {
	font-variant-numeric: tabular-nums;
	position: absolute;
	text-align: right;
	display: inline-block;
	vertical-align: middle;
	box-sizing: border-box;
	cursor: default;
	height: 100%;
}

.monaco-editor .relative-current-line-number {
	text-align: left;
	display: inline-block;
	width: 100%;
}

.monaco-editor .margin-view-overlays .line-numbers.lh-odd {
	margin-top: 1px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-mouse-cursor-text {
	cursor: text;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .view-overlays .current-line {
	display: block;
	position: absolute;
	left: 0;
	top: 0;
	box-sizing: border-box;
}

.monaco-editor .margin-view-overlays .current-line {
	display: block;
	position: absolute;
	left: 0;
	top: 0;
	box-sizing: border-box;
}

.monaco-editor .margin-view-overlays .current-line.current-line-margin.current-line-margin-both {
	border-right: 0;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/*
	Keeping name short for faster parsing.
	cdr = core decorations rendering (div)
*/
.monaco-editor .lines-content .cdr {
	position: absolute;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* Arrows */
.monaco-scrollable-element > .scrollbar > .scra {
	cursor: pointer;
	font-size: 11px !important;
}

.monaco-scrollable-element > .visible {
	opacity: 1;

	/* Background rule added for IE9 - to allow clicks on dom node */
	background:rgba(0,0,0,0);

	transition: opacity 100ms linear;
}
.monaco-scrollable-element > .invisible {
	opacity: 0;
	pointer-events: none;
}
.monaco-scrollable-element > .invisible.fade {
	transition: opacity 800ms linear;
}

/* Scrollable Content Inset Shadow */
.monaco-scrollable-element > .shadow {
	position: absolute;
	display: none;
}
.monaco-scrollable-element > .shadow.top {
	display: block;
	top: 0;
	left: 3px;
	height: 3px;
	width: 100%;
}
.monaco-scrollable-element > .shadow.left {
	display: block;
	top: 3px;
	left: 0;
	height: 100%;
	width: 3px;
}
.monaco-scrollable-element > .shadow.top-left-corner {
	display: block;
	top: 0;
	left: 0;
	height: 3px;
	width: 3px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .glyph-margin {
	position: absolute;
	top: 0;
}

/*
	Keeping name short for faster parsing.
	cgmr = core glyph margin rendering (div)
*/
.monaco-editor .margin-view-overlays .cgmr {
	position: absolute;
	display: flex;
	align-items: center;
	justify-content: center;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .lines-content .core-guide {
	position: absolute;
	box-sizing: border-box;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* Uncomment to see lines flashing when they're painted */
/*.monaco-editor .view-lines > .view-line {
	background-color: none;
	animation-name: flash-background;
	animation-duration: 800ms;
}
@keyframes flash-background {
	0%   { background-color: lightgreen; }
	100% { background-color: none }
}*/

.mtkcontrol {
	color: rgb(255, 255, 255) !important;
	background: rgb(150, 0, 0) !important;
}

.monaco-editor.no-user-select .lines-content,
.monaco-editor.no-user-select .view-line,
.monaco-editor.no-user-select .view-lines {
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

.monaco-editor .view-lines {
	white-space: nowrap;
}

.monaco-editor .view-line {
	position: absolute;
	width: 100%;
}

.monaco-editor .mtkz {
	display: inline-block;
}

/* TODO@tokenization bootstrap fix */
/*.monaco-editor .view-line > span > span {
	float: none;
	min-height: inherit;
	margin-left: inherit;
}*/
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .lines-decorations {
	position: absolute;
	top: 0;
	background: white;
}

/*
	Keeping name short for faster parsing.
	cldr = core lines decorations rendering (div)
*/
.monaco-editor .margin-view-overlays .cldr {
	position: absolute;
	height: 100%;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/*
	Keeping name short for faster parsing.
	cmdr = core margin decorations rendering (div)
*/
.monaco-editor .margin-view-overlays .cmdr {
	position: absolute;
	left: 0;
	width: 100%;
	height: 100%;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* START cover the case that slider is visible on mouseover */
.monaco-editor .minimap.slider-mouseover .minimap-slider {
	opacity: 0;
	transition: opacity 100ms linear;
}
.monaco-editor .minimap.slider-mouseover:hover .minimap-slider {
	opacity: 1;
}
.monaco-editor .minimap.slider-mouseover .minimap-slider.active {
	opacity: 1;
}
/* END cover the case that slider is visible on mouseover */

.monaco-editor .minimap-shadow-hidden {
	position: absolute;
	width: 0;
}
.monaco-editor .minimap-shadow-visible {
	position: absolute;
	left: -6px;
	width: 6px;
}
.monaco-editor.no-minimap-shadow .minimap-shadow-visible {
	position: absolute;
	left: -1px;
	width: 1px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .overlayWidgets {
	position: absolute;
	top: 0;
	left:0;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .view-ruler {
	position: absolute;
	top: 0;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .scroll-decoration {
	position: absolute;
	top: 0;
	left: 0;
	height: 6px;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/*
	Keeping name short for faster parsing.
	cslr = core selections layer rendering (div)
*/
.monaco-editor .lines-content .cslr {
	position: absolute;
}

.monaco-editor			.top-left-radius		{ border-top-left-radius: 3px; }
.monaco-editor			.bottom-left-radius		{ border-bottom-left-radius: 3px; }
.monaco-editor			.top-right-radius		{ border-top-right-radius: 3px; }
.monaco-editor			.bottom-right-radius	{ border-bottom-right-radius: 3px; }

.monaco-editor.hc-black .top-left-radius		{ border-top-left-radius: 0; }
.monaco-editor.hc-black .bottom-left-radius		{ border-bottom-left-radius: 0; }
.monaco-editor.hc-black .top-right-radius		{ border-top-right-radius: 0; }
.monaco-editor.hc-black .bottom-right-radius	{ border-bottom-right-radius: 0; }
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .cursors-layer {
	position: absolute;
	top: 0;
}

.monaco-editor .cursors-layer > .cursor {
	position: absolute;
	overflow: hidden;
}

/* -- smooth-caret-animation -- */
.monaco-editor .cursors-layer.cursor-smooth-caret-animation > .cursor {
	transition: all 80ms;
}

/* -- block-outline-style -- */
.monaco-editor .cursors-layer.cursor-block-outline-style > .cursor {
	box-sizing: border-box;
	background: transparent !important;
	border-style: solid;
	border-width: 1px;
}

/* -- underline-style -- */
.monaco-editor .cursors-layer.cursor-underline-style > .cursor {
	border-bottom-width: 2px;
	border-bottom-style: solid;
	background: transparent !important;
	box-sizing: border-box;
}

/* -- underline-thin-style -- */
.monaco-editor .cursors-layer.cursor-underline-thin-style > .cursor {
	border-bottom-width: 1px;
	border-bottom-style: solid;
	background: transparent !important;
	box-sizing: border-box;
}

@keyframes monaco-cursor-smooth {
	0%,
	20% {
		opacity: 1;
	}
	60%,
	100% {
		opacity: 0;
	}
}

@keyframes monaco-cursor-phase {
	0%,
	20% {
		opacity: 1;
	}
	90%,
	100% {
		opacity: 0;
	}
}

@keyframes monaco-cursor-expand {
	0%,
	20% {
		transform: scaleY(1);
	}
	80%,
	100% {
		transform: scaleY(0);
	}
}

.cursor-smooth {
	animation: monaco-cursor-smooth 0.5s ease-in-out 0s 20 alternate;
}

.cursor-phase {
	animation: monaco-cursor-phase 0.5s ease-in-out 0s 20 alternate;
}

.cursor-expand > .cursor {
	animation: monaco-cursor-expand 0.5s ease-in-out 0s 20 alternate;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .bracket-match {
	box-sizing: border-box;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor.vs .dnd-target {
	border-right: 2px dotted black;
	color: white; /* opposite of black */
}
.monaco-editor.vs-dark .dnd-target {
	border-right: 2px dotted #AEAFAD;
	color: #51504f; /* opposite of #AEAFAD */
}
.monaco-editor.hc-black .dnd-target {
	border-right: 2px dotted #fff;
	color: #000; /* opposite of #fff */
}

.monaco-editor.mouse-default .view-lines,
.monaco-editor.vs-dark.mac.mouse-default .view-lines,
.monaco-editor.hc-black.mac.mouse-default .view-lines {
	cursor: default;
}
.monaco-editor.mouse-copy .view-lines,
.monaco-editor.vs-dark.mac.mouse-copy .view-lines,
.monaco-editor.hc-black.mac.mouse-copy .view-lines {
	cursor: copy;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-custom-checkbox {
	margin-left: 2px;
	float: left;
	cursor: pointer;
	overflow: hidden;
	width: 20px;
	height: 20px;
	border-radius: 3px;
	border: 1px solid transparent;
	padding: 1px;
	box-sizing:	border-box;
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

.monaco-custom-checkbox:hover {
	background-color: var(--vscode-inputOption-hoverBackground);
}

.hc-black .monaco-custom-checkbox:hover {
	border: 1px dashed var(--vscode-focusBorder);
}

.hc-black .monaco-custom-checkbox {
	background: none;
}

.hc-black .monaco-custom-checkbox:hover {
	background: none;
}

.monaco-custom-checkbox.monaco-simple-checkbox {
	height: 18px;
	width: 18px;
	border: 1px solid transparent;
	border-radius: 3px;
	margin-right: 9px;
	margin-left: 0px;
	padding: 0px;
	opacity: 1;
	background-size: 16px !important;
}

/* hide check when unchecked */
.monaco-custom-checkbox.monaco-simple-checkbox:not(.checked)::before {
	visibility: hidden;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

:root {
	--sash-size: 4px;
}

.monaco-sash {
	position: absolute;
	z-index: 35;
	touch-action: none;
}

.monaco-sash.disabled {
	pointer-events: none;
}

.monaco-sash.mac.vertical {
	cursor: col-resize;
}

.monaco-sash.vertical.minimum {
	cursor: e-resize;
}

.monaco-sash.vertical.maximum {
	cursor: w-resize;
}

.monaco-sash.mac.horizontal {
	cursor: row-resize;
}

.monaco-sash.horizontal.minimum {
	cursor: s-resize;
}

.monaco-sash.horizontal.maximum {
	cursor: n-resize;
}

.monaco-sash.disabled {
	cursor: default !important;
	pointer-events: none !important;
}

.monaco-sash.vertical {
	cursor: ew-resize;
	top: 0;
	width: var(--sash-size);
	height: 100%;
}

.monaco-sash.horizontal {
	cursor: ns-resize;
	left: 0;
	width: 100%;
	height: var(--sash-size);
}

.monaco-sash:not(.disabled) > .orthogonal-drag-handle {
	content: " ";
	height: calc(var(--sash-size) * 2);
	width: calc(var(--sash-size) * 2);
	z-index: 100;
	display: block;
	cursor: all-scroll;
	position: absolute;
}

.monaco-sash.horizontal.orthogonal-edge-north:not(.disabled)
	> .orthogonal-drag-handle.start,
.monaco-sash.horizontal.orthogonal-edge-south:not(.disabled)
	> .orthogonal-drag-handle.end {
	cursor: nwse-resize;
}

.monaco-sash.horizontal.orthogonal-edge-north:not(.disabled)
	> .orthogonal-drag-handle.end,
.monaco-sash.horizontal.orthogonal-edge-south:not(.disabled)
	> .orthogonal-drag-handle.start {
	cursor: nesw-resize;
}

.monaco-sash.vertical > .orthogonal-drag-handle.start {
	left: calc(var(--sash-size) * -0.5);
	top: calc(var(--sash-size) * -1);
}
.monaco-sash.vertical > .orthogonal-drag-handle.end {
	left: calc(var(--sash-size) * -0.5);
	bottom: calc(var(--sash-size) * -1);
}
.monaco-sash.horizontal > .orthogonal-drag-handle.start {
	top: calc(var(--sash-size) * -0.5);
	left: calc(var(--sash-size) * -1);
}
.monaco-sash.horizontal > .orthogonal-drag-handle.end {
	top: calc(var(--sash-size) * -0.5);
	right: calc(var(--sash-size) * -1);
}

.monaco-sash:before {
	content: '';
	pointer-events: none;
	position: absolute;
	width: 100%;
	height: 100%;
	transition: background-color 0.1s ease-out;
	background: transparent;
}

.monaco-sash.vertical:before {
	width: var(--sash-hover-size);
	left: calc(50% - (var(--sash-hover-size) / 2));
}

.monaco-sash.horizontal:before {
	height: var(--sash-hover-size);
	top: calc(50% - (var(--sash-hover-size) / 2));
}

.pointer-events-disabled {
	pointer-events: none !important;
}

/** Debug **/

.monaco-sash.debug {
	background: cyan;
}

.monaco-sash.debug.disabled {
	background: rgba(0, 255, 255, 0.2);
}

.monaco-sash.debug:not(.disabled) > .orthogonal-drag-handle {
	background: red;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* Find widget */
.monaco-editor .find-widget {
	position: absolute;
	z-index: 35;
	height: 33px;
	overflow: hidden;
	line-height: 19px;
	transition: transform 200ms linear;
	padding: 0 4px;
	box-sizing: border-box;
	transform: translateY(calc(-100% - 10px)); /* shadow (10px) */
}

.monaco-editor .find-widget textarea {
	margin: 0px;
}

.monaco-editor .find-widget.hiddenEditor {
	display: none;
}

/* Find widget when replace is toggled on */
.monaco-editor .find-widget.replaceToggled > .replace-part {
	display: flex;
}

.monaco-editor .find-widget.visible  {
	transform: translateY(0);
}

.monaco-editor .find-widget .monaco-inputbox.synthetic-focus {
	outline: 1px solid -webkit-focus-ring-color;
	outline-offset: -1px;
}

.monaco-editor .find-widget .monaco-inputbox .input {
	background-color: transparent;
	min-height: 0;
}

.monaco-editor .find-widget .monaco-findInput .input {
	font-size: 13px;
}

.monaco-editor .find-widget > .find-part,
.monaco-editor .find-widget > .replace-part {
	margin: 4px 0 0 17px;
	font-size: 12px;
	display: flex;
}

.monaco-editor .find-widget > .find-part .monaco-inputbox,
.monaco-editor .find-widget > .replace-part .monaco-inputbox {
	min-height: 25px;
}


.monaco-editor .find-widget > .replace-part .monaco-inputbox > .ibwrapper > .mirror {
	padding-right: 22px;
}

.monaco-editor .find-widget > .find-part .monaco-inputbox > .ibwrapper > .input,
.monaco-editor .find-widget > .find-part .monaco-inputbox > .ibwrapper > .mirror,
.monaco-editor .find-widget > .replace-part .monaco-inputbox > .ibwrapper > .input,
.monaco-editor .find-widget > .replace-part .monaco-inputbox > .ibwrapper > .mirror {
	padding-top: 2px;
	padding-bottom: 2px;
}

.monaco-editor .find-widget > .find-part .find-actions {
	height: 25px;
	display: flex;
	align-items: center;
}

.monaco-editor .find-widget > .replace-part .replace-actions {
	height: 25px;
	display: flex;
	align-items: center;
}

.monaco-editor .find-widget .monaco-findInput {
	vertical-align: middle;
	display: flex;
	flex:1;
}

.monaco-editor .find-widget .monaco-findInput .monaco-scrollable-element {
	/* Make sure textarea inherits the width correctly */
	width: 100%;
}

.monaco-editor .find-widget .monaco-findInput .monaco-scrollable-element .scrollbar.vertical {
	/* Hide vertical scrollbar */
	opacity: 0;
}

.monaco-editor .find-widget .matchesCount {
	display: flex;
	flex: initial;
	margin: 0 0 0 3px;
	padding: 2px 0 0 2px;
	height: 25px;
	vertical-align: middle;
	box-sizing: border-box;
	text-align: center;
	line-height: 23px;
}

.monaco-editor .find-widget .button {
	width: 16px;
	height: 16px;
	padding: 3px;
	border-radius: 5px;
	display: flex;
	flex: initial;
	margin-left: 3px;
	background-position: center center;
	background-repeat: no-repeat;
	cursor: pointer;
	display: flex;
	align-items: center;
	justify-content: center;
}

/* find in selection button */
.monaco-editor .find-widget .codicon-find-selection {
	width: 22px;
	height: 22px;
	padding: 3px;
	border-radius: 5px;
}

.monaco-editor .find-widget .button.left {
	margin-left: 0;
	margin-right: 3px;
}

.monaco-editor .find-widget .button.wide {
	width: auto;
	padding: 1px 6px;
	top: -1px;
}

.monaco-editor .find-widget .button.toggle {
	position: absolute;
	top: 0;
	left: 3px;
	width: 18px;
	height: 100%;
	border-radius: 0;
	box-sizing: border-box;
}

.monaco-editor .find-widget .button.toggle.disabled {
	display: none;
}

.monaco-editor .find-widget .disabled {
	opacity: 0.3;
	cursor: default;
}

.monaco-editor .find-widget > .replace-part {
	display: none;
}

.monaco-editor .find-widget > .replace-part > .monaco-findInput {
	position: relative;
	display: flex;
	vertical-align: middle;
	flex: auto;
	flex-grow: 0;
	flex-shrink: 0;
}

.monaco-editor .find-widget > .replace-part > .monaco-findInput > .controls {
	position: absolute;
	top: 3px;
	right: 2px;
}

/* REDUCED */
.monaco-editor .find-widget.reduced-find-widget .matchesCount {
	display:none;
}

/* NARROW (SMALLER THAN REDUCED) */
.monaco-editor .find-widget.narrow-find-widget {
	max-width: 257px !important;
}

/* COLLAPSED (SMALLER THAN NARROW) */
.monaco-editor .find-widget.collapsed-find-widget {
	max-width: 170px !important;
}

.monaco-editor .find-widget.collapsed-find-widget .button.previous,
.monaco-editor .find-widget.collapsed-find-widget .button.next,
.monaco-editor .find-widget.collapsed-find-widget .button.replace,
.monaco-editor .find-widget.collapsed-find-widget .button.replace-all,
.monaco-editor .find-widget.collapsed-find-widget > .find-part .monaco-findInput .controls {
	display:none;
}

.monaco-editor .findMatch {
	animation-duration: 0;
	animation-name: inherit !important;
}

.monaco-editor .find-widget .monaco-sash {
	left: 0 !important;
}

.monaco-editor.hc-black .find-widget .button:before {
	position: relative;
	top: 1px;
	left: 2px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-action-bar {
	white-space: nowrap;
	height: 100%;
}

.monaco-action-bar .actions-container {
	display: flex;
	margin: 0 auto;
	padding: 0;
	height: 100%;
	width: 100%;
	align-items: center;
}

.monaco-action-bar.vertical .actions-container {
	display: inline-block;
}

.monaco-action-bar .action-item {
	display: block;
	align-items: center;
	justify-content: center;
	cursor: pointer;
	position: relative;  /* DO NOT REMOVE - this is the key to preventing the ghosting icon bug in Chrome 42 */
}

.monaco-action-bar .action-item.disabled {
	cursor: default;
}

.monaco-action-bar .action-item .icon,
.monaco-action-bar .action-item .codicon {
	display: block;
}

.monaco-action-bar .action-item .codicon {
	display: flex;
	align-items: center;
	width: 16px;
	height: 16px;
}

.monaco-action-bar .action-label {
	font-size: 11px;
	padding: 3px;
	border-radius: 5px;
}

.monaco-action-bar .action-item.disabled .action-label,
.monaco-action-bar .action-item.disabled .action-label::before,
.monaco-action-bar .action-item.disabled .action-label:hover {
	opacity: 0.4;
}

/* Vertical actions */

.monaco-action-bar.vertical {
	text-align: left;
}

.monaco-action-bar.vertical .action-item {
	display: block;
}

.monaco-action-bar.vertical .action-label.separator {
	display: block;
	border-bottom: 1px solid #bbb;
	padding-top: 1px;
	margin-left: .8em;
	margin-right: .8em;
}

.monaco-action-bar .action-item .action-label.separator {
	width: 1px;
	height: 16px;
	margin: 5px 4px !important;
	cursor: default;
	min-width: 1px;
	padding: 0;
	background-color: #bbb;
}

.secondary-actions .monaco-action-bar .action-label {
	margin-left: 6px;
}

/* Action Items */
.monaco-action-bar .action-item.select-container {
	overflow: hidden; /* somehow the dropdown overflows its container, we prevent it here to not push */
	flex: 1;
	max-width: 170px;
	min-width: 60px;
	display: flex;
	align-items: center;
	justify-content: center;
	margin-right: 10px;
}

.monaco-action-bar .action-item.action-dropdown-item {
	display: flex;
}

.monaco-action-bar .action-item.action-dropdown-item > .action-label {
	margin-right: 1px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-inputbox {
	position: relative;
	display: block;
	padding: 0;
	box-sizing:	border-box;

	/* Customizable */
	font-size: inherit;
}

.monaco-inputbox.idle {
	border: 1px solid transparent;
}

.monaco-inputbox > .ibwrapper > .input,
.monaco-inputbox > .ibwrapper > .mirror {

	/* Customizable */
	padding: 4px;
}

.monaco-inputbox > .ibwrapper {
	position: relative;
	width: 100%;
	height: 100%;
}

.monaco-inputbox > .ibwrapper > .input {
	display: inline-block;
	box-sizing:	border-box;
	width: 100%;
	height: 100%;
	line-height: inherit;
	border: none;
	font-family: inherit;
	font-size: inherit;
	resize: none;
	color: inherit;
}

.monaco-inputbox > .ibwrapper > input {
	text-overflow: ellipsis;
}

.monaco-inputbox > .ibwrapper > textarea.input {
	display: block;
	-ms-overflow-style: none; /* IE 10+: hide scrollbars */
	scrollbar-width: none; /* Firefox: hide scrollbars */
	outline: none;
}

.monaco-inputbox > .ibwrapper > textarea.input::-webkit-scrollbar {
	display: none; /* Chrome + Safari: hide scrollbar */
}

.monaco-inputbox > .ibwrapper > textarea.input.empty {
	white-space: nowrap;
}

.monaco-inputbox > .ibwrapper > .mirror {
	position: absolute;
	display: inline-block;
	width: 100%;
	top: 0;
	left: 0;
	box-sizing: border-box;
	white-space: pre-wrap;
	visibility: hidden;
	word-wrap: break-word;
}

/* Context view */

.monaco-inputbox-container {
	text-align: right;
}

.monaco-inputbox-container .monaco-inputbox-message {
	display: inline-block;
	overflow: hidden;
	text-align: left;
	width: 100%;
	box-sizing:	border-box;
	padding: 0.4em;
	font-size: 12px;
	line-height: 17px;
	margin-top: -1px;
	word-wrap: break-word;
}

/* Action bar support */
.monaco-inputbox .monaco-action-bar {
	position: absolute;
	right: 2px;
	top: 4px;
}

.monaco-inputbox .monaco-action-bar .action-item {
	margin-left: 2px;
}

.monaco-inputbox .monaco-action-bar .action-item .codicon {
	background-repeat: no-repeat;
	width: 16px;
	height: 16px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
/* ---------- Find input ---------- */

.monaco-findInput {
	position: relative;
}

.monaco-findInput .monaco-inputbox {
	font-size: 13px;
	width: 100%;
}

.monaco-findInput > .controls {
	position: absolute;
	top: 3px;
	right: 2px;
}

.vs .monaco-findInput.disabled {
	background-color: #E1E1E1;
}

/* Theming */
.vs-dark .monaco-findInput.disabled {
	background-color: #333;
}

/* Highlighting */
.monaco-findInput.highlight-0 .controls {
	animation: monaco-findInput-highlight-0 100ms linear 0s;
}
.monaco-findInput.highlight-1 .controls {
	animation: monaco-findInput-highlight-1 100ms linear 0s;
}
.hc-black .monaco-findInput.highlight-0 .controls,
.vs-dark  .monaco-findInput.highlight-0 .controls {
	animation: monaco-findInput-highlight-dark-0 100ms linear 0s;
}
.hc-black .monaco-findInput.highlight-1 .controls,
.vs-dark  .monaco-findInput.highlight-1 .controls {
	animation: monaco-findInput-highlight-dark-1 100ms linear 0s;
}

@keyframes monaco-findInput-highlight-0 {
	0% { background: rgba(253, 255, 0, 0.8); }
	100% { background: transparent; }
}
@keyframes monaco-findInput-highlight-1 {
	0% { background: rgba(253, 255, 0, 0.8); }
	/* Made intentionally different such that the CSS minifier does not collapse the two animations into a single one*/
	99% { background: transparent; }
}

@keyframes monaco-findInput-highlight-dark-0 {
	0% { background: rgba(255, 255, 255, 0.44); }
	100% { background: transparent; }
}
@keyframes monaco-findInput-highlight-dark-1 {
	0% { background: rgba(255, 255, 255, 0.44); }
	/* Made intentionally different such that the CSS minifier does not collapse the two animations into a single one*/
	99% { background: transparent; }
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .goto-definition-link {
	text-decoration: underline;
	cursor: pointer;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .peekview-widget .head {
	box-sizing: border-box;
	display: flex;
	justify-content: space-between;
	flex-wrap: nowrap;
}

.monaco-editor .peekview-widget .head .peekview-title {
	display: flex;
	align-items: center;
	font-size: 13px;
	margin-left: 20px;
	min-width: 0;
	text-overflow: ellipsis;
	overflow: hidden;
}

.monaco-editor .peekview-widget .head .peekview-title.clickable {
	cursor: pointer;
}

.monaco-editor .peekview-widget .head .peekview-title .dirname:not(:empty) {
	font-size: 0.9em;
	margin-left: 0.5em;
	text-overflow: ellipsis;
	overflow: hidden;
}

.monaco-editor .peekview-widget .head .peekview-title .meta {
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}

.monaco-editor .peekview-widget .head .peekview-title .dirname {
	white-space: nowrap;
}

.monaco-editor .peekview-widget .head .peekview-title .filename {
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: nowrap;
}

.monaco-editor .peekview-widget .head .peekview-title .meta:not(:empty)::before {
	content: '-';
	padding: 0 0.3em;
}

.monaco-editor .peekview-widget .head .peekview-actions {
	flex: 1;
	text-align: right;
	padding-right: 2px;
}

.monaco-editor .peekview-widget .head .peekview-actions > .monaco-action-bar {
	display: inline-block;
}

.monaco-editor .peekview-widget .head .peekview-actions > .monaco-action-bar,
.monaco-editor .peekview-widget .head .peekview-actions > .monaco-action-bar > .actions-container {
	height: 100%;
}

.monaco-editor .peekview-widget > .body {
	border-top: 1px solid;
	position: relative;
}

.monaco-editor .peekview-widget .head .peekview-title .codicon {
	margin-right: 4px;
}

.monaco-editor .peekview-widget .monaco-list .monaco-list-row.focused .codicon {
	color: inherit !important;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .zone-widget {
	position: absolute;
	z-index: 10;
}


.monaco-editor .zone-widget .zone-widget-container {
	border-top-style: solid;
	border-bottom-style: solid;
	border-top-width: 0;
	border-bottom-width: 0;
	position: relative;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-dropdown {
	height: 100%;
	padding: 0;
}

.monaco-dropdown > .dropdown-label {
	cursor: pointer;
	height: 100%;
	display: flex;
	align-items: center;
	justify-content: center;
}

.monaco-dropdown > .dropdown-label > .action-label.disabled {
	cursor: default;
}

.monaco-dropdown-with-primary {
	display: flex !important;
	flex-direction: row;
	border-radius: 5px;
}

.monaco-dropdown-with-primary > .action-container > .action-label {
	margin-right: 0;
}

.monaco-dropdown-with-primary > .dropdown-action-container > .monaco-dropdown > .dropdown-label .codicon[class*='codicon-'] {
	font-size: 12px;
	padding-left: 0px;
	padding-right: 0px;
	line-height: 16px;
	margin-left: -3px;
}

.monaco-dropdown-with-primary > .dropdown-action-container > .monaco-dropdown > .dropdown-label > .action-label {
	display: block;
	background-size: 16px;
	background-position: center center;
	background-repeat: no-repeat;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-action-bar .action-item.menu-entry .action-label.icon {
	width: 16px;
	height: 16px;
	background-repeat: no-repeat;
	background-position: 50%;
	background-size: 16px;
}

.monaco-action-bar .action-item.menu-entry .action-label {
	background-image: var(--menu-entry-icon-light);
}

.vs-dark .monaco-action-bar .action-item.menu-entry .action-label,
.hc-black .monaco-action-bar .action-item.menu-entry .action-label {
	background-image: var(--menu-entry-icon-dark);
}


.monaco-dropdown-with-default {
	display: flex !important;
	flex-direction: row;
	border-radius: 5px;
}

.monaco-dropdown-with-default > .action-container > .action-label {
	margin-right: 0;
}

.monaco-dropdown-with-default > .action-container.menu-entry > .action-label.icon {
	width: 16px;
	height: 16px;
	background-repeat: no-repeat;
	background-position: 50%;
	background-size: 16px;
}

.monaco-dropdown-with-default > .action-container.menu-entry > .action-label {
	background-image: var(--menu-entry-icon-light);
}

.vs-dark .monaco-dropdown-with-default > .action-container.menu-entry > .action-label,
.hc-black .monaco-dropdown-with-default > .action-container.menu-entry > .action-label {
	background-image: var(--menu-entry-icon-dark);
}

.monaco-dropdown-with-default > .dropdown-action-container > .monaco-dropdown > .dropdown-label .codicon[class*='codicon-'] {
	font-size: 12px;
	padding-left: 0px;
	padding-right: 0px;
	line-height: 16px;
	margin-left: -3px;
}

.monaco-dropdown-with-default > .dropdown-action-container > .monaco-dropdown > .dropdown-label > .action-label {
	display: block;
	background-size: 16px;
	background-position: center center;
	background-repeat: no-repeat;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-list {
	position: relative;
	height: 100%;
	width: 100%;
	white-space: nowrap;
}

.monaco-list.mouse-support {
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

.monaco-list > .monaco-scrollable-element {
	height: 100%;
}

.monaco-list-rows {
	position: relative;
	width: 100%;
	height: 100%;
}

.monaco-list.horizontal-scrolling .monaco-list-rows {
	width: auto;
	min-width: 100%;
}

.monaco-list-row {
	position: absolute;
	box-sizing: border-box;
	overflow: hidden;
	width: 100%;
}

.monaco-list.mouse-support .monaco-list-row {
	cursor: pointer;
	touch-action: none;
}

/* for OS X ballistic scrolling */
.monaco-list-row.scrolling {
	display: none !important;
}

/* Focus */
.monaco-list.element-focused,
.monaco-list.selection-single,
.monaco-list.selection-multiple {
	outline: 0 !important;
}

/* Dnd */
.monaco-drag-image {
	display: inline-block;
	padding: 1px 7px;
	border-radius: 10px;
	font-size: 12px;
	position: absolute;
	z-index: 1000;
}

/* Type filter */

.monaco-list-type-filter {
	display: flex;
	align-items: center;
	position: absolute;
	border-radius: 2px;
	padding: 0px 3px;
	max-width: calc(100% - 10px);
	text-overflow: ellipsis;
	overflow: hidden;
	text-align: right;
	box-sizing: border-box;
	cursor: all-scroll;
	font-size: 13px;
	line-height: 18px;
	height: 20px;
	z-index: 1;
	top: 4px;
}

.monaco-list-type-filter.dragging {
	transition: top 0.2s, left 0.2s;
}

.monaco-list-type-filter.ne {
	right: 4px;
}

.monaco-list-type-filter.nw {
	left: 4px;
}

.monaco-list-type-filter > .controls {
	display: flex;
	align-items: center;
	box-sizing: border-box;
	transition: width 0.2s;
	width: 0;
}

.monaco-list-type-filter.dragging > .controls,
.monaco-list-type-filter:hover > .controls {
	width: 36px;
}

.monaco-list-type-filter > .controls > * {
	border: none;
	box-sizing: border-box;
	-webkit-appearance: none;
	-moz-appearance: none;
	background: none;
	width: 16px;
	height: 16px;
	flex-shrink: 0;
	margin: 0;
	padding: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	cursor: pointer;
}

.monaco-list-type-filter > .controls > .filter {
	margin-left: 4px;
}

.monaco-list-type-filter-message {
	position: absolute;
	box-sizing: border-box;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	padding: 40px 1em 1em 1em;
	text-align: center;
	white-space: normal;
	opacity: 0.7;
	pointer-events: none;
}

.monaco-list-type-filter-message:empty {
	display: none;
}

/* Electron */

.monaco-list-type-filter {
	cursor: grab;
}

.monaco-list-type-filter.dragging {
	cursor: grabbing;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-split-view2 {
	position: relative;
	width: 100%;
	height: 100%;
}

.monaco-split-view2 > .sash-container {
	position: absolute;
	width: 100%;
	height: 100%;
	pointer-events: none;
}

.monaco-split-view2 > .sash-container > .monaco-sash {
	pointer-events: initial;
}

.monaco-split-view2 > .monaco-scrollable-element {
	width: 100%;
	height: 100%;
}

.monaco-split-view2 > .monaco-scrollable-element > .split-view-container {
	width: 100%;
	height: 100%;
	white-space: nowrap;
	position: relative;
}

.monaco-split-view2 > .monaco-scrollable-element > .split-view-container > .split-view-view {
	white-space: initial;
	position: absolute;
}

.monaco-split-view2 > .monaco-scrollable-element > .split-view-container > .split-view-view:not(.visible) {
	display: none;
}

.monaco-split-view2.vertical > .monaco-scrollable-element > .split-view-container > .split-view-view {
	width: 100%;
}

.monaco-split-view2.horizontal > .monaco-scrollable-element > .split-view-container > .split-view-view {
	height: 100%;
}

.monaco-split-view2.separator-border > .monaco-scrollable-element > .split-view-container > .split-view-view:not(:first-child)::before {
	content: ' ';
	position: absolute;
	top: 0;
	left: 0;
	z-index: 5;
	pointer-events: none;
	background-color: var(--separator-border);
}

.monaco-split-view2.separator-border.horizontal > .monaco-scrollable-element > .split-view-container > .split-view-view:not(:first-child)::before {
	height: 100%;
	width: 1px;
}

.monaco-split-view2.separator-border.vertical > .monaco-scrollable-element > .split-view-container > .split-view-view:not(:first-child)::before {
	height: 1px;
	width: 100%;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-table {
	display: flex;
	flex-direction: column;
	position: relative;
	height: 100%;
	width: 100%;
	white-space: nowrap;
}

.monaco-table > .monaco-split-view2 {
	border-bottom: 1px solid transparent;
}

.monaco-table > .monaco-list {
	flex: 1;
}

.monaco-table-tr {
	display: flex;
	height: 100%;
}

.monaco-table-th {
	width: 100%;
	height: 100%;
	font-weight: bold;
	overflow: hidden;
	text-overflow: ellipsis;
}

.monaco-table-th,
.monaco-table-td {
	box-sizing: border-box;
	flex-shrink: 0;
	overflow: hidden;
	white-space: nowrap;
	text-overflow: ellipsis;
}

.monaco-table > .monaco-split-view2 .monaco-sash.vertical::before {
	content: "";
	position: absolute;
	left: calc(var(--sash-size) / 2);
	width: 0;
	border-left: 1px solid transparent;
}

.monaco-table > .monaco-split-view2,
.monaco-table > .monaco-split-view2 .monaco-sash.vertical::before {
	transition: border-color 0.2s ease-out;
}
/*
.monaco-table:hover > .monaco-split-view2,
.monaco-table:hover > .monaco-split-view2 .monaco-sash.vertical::before {
	border-color: rgba(204, 204, 204, 0.2);
} */
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-tl-row {
	display: flex;
	height: 100%;
	align-items: center;
	position: relative;
}

.monaco-tl-indent {
	height: 100%;
	position: absolute;
	top: 0;
	left: 16px;
	pointer-events: none;
}

.hide-arrows .monaco-tl-indent {
	left: 12px;
}

.monaco-tl-indent > .indent-guide {
	display: inline-block;
	box-sizing: border-box;
	height: 100%;
	border-left: 1px solid transparent;
}

.monaco-tl-indent > .indent-guide {
	transition: border-color 0.1s linear;
}

.monaco-tl-twistie,
.monaco-tl-contents {
	height: 100%;
}

.monaco-tl-twistie {
	font-size: 10px;
	text-align: right;
	padding-right: 6px;
	flex-shrink: 0;
	width: 16px;
	display: flex !important;
	align-items: center;
	justify-content: center;
	transform: translateX(3px);
}

.monaco-tl-contents {
	flex: 1;
	overflow: hidden;
}

.monaco-tl-twistie::before {
	border-radius: 20px;
}

.monaco-tl-twistie.collapsed::before {
	transform: rotate(-90deg);
}

.monaco-tl-twistie.codicon-tree-item-loading::before {
	/* Use steps to throttle FPS to reduce CPU usage */
	animation: codicon-spin 1.25s steps(30) infinite;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* -- zone widget */
.monaco-editor .zone-widget .zone-widget-container.reference-zone-widget {
	border-top-width: 1px;
	border-bottom-width: 1px;
}

.monaco-editor .reference-zone-widget .inline {
	display: inline-block;
	vertical-align: top;
}

.monaco-editor .reference-zone-widget .messages {
	height: 100%;
	width: 100%;
	text-align: center;
	padding: 3em 0;
}

.monaco-editor .reference-zone-widget .ref-tree {
	line-height: 23px;
	background-color: var(--vscode-peekViewResult-background);
	color: var(--vscode-peekViewResult-lineForeground);
}

.monaco-editor .reference-zone-widget .ref-tree .reference {
	text-overflow: ellipsis;
	overflow: hidden;
}

.monaco-editor .reference-zone-widget .ref-tree .reference-file {
	display: inline-flex;
	width: 100%;
	height: 100%;
	color: var(--vscode-peekViewResult-fileForeground);
}

.monaco-editor .reference-zone-widget .ref-tree .monaco-list:focus .selected .reference-file {
	color: inherit !important;
}

.monaco-editor .reference-zone-widget .ref-tree .monaco-list:focus .monaco-list-rows > .monaco-list-row.selected:not(.highlighted) {
	background-color: var(--vscode-peekViewResult-selectionBackground);
	color: var(--vscode-peekViewResult-selectionForeground) !important;
}

.monaco-editor .reference-zone-widget .ref-tree .reference-file .count {
	margin-right: 12px;
	margin-left: auto;
}

.monaco-editor .reference-zone-widget .ref-tree .referenceMatch .highlight {
	background-color: var(--vscode-peekViewResult-matchHighlightBackground);
}

.monaco-editor .reference-zone-widget .preview .reference-decoration {
	background-color: var(--vscode-peekViewEditor-matchHighlightBackground);
	border: 2px solid var(--vscode-peekViewEditor-matchHighlightBorder);
	box-sizing: border-box;
}

.monaco-editor .reference-zone-widget .preview .monaco-editor .monaco-editor-background,
.monaco-editor .reference-zone-widget .preview .monaco-editor .inputarea.ime-input {
	background-color: var(--vscode-peekViewEditor-background);
}

.monaco-editor .reference-zone-widget .preview .monaco-editor .margin {
	background-color: var(--vscode-peekViewEditorGutter-background);
}

/* High Contrast Theming */

.monaco-editor.hc-black .reference-zone-widget .ref-tree .reference-file {
	font-weight: bold;
}

.monaco-editor.hc-black .reference-zone-widget .ref-tree .referenceMatch .highlight {
	border: 1px dotted var(--vscode-contrastActiveBorder, transparent);
	box-sizing: border-box;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-count-badge {
	padding: 3px 6px;
	border-radius: 11px;
	font-size: 11px;
	min-width: 18px;
	min-height: 18px;
	line-height: 11px;
	font-weight: normal;
	text-align: center;
	display: inline-block;
	box-sizing: border-box;
}

.monaco-count-badge.long {
	padding: 2px 3px;
	border-radius: 2px;
	min-height: auto;
	line-height: normal;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* ---------- Icon label ---------- */

.monaco-icon-label {
	display: flex; /* required for icons support :before rule */
	overflow: hidden;
	text-overflow: ellipsis;
}

.monaco-icon-label::before {

	/* svg icons rendered as background image */
	background-size: 16px;
	background-position: left center;
	background-repeat: no-repeat;
	padding-right: 6px;
	width: 16px;
	height: 22px;
	line-height: inherit !important;
	display: inline-block;

	/* fonts icons */
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	vertical-align: top;

	flex-shrink: 0; /* fix for https://github.com/microsoft/vscode/issues/13787 */
}

.monaco-icon-label > .monaco-icon-label-container {
	min-width: 0;
	overflow: hidden;
	text-overflow: ellipsis;
	flex: 1;
}

.monaco-icon-label > .monaco-icon-label-container > .monaco-icon-name-container > .label-name {
	color: inherit;
	white-space: pre; /* enable to show labels that include multiple whitespaces */
}

.monaco-icon-label > .monaco-icon-label-container > .monaco-icon-name-container > .label-name > .label-separator {
	margin: 0 2px;
	opacity: 0.5;
}

.monaco-icon-label > .monaco-icon-label-container > .monaco-icon-description-container > .label-description {
	opacity: .7;
	margin-left: 0.5em;
	font-size: 0.9em;
	white-space: pre; /* enable to show labels that include multiple whitespaces */
}

.monaco-icon-label.nowrap > .monaco-icon-label-container > .monaco-icon-description-container > .label-description{
	white-space: nowrap
}

.vs .monaco-icon-label > .monaco-icon-label-container > .monaco-icon-description-container > .label-description {
	opacity: .95;
}

.monaco-icon-label.italic > .monaco-icon-label-container > .monaco-icon-name-container > .label-name,
.monaco-icon-label.italic > .monaco-icon-label-container > .monaco-icon-description-container > .label-description {
	font-style: italic;
}

.monaco-icon-label.deprecated {
	text-decoration: line-through;
	opacity: 0.66;
}

/* make sure apply italic font style to decorations as well */
.monaco-icon-label.italic::after {
	font-style: italic;
}

.monaco-icon-label.strikethrough > .monaco-icon-label-container > .monaco-icon-name-container > .label-name,
.monaco-icon-label.strikethrough > .monaco-icon-label-container > .monaco-icon-description-container > .label-description {
	text-decoration: line-through;
}

.monaco-icon-label::after {
	opacity: 0.75;
	font-size: 90%;
	font-weight: 600;
	margin: auto 16px 0 5px; /* https://github.com/microsoft/vscode/issues/113223 */
	text-align: center;
}

/* make sure selection color wins when a label is being selected */
.monaco-list:focus .selected .monaco-icon-label, /* list */
.monaco-list:focus .selected .monaco-icon-label::after
{
	color: inherit !important;
}

.monaco-list-row.focused.selected .label-description,
.monaco-list-row.selected .label-description {
	opacity: .8;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .monaco-editor-overlaymessage {
	padding-bottom: 8px;
	z-index: 10000;
}

.monaco-editor .monaco-editor-overlaymessage.below {
	padding-bottom: 0;
	padding-top: 8px;
	z-index: 10000;
}

@keyframes fadeIn {
	from { opacity: 0; }
	to { opacity: 1; }
}
.monaco-editor .monaco-editor-overlaymessage.fadeIn {
	animation: fadeIn 150ms ease-out;
}

@keyframes fadeOut {
	from { opacity: 1; }
	to { opacity: 0; }
}
.monaco-editor .monaco-editor-overlaymessage.fadeOut {
	animation: fadeOut 100ms ease-out;
}

.monaco-editor .monaco-editor-overlaymessage .message {
	padding: 1px 4px;
	color: var(--vscode-inputValidation-infoForeground);
	background-color: var(--vscode-inputValidation-infoBackground);
	border: 1px solid var(--vscode-inputValidation-infoBorder);
}

.monaco-editor.hc-black .monaco-editor-overlaymessage .message {
	border-width: 2px;
}

.monaco-editor .monaco-editor-overlaymessage .anchor {
	width: 0 !important;
	height: 0 !important;
	border-color: transparent;
	border-style: solid;
	z-index: 1000;
	border-width: 8px;
	position: absolute;
}

.monaco-editor .monaco-editor-overlaymessage .anchor.top {
	border-bottom-color: var(--vscode-inputValidation-infoBorder);
}

.monaco-editor .monaco-editor-overlaymessage .anchor.below {
	border-top-color: var(--vscode-inputValidation-infoBorder);
}

.monaco-editor .monaco-editor-overlaymessage:not(.below) .anchor.top,
.monaco-editor .monaco-editor-overlaymessage.below .anchor.below {
	display: none;
}

.monaco-editor .monaco-editor-overlaymessage.below .anchor.top {
	display: inherit;
	top: -8px;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-hover {
	cursor: default;
	position: absolute;
	overflow: hidden;
	z-index: 50;
	user-select: text;
	-webkit-user-select: text;
	-ms-user-select: text;
	box-sizing: initial;
	animation: fadein 100ms linear;
	line-height: 1.5em;
}

.monaco-hover.hidden {
	display: none;
}

.monaco-hover a:hover {
	cursor: pointer;
}

.monaco-hover .hover-contents:not(.html-hover-contents) {
	padding: 4px 8px;
}

.monaco-hover .markdown-hover > .hover-contents:not(.code-hover-contents) {
	max-width: 500px;
	word-wrap: break-word;
}

.monaco-hover .markdown-hover > .hover-contents:not(.code-hover-contents) hr {
	min-width: 100%;
}

.monaco-hover p,
.monaco-hover .code,
.monaco-hover ul {
	margin: 8px 0;
}

.monaco-hover code {
	font-family: var(--monaco-monospace-font);
}

.monaco-hover hr {
	box-sizing: border-box;
	border-left: 0px;
	border-right: 0px;
	margin-top: 4px;
	margin-bottom: -4px;
	margin-left: -8px;
	margin-right: -8px;
	height: 1px;
}

.monaco-hover p:first-child,
.monaco-hover .code:first-child,
.monaco-hover ul:first-child {
	margin-top: 0;
}

.monaco-hover p:last-child,
.monaco-hover .code:last-child,
.monaco-hover ul:last-child {
	margin-bottom: 0;
}

/* MarkupContent Layout */
.monaco-hover ul {
	padding-left: 20px;
}
.monaco-hover ol {
	padding-left: 20px;
}

.monaco-hover li > p {
	margin-bottom: 0;
}

.monaco-hover li > ul {
	margin-top: 0;
}

.monaco-hover code {
	border-radius: 3px;
	padding: 0 0.4em;
}

.monaco-hover .monaco-tokenized-source {
	white-space: pre-wrap;
}

.monaco-hover .hover-row.status-bar {
	font-size: 12px;
	line-height: 22px;
}

.monaco-hover .hover-row.status-bar .actions {
	display: flex;
	padding: 0px 8px;
}

.monaco-hover .hover-row.status-bar .actions .action-container {
	margin-right: 16px;
	cursor: pointer;
}

.monaco-hover .hover-row.status-bar .actions .action-container .action .icon {
	padding-right: 4px;
}

.monaco-hover .markdown-hover .hover-contents .codicon {
	color: inherit;
	font-size: inherit;
	vertical-align: middle;
}

.monaco-hover .hover-contents a.code-link:hover,
.monaco-hover .hover-contents a.code-link {
	color: inherit;
}

.monaco-hover .hover-contents a.code-link:before {
	content: '(';
}

.monaco-hover .hover-contents a.code-link:after {
	content: ')';
}

.monaco-hover .hover-contents a.code-link > span {
	text-decoration: underline;
	/** Hack to force underline to show **/
	border-bottom: 1px solid transparent;
	text-underline-position: under;
}

/** Spans in markdown hovers need a margin-bottom to avoid looking cramped: https://github.com/microsoft/vscode/issues/101496 **/
.monaco-hover .markdown-hover .hover-contents:not(.code-hover-contents):not(.html-hover-contents) span {
	margin-bottom: 4px;
	display: inline-block;
}

.monaco-hover-content .action-container a {
	-webkit-user-select: none;
	user-select: none;
}

.monaco-hover-content .action-container.disabled {
	pointer-events: none;
	opacity: 0.4;
	cursor: default;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .contentWidgets .codicon-light-bulb,
.monaco-editor .contentWidgets .codicon-lightbulb-autofix {
	display: flex;
	align-items: center;
	justify-content: center;
}

.monaco-editor .contentWidgets .codicon-light-bulb:hover,
.monaco-editor .contentWidgets .codicon-lightbulb-autofix:hover {
	cursor: pointer;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* marker zone */

.monaco-editor .peekview-widget .head .peekview-title .severity-icon {
	display: inline-block;
	vertical-align: text-top;
	margin-right: 4px;
}

.monaco-editor .marker-widget {
	text-overflow: ellipsis;
	white-space: nowrap;
}

.monaco-editor .marker-widget > .stale {
	opacity: 0.6;
	font-style: italic;
}

.monaco-editor .marker-widget .title {
	display: inline-block;
	padding-right: 5px;
}

.monaco-editor .marker-widget .descriptioncontainer {
	position: absolute;
	white-space: pre;
	user-select: text;
	-webkit-user-select: text;
	-ms-user-select: text;
	padding: 8px 12px 0 20px;
}

.monaco-editor .marker-widget .descriptioncontainer .message {
	display: flex;
	flex-direction: column;
}

.monaco-editor .marker-widget .descriptioncontainer .message .details {
	padding-left: 6px;
}

.monaco-editor .marker-widget .descriptioncontainer .message .source,
.monaco-editor .marker-widget .descriptioncontainer .message span.code {
	opacity: 0.6;
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link {
	opacity: 0.6;
	color: inherit;
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link:before {
	content: '(';
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link:after {
	content: ')';
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link > span {
	text-decoration: underline;
	/** Hack to force underline to show **/
	border-bottom: 1px solid transparent;
	text-underline-position: under;
	color: var(--vscode-textLink-foreground);
}

.monaco-editor .marker-widget .descriptioncontainer .message a.code-link > span {
	color: var(--vscode-textLink-activeForeground);
}

.monaco-editor .marker-widget .descriptioncontainer .filename {
	cursor: pointer;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
.monaco-editor .detected-link,
.monaco-editor .detected-link-active {
	text-decoration: underline;
	text-underline-position: under;
}

.monaco-editor .detected-link-active {
	cursor: pointer;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .parameter-hints-widget {
	/* Must be higher than the sash's z-index and terminal canvases but lower than the suggest widget */
	z-index: 39;
	display: flex;
	flex-direction: column;
	line-height: 1.5em;
}

.monaco-editor .parameter-hints-widget > .phwrapper {
	max-width: 440px;
	display: flex;
	flex-direction: row;
}

.monaco-editor .parameter-hints-widget.multiple {
	min-height: 3.3em;
	padding: 0;
}

.monaco-editor .parameter-hints-widget.visible {
	transition: left .05s ease-in-out;
}

.monaco-editor .parameter-hints-widget p,
.monaco-editor .parameter-hints-widget ul {
	margin: 8px 0;
}

.monaco-editor .parameter-hints-widget .monaco-scrollable-element,
.monaco-editor .parameter-hints-widget .body {
	display: flex;
	flex: 1;
	flex-direction: column;
	min-height: 100%;
}

.monaco-editor .parameter-hints-widget .signature {
	padding: 4px 5px;
}

.monaco-editor .parameter-hints-widget .docs {
	padding: 0 10px 0 5px;
	white-space: pre-wrap;
}

.monaco-editor .parameter-hints-widget .docs.empty {
	display: none;
}

.monaco-editor .parameter-hints-widget .docs .markdown-docs {
	white-space: initial;
}

.monaco-editor .parameter-hints-widget .docs .markdown-docs code {
	font-family: var(--monaco-monospace-font);
}

.monaco-editor .parameter-hints-widget .docs  .monaco-tokenized-source,
.monaco-editor .parameter-hints-widget .docs .code {
	white-space: pre-wrap;
}

.monaco-editor .parameter-hints-widget .docs code {
	border-radius: 3px;
	padding: 0 0.4em;
}

.monaco-editor .parameter-hints-widget .controls {
	display: none;
	flex-direction: column;
	align-items: center;
	min-width: 22px;
	justify-content: flex-end;
}

.monaco-editor .parameter-hints-widget.multiple .controls {
	display: flex;
	padding: 0 2px;
}

.monaco-editor .parameter-hints-widget.multiple .button {
	width: 16px;
	height: 16px;
	background-repeat: no-repeat;
	cursor: pointer;
}

.monaco-editor .parameter-hints-widget .button.previous {
	bottom: 24px;
}

.monaco-editor .parameter-hints-widget .overloads {
	text-align: center;
	height: 12px;
	line-height: 12px;
	font-family: var(--monaco-monospace-font);
}

.monaco-editor .parameter-hints-widget .signature .parameter.active {
	font-weight: bold;
}

.monaco-editor .parameter-hints-widget .documentation-parameter > .parameter {
	font-weight: bold;
	margin-right: 0.5em;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .snippet-placeholder {
	min-width: 2px;
	outline-style: solid;
	outline-width: 1px;
	background-color: var(--vscode-editor-snippetTabstopHighlightBackground, transparent);
	outline-color: var(--vscode-editor-snippetTabstopHighlightBorder, transparent);
}

.monaco-editor .finish-snippet-placeholder {
	outline-style: solid;
	outline-width: 1px;
	background-color: var(--vscode-editor-snippetFinalTabstopHighlightBackground, transparent);
	outline-color: var(--vscode-editor-snippetFinalTabstopHighlightBorder, transparent);
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

@font-face {
	font-family: "codicon";
	font-display: block;
	src: url(https://static.leetcode-cn.com/lc-monaco/ade705761eb7e702770d.ttf) format("truetype");
}

.codicon[class*='codicon-'] {
	font: normal normal normal 16px/1 codicon;
	display: inline-block;
	text-decoration: none;
	text-rendering: auto;
	text-align: center;
	text-transform: none;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

/* icon rules are dynamically created by the platform theme service (see iconsStyleSheet.ts) */
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.codicon-wrench-subaction {
	opacity: 0.5;
}

@keyframes codicon-spin {
	100% {
		transform:rotate(360deg);
	}
}

.codicon-sync.codicon-modifier-spin,
.codicon-loading.codicon-modifier-spin,
.codicon-gear.codicon-modifier-spin,
.codicon-notebook-state-executing.codicon-modifier-spin {
	/* Use steps to throttle FPS to reduce CPU usage */
	animation: codicon-spin 1.5s steps(30) infinite;
}

.codicon-modifier-disabled {
	opacity: 0.4;
}

/* custom speed & easing for loading icon */
.codicon-loading,
.codicon-tree-item-loading::before {
	animation-duration: 1s !important;
	animation-timing-function: cubic-bezier(0.53, 0.21, 0.29, 0.67) !important;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/* Suggest widget*/

.monaco-editor .suggest-widget {
	width: 430px;
	z-index: 40;
	display: flex;
	flex-direction: column;
}

.monaco-editor .suggest-widget.message {
	flex-direction: row;
	align-items: center;
}

.monaco-editor .suggest-widget,
.monaco-editor .suggest-details {
	flex: 0 1 auto;
	width: 100%;
	border-style: solid;
	border-width: 1px;
	border-color: var(--vscode-editorSuggestWidget-border);
	background-color: var(--vscode-editorSuggestWidget-background);
}

.monaco-editor.hc-black .suggest-widget,
.monaco-editor.hc-black .suggest-details {
	border-width: 2px;
}

/* Styles for status bar part */


.monaco-editor .suggest-widget .suggest-status-bar {
	box-sizing: border-box;
	display: none;
	flex-flow: row nowrap;
	justify-content: space-between;
	width: 100%;
	font-size: 80%;
	padding: 0 4px 0 4px;
	border-top: 1px solid var(--vscode-editorSuggestWidget-border);
	overflow: hidden;
}

.monaco-editor .suggest-widget.with-status-bar .suggest-status-bar {
	display: flex;
}

.monaco-editor .suggest-widget .suggest-status-bar .left {
	padding-right: 8px;
}

.monaco-editor .suggest-widget.with-status-bar .suggest-status-bar .action-label {
	color: var(--vscode-editorSuggestWidgetStatus-foreground);
}

.monaco-editor .suggest-widget.with-status-bar .suggest-status-bar .action-item:not(:last-of-type) .action-label {
	margin-right: 0;
}

.monaco-editor .suggest-widget.with-status-bar .suggest-status-bar .action-item:not(:last-of-type) .action-label::after {
	content: ', ';
	margin-right: 0.3em;
}

.monaco-editor .suggest-widget.with-status-bar .monaco-list .monaco-list-row>.contents>.main>.right>.readMore,
.monaco-editor .suggest-widget.with-status-bar .monaco-list .monaco-list-row.focused.string-label>.contents>.main>.right>.readMore {
	display: none;
}

.monaco-editor .suggest-widget.with-status-bar:not(.docs-side) .monaco-list .monaco-list-row:hover>.contents>.main>.right.can-expand-details>.details-label {
	width: 100%;
}

/* Styles for Message element for when widget is loading or is empty */

.monaco-editor .suggest-widget>.message {
	padding-left: 22px;
}

/** Styles for the list element **/

.monaco-editor .suggest-widget>.tree {
	height: 100%;
	width: 100%;
}

.monaco-editor .suggest-widget .monaco-list {
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

/** Styles for each row in the list element **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row {
	display: flex;
	-mox-box-sizing: border-box;
	box-sizing: border-box;
	padding-right: 10px;
	background-repeat: no-repeat;
	background-position: 2px 2px;
	white-space: nowrap;
	cursor: pointer;
	touch-action: none;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused {
	color: var(--vscode-editorSuggestWidget-selectedForeground);
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused .codicon {
	color: var(--vscode-editorSuggestWidget-selectedIconForeground);
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents {
	flex: 1;
	height: 100%;
	overflow: hidden;
	padding-left: 2px;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main {
	display: flex;
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: pre;
	justify-content: space-between;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left, .monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right {
	display: flex;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row:not(.focused)>.contents>.main .monaco-icon-label {
	color: var(--vscode-editorSuggestWidget-foreground);
}

.monaco-editor .suggest-widget:not(.frozen) .monaco-highlighted-label .highlight {
	font-weight: bold;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main .monaco-highlighted-label .highlight {
	color: var(--vscode-editorSuggestWidget-highlightForeground);
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused>.contents>.main .monaco-highlighted-label .highlight {
	color: var(--vscode-editorSuggestWidget-focusHighlightForeground);
}

/** ReadMore Icon styles **/

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.codicon-close,
.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.readMore::before {
	color: inherit;
	opacity: 1;
	font-size: 14px;
	cursor: pointer;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.codicon-close {
	position: absolute;
	top: 6px;
	right: 2px;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.codicon-close:hover,
.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.readMore:hover {
	opacity: 1;
}

/** signature, qualifier, type/details opacity **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.details-label {
	opacity: 0.7;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left>.signature-label {
	overflow: hidden;
	text-overflow: ellipsis;
	opacity: 0.6;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left>.qualifier-label {
	margin-left: 12px;
	opacity: 0.4;
	font-size: 85%;
	line-height: initial;
	text-overflow: ellipsis;
	overflow: hidden;
	align-self: center;
}

/** Type Info and icon next to the label in the focused completion item **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.details-label {
	font-size: 85%;
	margin-left: 1.1em;
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: nowrap;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.details-label>.monaco-tokenized-source {
	display: inline;
}

/** Details: if using CompletionItem#details, show on focus **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.details-label {
	display: none;
}

.monaco-editor .suggest-widget:not(.shows-details) .monaco-list .monaco-list-row.focused>.contents>.main>.right>.details-label {
	display: inline;
}

/** Details: if using CompletionItemLabel#details, always show **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row:not(.string-label)>.contents>.main>.right>.details-label,
.monaco-editor .suggest-widget.docs-side .monaco-list .monaco-list-row.focused:not(.string-label)>.contents>.main>.right>.details-label {
	display: inline;
}

/** Ellipsis on hover **/

.monaco-editor .suggest-widget:not(.docs-side) .monaco-list .monaco-list-row.focused:hover>.contents>.main>.right.can-expand-details>.details-label {
	width: calc(100% - 26px);
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left {
	flex-shrink: 1;
	flex-grow: 1;
	overflow: hidden;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.left>.monaco-icon-label {
	flex-shrink: 0;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row:not(.string-label)>.contents>.main>.left>.monaco-icon-label {
	max-width: 100%;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.string-label>.contents>.main>.left>.monaco-icon-label {
	flex-shrink: 1;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right {
	overflow: hidden;
	flex-shrink: 4;
	max-width: 70%;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row>.contents>.main>.right>.readMore {
	display: inline-block;
	position: absolute;
	right: 10px;
	width: 18px;
	height: 18px;
	visibility: hidden;
}

/** Do NOT display ReadMore when docs is side/below **/

.monaco-editor .suggest-widget.docs-side .monaco-list .monaco-list-row>.contents>.main>.right>.readMore {
	display: none !important;
}

/** Do NOT display ReadMore when using plain CompletionItemLabel (details/documentation might not be resolved) **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.string-label>.contents>.main>.right>.readMore {
	display: none;
}

/** Focused item can show ReadMore, but can't when docs is side/below **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused.string-label>.contents>.main>.right>.readMore {
	display: inline-block;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row.focused:hover>.contents>.main>.right>.readMore {
	visibility: visible;
}

/** Styles for each row in the list **/

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .monaco-icon-label.deprecated {
	opacity: 0.66;
	text-decoration: unset;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .monaco-icon-label.deprecated>.monaco-icon-label-container>.monaco-icon-name-container {
	text-decoration: line-through;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .monaco-icon-label::before {
	height: 100%;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .icon {
	display: block;
	height: 16px;
	width: 16px;
	margin-left: 2px;
	background-repeat: no-repeat;
	background-size: 80%;
	background-position: center;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .icon.hide {
	display: none;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .suggest-icon {
	display: flex;
	align-items: center;
	margin-right: 4px;
}

.monaco-editor .suggest-widget.no-icons .monaco-list .monaco-list-row .icon, .monaco-editor .suggest-widget.no-icons .monaco-list .monaco-list-row .suggest-icon::before {
	display: none;
}

.monaco-editor .suggest-widget .monaco-list .monaco-list-row .icon.customcolor .colorspan {
	margin: 0 0 0 0.3em;
	border: 0.1em solid #000;
	width: 0.7em;
	height: 0.7em;
	display: inline-block;
}

/** Styles for the docs of the completion item in focus **/

.monaco-editor .suggest-details-container {
	z-index: 41;
}

.monaco-editor .suggest-details {
	display: flex;
	flex-direction: column;
	cursor: default;
	color: var(--vscode-editorSuggestWidget-foreground);
}

.monaco-editor .suggest-details.focused {
	border-color: var(--vscode-focusBorder);
}

.monaco-editor .suggest-details a {
	color: var(--vscode-textLink-foreground);
}

.monaco-editor .suggest-details a:hover {
	color: var(--vscode-textLink-activeForeground);
}

.monaco-editor .suggest-details code {
	background-color: var(--vscode-textCodeBlock-background);
}

.monaco-editor .suggest-details.no-docs {
	display: none;
}

.monaco-editor .suggest-details>.monaco-scrollable-element {
	flex: 1;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body {
	box-sizing: border-box;
	height: 100%;
	width: 100%;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.type {
	flex: 2;
	overflow: hidden;
	text-overflow: ellipsis;
	opacity: 0.7;
	white-space: pre;
	margin: 0 24px 0 0;
	padding: 4px 0 12px 5px;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.header>.type.auto-wrap {
	white-space: normal;
	word-break: break-all;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs {
	margin: 0;
	padding: 4px 5px;
	white-space: pre-wrap;
}

.monaco-editor .suggest-details.no-type>.monaco-scrollable-element>.body>.docs {
	margin-right: 24px;
	overflow: hidden;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs {
	padding: 0;
	white-space: initial;
	min-height: calc(1rem + 8px);
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs>div,
.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs>span:not(:empty) {
	padding: 4px 5px;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs>div>p:first-child {
	margin-top: 0;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs>div>p:last-child {
	margin-bottom: 0;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs .monaco-tokenized-source {
	white-space: pre;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs .code {
	white-space: pre-wrap;
	word-wrap: break-word;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>.docs.markdown-docs .codicon {
	vertical-align: sub;
}

.monaco-editor .suggest-details>.monaco-scrollable-element>.body>p:empty {
	display: none;
}

.monaco-editor .suggest-details code {
	border-radius: 3px;
	padding: 0 0.4em;
}

.monaco-editor .suggest-details ul {
	padding-left: 20px;
}

.monaco-editor .suggest-details ol {
	padding-left: 20px;
}

.monaco-editor .suggest-details p code {
	font-family: var(--monaco-monospace-font);
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .accessibilityHelpWidget {
	padding: 10px;
	vertical-align: middle;
	overflow: scroll;
}</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-editor .tokens-inspect-widget {
	z-index: 50;
	user-select: text;
	-webkit-user-select: text;
	-ms-user-select: text;
	padding: 10px;
}

.tokens-inspect-separator {
	height: 1px;
	border: 0;
}

.monaco-editor .tokens-inspect-widget .tm-token {
	font-family: var(--monaco-monospace-font);
}

.monaco-editor .tokens-inspect-widget .tm-token-length {
	font-weight: normal;
	font-size: 60%;
	float: right;
}

.monaco-editor .tokens-inspect-widget .tm-metadata-table {
	width: 100%;
}

.monaco-editor .tokens-inspect-widget .tm-metadata-value {
	font-family: var(--monaco-monospace-font);
	text-align: right;
}

.monaco-editor .tokens-inspect-widget .tm-token-type {
	font-family: var(--monaco-monospace-font);
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/


/* Default standalone editor fonts */
.monaco-editor {
	font-family: -apple-system, BlinkMacSystemFont, "Segoe WPC", "Segoe UI", "HelveticaNeue-Light", system-ui, "Ubuntu", "Droid Sans", sans-serif;
	--monaco-monospace-font: "SF Mono", Monaco, Menlo, Consolas, "Ubuntu Mono", "Liberation Mono", "DejaVu Sans Mono", "Courier New", monospace;
}

.monaco-menu .monaco-action-bar.vertical .action-item .action-menu-item:focus .action-label {
	stroke-width: 1.2px;
}

.monaco-editor.vs-dark .monaco-menu .monaco-action-bar.vertical .action-menu-item:focus .action-label,
.monaco-editor.hc-black .monaco-menu .monaco-action-bar.vertical .action-menu-item:focus .action-label {
	stroke-width: 1.2px;
}

.monaco-hover p {
	margin: 0;
}

/* See https://github.com/microsoft/monaco-editor/issues/2168#issuecomment-780078600 */
.monaco-aria-container {
	position: absolute !important;
	top: 0; /* avoid being placed underneath a sibling element */
	height: 1px;
	width: 1px;
	margin: -1px;
	overflow: hidden;
	padding: 0;
	clip: rect(1px, 1px, 1px, 1px);
	clip-path: inset(50%);
}

/* The hc-black theme is already high contrast optimized */
.monaco-editor.hc-black {
	-ms-high-contrast-adjust: none;
}
/* In case the browser goes into high contrast mode and the editor is not configured with the hc-black theme */
@media screen and (-ms-high-contrast:active) {

	/* current line highlight */
	.monaco-editor.vs .view-overlays .current-line,
	.monaco-editor.vs-dark .view-overlays .current-line {
		border-color: windowtext !important;
		border-left: 0;
		border-right: 0;
	}

	/* view cursors */
	.monaco-editor.vs .cursor,
	.monaco-editor.vs-dark .cursor {
		background-color: windowtext !important;
	}
	/* dnd target */
	.monaco-editor.vs .dnd-target,
	.monaco-editor.vs-dark .dnd-target {
		border-color: windowtext !important;
	}

	/* selected text background */
	.monaco-editor.vs .selected-text,
	.monaco-editor.vs-dark .selected-text {
		background-color: highlight !important;
	}

	/* allow the text to have a transparent background. */
	.monaco-editor.vs .view-line,
	.monaco-editor.vs-dark .view-line {
		-ms-high-contrast-adjust: none;
	}

	/* text color */
	.monaco-editor.vs .view-line span,
	.monaco-editor.vs-dark .view-line span {
		color: windowtext !important;
	}
	/* selected text color */
	.monaco-editor.vs .view-line span.inline-selected-text,
	.monaco-editor.vs-dark .view-line span.inline-selected-text {
		color: highlighttext !important;
	}

	/* allow decorations */
	.monaco-editor.vs .view-overlays,
	.monaco-editor.vs-dark .view-overlays {
		-ms-high-contrast-adjust: none;
	}

	/* various decorations */
	.monaco-editor.vs .selectionHighlight,
	.monaco-editor.vs-dark .selectionHighlight,
	.monaco-editor.vs .wordHighlight,
	.monaco-editor.vs-dark .wordHighlight,
	.monaco-editor.vs .wordHighlightStrong,
	.monaco-editor.vs-dark .wordHighlightStrong,
	.monaco-editor.vs .reference-decoration,
	.monaco-editor.vs-dark .reference-decoration {
		border: 2px dotted highlight !important;
		background: transparent !important;
		box-sizing: border-box;
	}
	.monaco-editor.vs .rangeHighlight,
	.monaco-editor.vs-dark .rangeHighlight {
		background: transparent !important;
		border: 1px dotted activeborder !important;
		box-sizing: border-box;
	}
	.monaco-editor.vs .bracket-match,
	.monaco-editor.vs-dark .bracket-match {
		border-color: windowtext !important;
		background: transparent !important;
	}

	/* find widget */
	.monaco-editor.vs .findMatch,
	.monaco-editor.vs-dark .findMatch,
	.monaco-editor.vs .currentFindMatch,
	.monaco-editor.vs-dark .currentFindMatch {
		border: 2px dotted activeborder !important;
		background: transparent !important;
		box-sizing: border-box;
	}
	.monaco-editor.vs .find-widget,
	.monaco-editor.vs-dark .find-widget {
		border: 1px solid windowtext;
	}

	/* list - used by suggest widget */
	.monaco-editor.vs .monaco-list .monaco-list-row,
	.monaco-editor.vs-dark .monaco-list .monaco-list-row {
		-ms-high-contrast-adjust: none;
		color: windowtext !important;
	}
	.monaco-editor.vs .monaco-list .monaco-list-row.focused,
	.monaco-editor.vs-dark .monaco-list .monaco-list-row.focused {
		color: highlighttext !important;
		background-color: highlight !important;
	}
	.monaco-editor.vs .monaco-list .monaco-list-row:hover,
	.monaco-editor.vs-dark .monaco-list .monaco-list-row:hover {
		background: transparent !important;
		border: 1px solid highlight;
		box-sizing: border-box;
	}

	/* scrollbars */
	.monaco-editor.vs .monaco-scrollable-element > .scrollbar,
	.monaco-editor.vs-dark .monaco-scrollable-element > .scrollbar {
		-ms-high-contrast-adjust: none;
		background: background !important;
		border: 1px solid windowtext;
		box-sizing: border-box;
	}
	.monaco-editor.vs .monaco-scrollable-element > .scrollbar > .slider,
	.monaco-editor.vs-dark .monaco-scrollable-element > .scrollbar > .slider {
		background: windowtext !important;
	}
	.monaco-editor.vs .monaco-scrollable-element > .scrollbar > .slider:hover,
	.monaco-editor.vs-dark .monaco-scrollable-element > .scrollbar > .slider:hover {
		background: highlight !important;
	}
	.monaco-editor.vs .monaco-scrollable-element > .scrollbar > .slider.active,
	.monaco-editor.vs-dark .monaco-scrollable-element > .scrollbar > .slider.active {
		background: highlight !important;
	}

	/* overview ruler */
	.monaco-editor.vs .decorationsOverviewRuler,
	.monaco-editor.vs-dark .decorationsOverviewRuler {
		opacity: 0;
	}

	/* minimap */
	.monaco-editor.vs .minimap,
	.monaco-editor.vs-dark .minimap {
		display: none;
	}

	/* squiggles */
	.monaco-editor.vs .squiggly-d-error,
	.monaco-editor.vs-dark .squiggly-d-error {
		background: transparent !important;
		border-bottom: 4px double #E47777;
	}
	.monaco-editor.vs .squiggly-c-warning,
	.monaco-editor.vs-dark .squiggly-c-warning {
		border-bottom: 4px double #71B771;
	}
	.monaco-editor.vs .squiggly-b-info,
	.monaco-editor.vs-dark .squiggly-b-info {
		border-bottom: 4px double #71B771;
	}
	.monaco-editor.vs .squiggly-a-hint,
	.monaco-editor.vs-dark .squiggly-a-hint {
		border-bottom: 4px double #6c6c6c;
	}

	/* contextmenu */
	.monaco-editor.vs .monaco-menu .monaco-action-bar.vertical .action-menu-item:focus .action-label,
	.monaco-editor.vs-dark .monaco-menu .monaco-action-bar.vertical .action-menu-item:focus .action-label {
		-ms-high-contrast-adjust: none;
		color: highlighttext !important;
		background-color: highlight !important;
	}
	.monaco-editor.vs .monaco-menu .monaco-action-bar.vertical .action-menu-item:hover .action-label,
	.monaco-editor.vs-dark .monaco-menu .monaco-action-bar.vertical .action-menu-item:hover .action-label {
		-ms-high-contrast-adjust: none;
		background: transparent !important;
		border: 1px solid highlight;
		box-sizing: border-box;
	}

	/* diff editor */
	.monaco-diff-editor.vs .diffOverviewRuler,
	.monaco-diff-editor.vs-dark .diffOverviewRuler {
		display: none;
	}
	.monaco-editor.vs .line-insert,
	.monaco-editor.vs-dark .line-insert,
	.monaco-editor.vs .line-delete,
	.monaco-editor.vs-dark .line-delete {
		background: transparent !important;
		border: 1px solid highlight !important;
		box-sizing: border-box;
	}
	.monaco-editor.vs .char-insert,
	.monaco-editor.vs-dark .char-insert,
	.monaco-editor.vs .char-delete,
	.monaco-editor.vs-dark .char-delete {
		background: transparent !important;
	}
}

/*.monaco-editor.vs [tabindex="0"]:focus {
	outline: 1px solid rgba(0, 122, 204, 0.4);
	outline-offset: -1px;
	opacity: 1 !important;
}

.monaco-editor.vs-dark [tabindex="0"]:focus {
	outline: 1px solid rgba(14, 99, 156, 0.6);
	outline-offset: -1px;
	opacity: 1 !important;
}*/
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
/* ---------- DiffEditor ---------- */

.monaco-diff-editor .diffOverview {
	z-index: 9;
}

.monaco-diff-editor .diffOverview .diffViewport {
	z-index: 10;
}

/* colors not externalized: using transparancy on background */
.monaco-diff-editor.vs			.diffOverview { background: rgba(0, 0, 0, 0.03); }
.monaco-diff-editor.vs-dark		.diffOverview { background: rgba(255, 255, 255, 0.01); }

.monaco-scrollable-element.modified-in-monaco-diff-editor.vs		.scrollbar { background: rgba(0,0,0,0); }
.monaco-scrollable-element.modified-in-monaco-diff-editor.vs-dark	.scrollbar { background: rgba(0,0,0,0); }
.monaco-scrollable-element.modified-in-monaco-diff-editor.hc-black	.scrollbar { background: none; }

.monaco-scrollable-element.modified-in-monaco-diff-editor .slider {
	z-index: 10;
}
.modified-in-monaco-diff-editor				.slider.active { background: rgba(171, 171, 171, .4); }
.modified-in-monaco-diff-editor.hc-black	.slider.active { background: none; }

/* ---------- Diff ---------- */

.monaco-editor .insert-sign,
.monaco-diff-editor .insert-sign,
.monaco-editor .delete-sign,
.monaco-diff-editor .delete-sign {
	font-size: 11px !important;
	opacity: 0.7 !important;
	display: flex !important;
	align-items: center;
}
.monaco-editor.hc-black .insert-sign,
.monaco-diff-editor.hc-black .insert-sign,
.monaco-editor.hc-black .delete-sign,
.monaco-diff-editor.hc-black .delete-sign {
	opacity: 1;
}

.monaco-editor .inline-deleted-margin-view-zone {
	text-align: right;
}
.monaco-editor .inline-added-margin-view-zone {
	text-align: right;
}

/* ---------- Inline Diff ---------- */

.monaco-editor .view-zones .view-lines .view-line span {
	display: inline-block;
}

.monaco-editor .margin-view-zones .lightbulb-glyph:hover {
	cursor: pointer;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-diff-editor .diff-review-line-number {
	text-align: right;
	display: inline-block;
}

.monaco-diff-editor .diff-review {
	position: absolute;
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

.monaco-diff-editor .diff-review-summary {
	padding-left: 10px;
}

.monaco-diff-editor .diff-review-shadow {
	position: absolute;
}

.monaco-diff-editor .diff-review-row {
	white-space: pre;
}

.monaco-diff-editor .diff-review-table {
	display: table;
	min-width: 100%;
}

.monaco-diff-editor .diff-review-row {
	display: table-row;
	width: 100%;
}

.monaco-diff-editor .diff-review-spacer {
	display: inline-block;
	width: 10px;
	vertical-align: middle;
}

.monaco-diff-editor .diff-review-spacer > .codicon {
	font-size: 9px !important;
}

.monaco-diff-editor .diff-review-actions {
	display: inline-block;
	position: absolute;
	right: 10px;
	top: 2px;
}

.monaco-diff-editor .diff-review-actions .action-label {
	width: 16px;
	height: 16px;
	margin: 2px 0;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.context-view {
	position: absolute;
	z-index: 2500;
}

.context-view.fixed {
	all: initial;
	font-family: inherit;
	font-size: 13px;
	position: fixed;
	z-index: 2500;
	color: inherit;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.context-view .monaco-menu {
	min-width: 130px;
}

</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.quick-input-widget {
	font-size: 13px;
}

.quick-input-widget .monaco-highlighted-label .highlight,
.quick-input-widget .monaco-highlighted-label .highlight {
	color: #0066BF;
}

.vs .quick-input-widget .monaco-list-row.focused .monaco-highlighted-label .highlight,
.vs .quick-input-widget .monaco-list-row.focused .monaco-highlighted-label .highlight {
	color: #9DDDFF;
}

.vs-dark .quick-input-widget .monaco-highlighted-label .highlight,
.vs-dark .quick-input-widget .monaco-highlighted-label .highlight {
	color: #0097fb;
}

.hc-black .quick-input-widget .monaco-highlighted-label .highlight,
.hc-black .quick-input-widget .monaco-highlighted-label .highlight {
	color: #F38518;
}

.monaco-keybinding > .monaco-keybinding-key {
	background-color: rgba(221, 221, 221, 0.4);
	border: solid 1px rgba(204, 204, 204, 0.4);
	border-bottom-color: rgba(187, 187, 187, 0.4);
	box-shadow: inset 0 -1px 0 rgba(187, 187, 187, 0.4);
	color: #555;
}

.hc-black .monaco-keybinding > .monaco-keybinding-key {
	background-color: transparent;
	border: solid 1px rgb(111, 195, 223);
	box-shadow: none;
	color: #fff;
}

.vs-dark .monaco-keybinding > .monaco-keybinding-key {
	background-color: rgba(128, 128, 128, 0.17);
	border: solid 1px rgba(51, 51, 51, 0.6);
	border-bottom-color: rgba(68, 68, 68, 0.6);
	box-shadow: inset 0 -1px 0 rgba(68, 68, 68, 0.6);
	color: #ccc;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-text-button {
	box-sizing: border-box;
	display: flex;
	width: 100%;
	padding: 4px;
	text-align: center;
	cursor: pointer;
	justify-content: center;
	align-items: center;
}

.monaco-text-button:focus {
	outline-offset: 2px !important;
}

.monaco-text-button:hover {
	text-decoration: none !important;
}

.monaco-button.disabled:focus,
.monaco-button.disabled {
	opacity: 0.4 !important;
	cursor: default;
}

.monaco-text-button > .codicon {
	margin: 0 0.2em;
	color: inherit !important;
}

.monaco-button-dropdown {
	display: flex;
	cursor: pointer;
}

.monaco-button-dropdown > .monaco-dropdown-button {
	margin-left: 1px;
}

.monaco-description-button {
	flex-direction: column;
}

.monaco-description-button .monaco-button-label {
	font-weight: 500;
}

.monaco-description-button .monaco-button-description {
	font-style: italic;
}

.monaco-description-button .monaco-button-label,
.monaco-description-button .monaco-button-description
{
	display: flex;
	justify-content: center;
	align-items: center;
}

.monaco-description-button .monaco-button-label > .codicon,
.monaco-description-button .monaco-button-description > .codicon
{
	margin: 0 0.2em;
	color: inherit !important;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-progress-container {
	width: 100%;
	height: 5px;
	overflow: hidden; /* keep progress bit in bounds */
}

.monaco-progress-container .progress-bit {
	width: 2%;
	height: 5px;
	position: absolute;
	left: 0;
	display: none;
}

.monaco-progress-container.active .progress-bit {
	display: inherit;
}

.monaco-progress-container.discrete .progress-bit {
	left: 0;
	transition: width 100ms linear;
}

.monaco-progress-container.discrete.done .progress-bit {
	width: 100%;
}

.monaco-progress-container.infinite .progress-bit {
	animation-name: progress;
	animation-duration: 4s;
	animation-iteration-count: infinite;
	transform: translate3d(0px, 0px, 0px);
	animation-timing-function: linear;
}

.monaco-progress-container.infinite.infinite-long-running .progress-bit {
	/*
		The more smooth `linear` timing function can cause
		higher GPU consumption as indicated in
		https://github.com/microsoft/vscode/issues/97900 &
		https://github.com/microsoft/vscode/issues/138396
	*/
	animation-timing-function: steps(100);
}

/**
 * The progress bit has a width: 2% (1/50) of the parent container. The animation moves it from 0% to 100% of
 * that container. Since translateX is relative to the progress bit size, we have to multiple it with
 * its relative size to the parent container:
 * parent width: 5000%
 *    bit width: 100%
 * translateX should be as follow:
 *  50%: 5000% * 50% - 50% (set to center) = 2450%
 * 100%: 5000% * 100% - 100% (do not overflow) = 4900%
 */
@keyframes progress { from { transform: translateX(0%) scaleX(1) } 50% { transform: translateX(2500%) scaleX(3) } to { transform: translateX(4900%) scaleX(1) } }
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.quick-input-widget {
	position: absolute;
	width: 600px;
	z-index: 2000;
	padding: 0 1px 1px 1px;
	left: 50%;
	margin-left: -300px;
}

.quick-input-titlebar {
	display: flex;
	align-items: center;
}

.quick-input-left-action-bar {
	display: flex;
	margin-left: 4px;
	flex: 1;
}

.quick-input-title {
	padding: 3px 0px;
	text-align: center;
	text-overflow: ellipsis;
	overflow: hidden;
}

.quick-input-right-action-bar {
	display: flex;
	margin-right: 4px;
	flex: 1;
}

.quick-input-right-action-bar > .actions-container {
	justify-content: flex-end;
}

.quick-input-titlebar .monaco-action-bar .action-label.codicon {
	background-position: center;
	background-repeat: no-repeat;
	padding: 2px;
}

.quick-input-description {
	margin: 6px;
}

.quick-input-header .quick-input-description {
	margin: 4px 2px;
}

.quick-input-header {
	display: flex;
	padding: 6px 6px 0px 6px;
	margin-bottom: -2px;
}

.quick-input-widget.hidden-input .quick-input-header {
	/* reduce margins and paddings when input box hidden */
	padding: 0;
	margin-bottom: 0;
}

.quick-input-and-message {
	display: flex;
	flex-direction: column;
	flex-grow: 1;
	min-width: 0;
	position: relative;
}

.quick-input-check-all {
	align-self: center;
	margin: 0;
}

.quick-input-filter {
	flex-grow: 1;
	display: flex;
	position: relative;
}

.quick-input-box {
	flex-grow: 1;
}

.quick-input-widget.show-checkboxes .quick-input-box,
.quick-input-widget.show-checkboxes .quick-input-message {
	margin-left: 5px;
}

.quick-input-visible-count {
	position: absolute;
	left: -10000px;
}

.quick-input-count {
	align-self: center;
	position: absolute;
	right: 4px;
	display: flex;
	align-items: center;
}

.quick-input-count .monaco-count-badge {
	vertical-align: middle;
	padding: 2px 4px;
	border-radius: 2px;
	min-height: auto;
	line-height: normal;
}

.quick-input-action {
	margin-left: 6px;
}

.quick-input-action .monaco-text-button {
	font-size: 11px;
	padding: 0 6px;
	display: flex;
	height: 27.5px;
	align-items: center;
}

.quick-input-message {
	margin-top: -1px;
	padding: 5px;
	overflow-wrap: break-word;
}

.quick-input-message > .codicon {
	margin: 0 0.2em;
	vertical-align: text-bottom;
}

.quick-input-progress.monaco-progress-container {
	position: relative;
}

.quick-input-progress.monaco-progress-container,
.quick-input-progress.monaco-progress-container .progress-bit {
	height: 2px;
}

.quick-input-list {
	line-height: 22px;
	margin-top: 6px;
}

.quick-input-widget.hidden-input .quick-input-list {
	margin-top: 0; /* reduce margins when input box hidden */
}

.quick-input-list .monaco-list {
	overflow: hidden;
	max-height: calc(20 * 22px);
}

.quick-input-list .quick-input-list-entry {
	box-sizing: border-box;
	overflow: hidden;
	display: flex;
	height: 100%;
	padding: 0 6px;
}

.quick-input-list .quick-input-list-entry.quick-input-list-separator-border {
	border-top-width: 1px;
	border-top-style: solid;
}

.quick-input-list .monaco-list-row[data-index="0"] .quick-input-list-entry.quick-input-list-separator-border {
	border-top-style: none;
}

.quick-input-list .quick-input-list-label {
	overflow: hidden;
	display: flex;
	height: 100%;
	flex: 1;
}

.quick-input-list .quick-input-list-checkbox {
	align-self: center;
	margin: 0;
}

.quick-input-list .quick-input-list-rows {
	overflow: hidden;
	text-overflow: ellipsis;
	display: flex;
	flex-direction: column;
	height: 100%;
	flex: 1;
	margin-left: 5px;
}

.quick-input-widget.show-checkboxes .quick-input-list .quick-input-list-rows {
	margin-left: 10px;
}

.quick-input-widget .quick-input-list .quick-input-list-checkbox {
	display: none;
}
.quick-input-widget.show-checkboxes .quick-input-list .quick-input-list-checkbox {
	display: inline;
}

.quick-input-list .quick-input-list-rows > .quick-input-list-row {
	display: flex;
	align-items: center;
}

.quick-input-list .quick-input-list-rows > .quick-input-list-row .monaco-icon-label,
.quick-input-list .quick-input-list-rows > .quick-input-list-row .monaco-icon-label .monaco-icon-label-container > .monaco-icon-name-container {
	flex: 1; /* make sure the icon label grows within the row */
}

.quick-input-list .quick-input-list-rows > .quick-input-list-row .codicon[class*='codicon-'] {
	vertical-align: text-bottom;
}

.quick-input-list .quick-input-list-rows .monaco-highlighted-label span {
	opacity: 1;
}

.quick-input-list .quick-input-list-entry .quick-input-list-entry-keybinding {
	margin-right: 8px; /* separate from the separator label or scrollbar if any */
}

.quick-input-list .quick-input-list-label-meta {
	opacity: 0.7;
	line-height: normal;
	text-overflow: ellipsis;
	overflow: hidden;
}

.quick-input-list .monaco-highlighted-label .highlight {
	font-weight: bold;
}

.quick-input-list .quick-input-list-entry .quick-input-list-separator {
	margin-right: 8px; /* separate from keybindings or actions */
}

.quick-input-list .quick-input-list-entry-action-bar {
	display: flex;
	flex: 0;
	overflow: visible;
}

.quick-input-list .quick-input-list-entry-action-bar .action-label {
	/*
	 * By default, actions in the quick input action bar are hidden
	 * until hovered over them or selected.
	 */
	display: none;
}

.quick-input-list .quick-input-list-entry-action-bar .action-label.codicon {
	margin-right: 4px;
	padding: 0px 2px 2px 2px;
}

.quick-input-list .quick-input-list-entry-action-bar {
	margin-top: 1px;
}

.quick-input-list .quick-input-list-entry-action-bar {
	margin-right: 4px; /* separate from scrollbar */
}

.quick-input-list .quick-input-list-entry .quick-input-list-entry-action-bar .action-label.always-visible,
.quick-input-list .quick-input-list-entry:hover .quick-input-list-entry-action-bar .action-label,
.quick-input-list .monaco-list-row.focused .quick-input-list-entry-action-bar .action-label {
	display: flex;
}

/* focused items in quick pick */
.quick-input-list .monaco-list-row.focused .monaco-keybinding-key,
.quick-input-list .monaco-list-row.focused .quick-input-list-entry .quick-input-list-separator {
	color: inherit
}
.quick-input-list .monaco-list-row.focused .monaco-keybinding-key {
	background: none;
}
</style><style>/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-keybinding {
	display: flex;
	align-items: center;
	line-height: 10px;
}

.monaco-keybinding > .monaco-keybinding-key {
	display: inline-block;
	border-style: solid;
	border-width: 1px;
	border-radius: 3px;
	vertical-align: middle;
	font-size: 11px;
	padding: 3px 5px;
	margin: 0 2px;
}

.monaco-keybinding > .monaco-keybinding-key:first-child {
	margin-left: 0;
}

.monaco-keybinding > .monaco-keybinding-key:last-child {
	margin-right: 0;
}

.monaco-keybinding > .monaco-keybinding-key-separator {
	display: inline-block;
}

.monaco-keybinding > .monaco-keybinding-key-chord-separator {
	width: 6px;
}
</style><style id="__monaco_theme_color__">
.mtk1 { color: #000000; }
.mtk2 { color: #ffffff; }
.mtk3 { color: #008000; }
.mtk4 { color: #0000ff; }
.mtk5 { color: #811f3f; }
.mtk6 { color: #ee0000; }
.mtk7 { color: #098658; }
.mtk8 { color: #0451a5; }
.mtk9 { color: #267f99; }
.mtk10 { color: #795e26; }
.mtk11 { color: #af00db; }
.mtk12 { color: #800000; }
.mtk13 { color: #001080; }
.mtk14 { color: #ff0000; }
.mtk15 { color: #cd3131; }
.mtk16 { color: #d16969; }
.mtk17 { color: #000080; }
.mtk18 { color: #a31515; }
.mtk19 { color: #000000; }
.mtk20 { color: #0070c1; }
.mtki { font-style: italic; }
.mtkb { font-weight: bold; }
.mtku { text-decoration: underline; text-underline-position: under; }
.mtks { text-decoration: line-through; }
.mtks.mtku { text-decoration: underline line-through; text-underline-position: under; }</style><style type="text/css" media="screen" class="monaco-colors">.codicon-add:before { content: '\ea60'; }
.codicon-plus:before { content: '\ea60'; }
.codicon-gist-new:before { content: '\ea60'; }
.codicon-repo-create:before { content: '\ea60'; }
.codicon-lightbulb:before { content: '\ea61'; }
.codicon-light-bulb:before { content: '\ea61'; }
.codicon-repo:before { content: '\ea62'; }
.codicon-repo-delete:before { content: '\ea62'; }
.codicon-gist-fork:before { content: '\ea63'; }
.codicon-repo-forked:before { content: '\ea63'; }
.codicon-git-pull-request:before { content: '\ea64'; }
.codicon-git-pull-request-abandoned:before { content: '\ea64'; }
.codicon-record-keys:before { content: '\ea65'; }
.codicon-keyboard:before { content: '\ea65'; }
.codicon-tag:before { content: '\ea66'; }
.codicon-tag-add:before { content: '\ea66'; }
.codicon-tag-remove:before { content: '\ea66'; }
.codicon-person:before { content: '\ea67'; }
.codicon-person-follow:before { content: '\ea67'; }
.codicon-person-outline:before { content: '\ea67'; }
.codicon-person-filled:before { content: '\ea67'; }
.codicon-git-branch:before { content: '\ea68'; }
.codicon-git-branch-create:before { content: '\ea68'; }
.codicon-git-branch-delete:before { content: '\ea68'; }
.codicon-source-control:before { content: '\ea68'; }
.codicon-mirror:before { content: '\ea69'; }
.codicon-mirror-public:before { content: '\ea69'; }
.codicon-star:before { content: '\ea6a'; }
.codicon-star-add:before { content: '\ea6a'; }
.codicon-star-delete:before { content: '\ea6a'; }
.codicon-star-empty:before { content: '\ea6a'; }
.codicon-comment:before { content: '\ea6b'; }
.codicon-comment-add:before { content: '\ea6b'; }
.codicon-alert:before { content: '\ea6c'; }
.codicon-warning:before { content: '\ea6c'; }
.codicon-search:before { content: '\ea6d'; }
.codicon-search-save:before { content: '\ea6d'; }
.codicon-log-out:before { content: '\ea6e'; }
.codicon-sign-out:before { content: '\ea6e'; }
.codicon-log-in:before { content: '\ea6f'; }
.codicon-sign-in:before { content: '\ea6f'; }
.codicon-eye:before { content: '\ea70'; }
.codicon-eye-unwatch:before { content: '\ea70'; }
.codicon-eye-watch:before { content: '\ea70'; }
.codicon-circle-filled:before { content: '\ea71'; }
.codicon-primitive-dot:before { content: '\ea71'; }
.codicon-close-dirty:before { content: '\ea71'; }
.codicon-debug-breakpoint:before { content: '\ea71'; }
.codicon-debug-breakpoint-disabled:before { content: '\ea71'; }
.codicon-debug-hint:before { content: '\ea71'; }
.codicon-primitive-square:before { content: '\ea72'; }
.codicon-edit:before { content: '\ea73'; }
.codicon-pencil:before { content: '\ea73'; }
.codicon-info:before { content: '\ea74'; }
.codicon-issue-opened:before { content: '\ea74'; }
.codicon-gist-private:before { content: '\ea75'; }
.codicon-git-fork-private:before { content: '\ea75'; }
.codicon-lock:before { content: '\ea75'; }
.codicon-mirror-private:before { content: '\ea75'; }
.codicon-close:before { content: '\ea76'; }
.codicon-remove-close:before { content: '\ea76'; }
.codicon-x:before { content: '\ea76'; }
.codicon-repo-sync:before { content: '\ea77'; }
.codicon-sync:before { content: '\ea77'; }
.codicon-clone:before { content: '\ea78'; }
.codicon-desktop-download:before { content: '\ea78'; }
.codicon-beaker:before { content: '\ea79'; }
.codicon-microscope:before { content: '\ea79'; }
.codicon-vm:before { content: '\ea7a'; }
.codicon-device-desktop:before { content: '\ea7a'; }
.codicon-file:before { content: '\ea7b'; }
.codicon-file-text:before { content: '\ea7b'; }
.codicon-more:before { content: '\ea7c'; }
.codicon-ellipsis:before { content: '\ea7c'; }
.codicon-kebab-horizontal:before { content: '\ea7c'; }
.codicon-mail-reply:before { content: '\ea7d'; }
.codicon-reply:before { content: '\ea7d'; }
.codicon-organization:before { content: '\ea7e'; }
.codicon-organization-filled:before { content: '\ea7e'; }
.codicon-organization-outline:before { content: '\ea7e'; }
.codicon-new-file:before { content: '\ea7f'; }
.codicon-file-add:before { content: '\ea7f'; }
.codicon-new-folder:before { content: '\ea80'; }
.codicon-file-directory-create:before { content: '\ea80'; }
.codicon-trash:before { content: '\ea81'; }
.codicon-trashcan:before { content: '\ea81'; }
.codicon-history:before { content: '\ea82'; }
.codicon-clock:before { content: '\ea82'; }
.codicon-folder:before { content: '\ea83'; }
.codicon-file-directory:before { content: '\ea83'; }
.codicon-symbol-folder:before { content: '\ea83'; }
.codicon-logo-github:before { content: '\ea84'; }
.codicon-mark-github:before { content: '\ea84'; }
.codicon-github:before { content: '\ea84'; }
.codicon-terminal:before { content: '\ea85'; }
.codicon-console:before { content: '\ea85'; }
.codicon-repl:before { content: '\ea85'; }
.codicon-zap:before { content: '\ea86'; }
.codicon-symbol-event:before { content: '\ea86'; }
.codicon-error:before { content: '\ea87'; }
.codicon-stop:before { content: '\ea87'; }
.codicon-variable:before { content: '\ea88'; }
.codicon-symbol-variable:before { content: '\ea88'; }
.codicon-array:before { content: '\ea8a'; }
.codicon-symbol-array:before { content: '\ea8a'; }
.codicon-symbol-module:before { content: '\ea8b'; }
.codicon-symbol-package:before { content: '\ea8b'; }
.codicon-symbol-namespace:before { content: '\ea8b'; }
.codicon-symbol-object:before { content: '\ea8b'; }
.codicon-symbol-method:before { content: '\ea8c'; }
.codicon-symbol-function:before { content: '\ea8c'; }
.codicon-symbol-constructor:before { content: '\ea8c'; }
.codicon-symbol-boolean:before { content: '\ea8f'; }
.codicon-symbol-null:before { content: '\ea8f'; }
.codicon-symbol-numeric:before { content: '\ea90'; }
.codicon-symbol-number:before { content: '\ea90'; }
.codicon-symbol-structure:before { content: '\ea91'; }
.codicon-symbol-struct:before { content: '\ea91'; }
.codicon-symbol-parameter:before { content: '\ea92'; }
.codicon-symbol-type-parameter:before { content: '\ea92'; }
.codicon-symbol-key:before { content: '\ea93'; }
.codicon-symbol-text:before { content: '\ea93'; }
.codicon-symbol-reference:before { content: '\ea94'; }
.codicon-go-to-file:before { content: '\ea94'; }
.codicon-symbol-enum:before { content: '\ea95'; }
.codicon-symbol-value:before { content: '\ea95'; }
.codicon-symbol-ruler:before { content: '\ea96'; }
.codicon-symbol-unit:before { content: '\ea96'; }
.codicon-activate-breakpoints:before { content: '\ea97'; }
.codicon-archive:before { content: '\ea98'; }
.codicon-arrow-both:before { content: '\ea99'; }
.codicon-arrow-down:before { content: '\ea9a'; }
.codicon-arrow-left:before { content: '\ea9b'; }
.codicon-arrow-right:before { content: '\ea9c'; }
.codicon-arrow-small-down:before { content: '\ea9d'; }
.codicon-arrow-small-left:before { content: '\ea9e'; }
.codicon-arrow-small-right:before { content: '\ea9f'; }
.codicon-arrow-small-up:before { content: '\eaa0'; }
.codicon-arrow-up:before { content: '\eaa1'; }
.codicon-bell:before { content: '\eaa2'; }
.codicon-bold:before { content: '\eaa3'; }
.codicon-book:before { content: '\eaa4'; }
.codicon-bookmark:before { content: '\eaa5'; }
.codicon-debug-breakpoint-conditional-unverified:before { content: '\eaa6'; }
.codicon-debug-breakpoint-conditional:before { content: '\eaa7'; }
.codicon-debug-breakpoint-conditional-disabled:before { content: '\eaa7'; }
.codicon-debug-breakpoint-data-unverified:before { content: '\eaa8'; }
.codicon-debug-breakpoint-data:before { content: '\eaa9'; }
.codicon-debug-breakpoint-data-disabled:before { content: '\eaa9'; }
.codicon-debug-breakpoint-log-unverified:before { content: '\eaaa'; }
.codicon-debug-breakpoint-log:before { content: '\eaab'; }
.codicon-debug-breakpoint-log-disabled:before { content: '\eaab'; }
.codicon-briefcase:before { content: '\eaac'; }
.codicon-broadcast:before { content: '\eaad'; }
.codicon-browser:before { content: '\eaae'; }
.codicon-bug:before { content: '\eaaf'; }
.codicon-calendar:before { content: '\eab0'; }
.codicon-case-sensitive:before { content: '\eab1'; }
.codicon-check:before { content: '\eab2'; }
.codicon-checklist:before { content: '\eab3'; }
.codicon-chevron-down:before { content: '\eab4'; }
.codicon-drop-down-button:before { content: '\eab4'; }
.codicon-chevron-left:before { content: '\eab5'; }
.codicon-chevron-right:before { content: '\eab6'; }
.codicon-chevron-up:before { content: '\eab7'; }
.codicon-chrome-close:before { content: '\eab8'; }
.codicon-chrome-maximize:before { content: '\eab9'; }
.codicon-chrome-minimize:before { content: '\eaba'; }
.codicon-chrome-restore:before { content: '\eabb'; }
.codicon-circle-outline:before { content: '\eabc'; }
.codicon-debug-breakpoint-unverified:before { content: '\eabc'; }
.codicon-circle-slash:before { content: '\eabd'; }
.codicon-circuit-board:before { content: '\eabe'; }
.codicon-clear-all:before { content: '\eabf'; }
.codicon-clippy:before { content: '\eac0'; }
.codicon-close-all:before { content: '\eac1'; }
.codicon-cloud-download:before { content: '\eac2'; }
.codicon-cloud-upload:before { content: '\eac3'; }
.codicon-code:before { content: '\eac4'; }
.codicon-collapse-all:before { content: '\eac5'; }
.codicon-color-mode:before { content: '\eac6'; }
.codicon-comment-discussion:before { content: '\eac7'; }
.codicon-compare-changes:before { content: '\eafd'; }
.codicon-credit-card:before { content: '\eac9'; }
.codicon-dash:before { content: '\eacc'; }
.codicon-dashboard:before { content: '\eacd'; }
.codicon-database:before { content: '\eace'; }
.codicon-debug-continue:before { content: '\eacf'; }
.codicon-debug-disconnect:before { content: '\ead0'; }
.codicon-debug-pause:before { content: '\ead1'; }
.codicon-debug-restart:before { content: '\ead2'; }
.codicon-debug-start:before { content: '\ead3'; }
.codicon-debug-step-into:before { content: '\ead4'; }
.codicon-debug-step-out:before { content: '\ead5'; }
.codicon-debug-step-over:before { content: '\ead6'; }
.codicon-debug-stop:before { content: '\ead7'; }
.codicon-debug:before { content: '\ead8'; }
.codicon-device-camera-video:before { content: '\ead9'; }
.codicon-device-camera:before { content: '\eada'; }
.codicon-device-mobile:before { content: '\eadb'; }
.codicon-diff-added:before { content: '\eadc'; }
.codicon-diff-ignored:before { content: '\eadd'; }
.codicon-diff-modified:before { content: '\eade'; }
.codicon-diff-removed:before { content: '\eadf'; }
.codicon-diff-renamed:before { content: '\eae0'; }
.codicon-diff:before { content: '\eae1'; }
.codicon-discard:before { content: '\eae2'; }
.codicon-editor-layout:before { content: '\eae3'; }
.codicon-empty-window:before { content: '\eae4'; }
.codicon-exclude:before { content: '\eae5'; }
.codicon-extensions:before { content: '\eae6'; }
.codicon-eye-closed:before { content: '\eae7'; }
.codicon-file-binary:before { content: '\eae8'; }
.codicon-file-code:before { content: '\eae9'; }
.codicon-file-media:before { content: '\eaea'; }
.codicon-file-pdf:before { content: '\eaeb'; }
.codicon-file-submodule:before { content: '\eaec'; }
.codicon-file-symlink-directory:before { content: '\eaed'; }
.codicon-file-symlink-file:before { content: '\eaee'; }
.codicon-file-zip:before { content: '\eaef'; }
.codicon-files:before { content: '\eaf0'; }
.codicon-filter:before { content: '\eaf1'; }
.codicon-flame:before { content: '\eaf2'; }
.codicon-fold-down:before { content: '\eaf3'; }
.codicon-fold-up:before { content: '\eaf4'; }
.codicon-fold:before { content: '\eaf5'; }
.codicon-folder-active:before { content: '\eaf6'; }
.codicon-folder-opened:before { content: '\eaf7'; }
.codicon-gear:before { content: '\eaf8'; }
.codicon-gift:before { content: '\eaf9'; }
.codicon-gist-secret:before { content: '\eafa'; }
.codicon-gist:before { content: '\eafb'; }
.codicon-git-commit:before { content: '\eafc'; }
.codicon-git-compare:before { content: '\eafd'; }
.codicon-git-merge:before { content: '\eafe'; }
.codicon-github-action:before { content: '\eaff'; }
.codicon-github-alt:before { content: '\eb00'; }
.codicon-globe:before { content: '\eb01'; }
.codicon-grabber:before { content: '\eb02'; }
.codicon-graph:before { content: '\eb03'; }
.codicon-gripper:before { content: '\eb04'; }
.codicon-heart:before { content: '\eb05'; }
.codicon-home:before { content: '\eb06'; }
.codicon-horizontal-rule:before { content: '\eb07'; }
.codicon-hubot:before { content: '\eb08'; }
.codicon-inbox:before { content: '\eb09'; }
.codicon-issue-closed:before { content: '\eba4'; }
.codicon-issue-reopened:before { content: '\eb0b'; }
.codicon-issues:before { content: '\eb0c'; }
.codicon-italic:before { content: '\eb0d'; }
.codicon-jersey:before { content: '\eb0e'; }
.codicon-json:before { content: '\eb0f'; }
.codicon-kebab-vertical:before { content: '\eb10'; }
.codicon-key:before { content: '\eb11'; }
.codicon-law:before { content: '\eb12'; }
.codicon-lightbulb-autofix:before { content: '\eb13'; }
.codicon-link-external:before { content: '\eb14'; }
.codicon-link:before { content: '\eb15'; }
.codicon-list-ordered:before { content: '\eb16'; }
.codicon-list-unordered:before { content: '\eb17'; }
.codicon-live-share:before { content: '\eb18'; }
.codicon-loading:before { content: '\eb19'; }
.codicon-location:before { content: '\eb1a'; }
.codicon-mail-read:before { content: '\eb1b'; }
.codicon-mail:before { content: '\eb1c'; }
.codicon-markdown:before { content: '\eb1d'; }
.codicon-megaphone:before { content: '\eb1e'; }
.codicon-mention:before { content: '\eb1f'; }
.codicon-milestone:before { content: '\eb20'; }
.codicon-mortar-board:before { content: '\eb21'; }
.codicon-move:before { content: '\eb22'; }
.codicon-multiple-windows:before { content: '\eb23'; }
.codicon-mute:before { content: '\eb24'; }
.codicon-no-newline:before { content: '\eb25'; }
.codicon-note:before { content: '\eb26'; }
.codicon-octoface:before { content: '\eb27'; }
.codicon-open-preview:before { content: '\eb28'; }
.codicon-package:before { content: '\eb29'; }
.codicon-paintcan:before { content: '\eb2a'; }
.codicon-pin:before { content: '\eb2b'; }
.codicon-play:before { content: '\eb2c'; }
.codicon-run:before { content: '\eb2c'; }
.codicon-plug:before { content: '\eb2d'; }
.codicon-preserve-case:before { content: '\eb2e'; }
.codicon-preview:before { content: '\eb2f'; }
.codicon-project:before { content: '\eb30'; }
.codicon-pulse:before { content: '\eb31'; }
.codicon-question:before { content: '\eb32'; }
.codicon-quote:before { content: '\eb33'; }
.codicon-radio-tower:before { content: '\eb34'; }
.codicon-reactions:before { content: '\eb35'; }
.codicon-references:before { content: '\eb36'; }
.codicon-refresh:before { content: '\eb37'; }
.codicon-regex:before { content: '\eb38'; }
.codicon-remote-explorer:before { content: '\eb39'; }
.codicon-remote:before { content: '\eb3a'; }
.codicon-remove:before { content: '\eb3b'; }
.codicon-replace-all:before { content: '\eb3c'; }
.codicon-replace:before { content: '\eb3d'; }
.codicon-repo-clone:before { content: '\eb3e'; }
.codicon-repo-force-push:before { content: '\eb3f'; }
.codicon-repo-pull:before { content: '\eb40'; }
.codicon-repo-push:before { content: '\eb41'; }
.codicon-report:before { content: '\eb42'; }
.codicon-request-changes:before { content: '\eb43'; }
.codicon-rocket:before { content: '\eb44'; }
.codicon-root-folder-opened:before { content: '\eb45'; }
.codicon-root-folder:before { content: '\eb46'; }
.codicon-rss:before { content: '\eb47'; }
.codicon-ruby:before { content: '\eb48'; }
.codicon-save-all:before { content: '\eb49'; }
.codicon-save-as:before { content: '\eb4a'; }
.codicon-save:before { content: '\eb4b'; }
.codicon-screen-full:before { content: '\eb4c'; }
.codicon-screen-normal:before { content: '\eb4d'; }
.codicon-search-stop:before { content: '\eb4e'; }
.codicon-server:before { content: '\eb50'; }
.codicon-settings-gear:before { content: '\eb51'; }
.codicon-settings:before { content: '\eb52'; }
.codicon-shield:before { content: '\eb53'; }
.codicon-smiley:before { content: '\eb54'; }
.codicon-sort-precedence:before { content: '\eb55'; }
.codicon-split-horizontal:before { content: '\eb56'; }
.codicon-split-vertical:before { content: '\eb57'; }
.codicon-squirrel:before { content: '\eb58'; }
.codicon-star-full:before { content: '\eb59'; }
.codicon-star-half:before { content: '\eb5a'; }
.codicon-symbol-class:before { content: '\eb5b'; }
.codicon-symbol-color:before { content: '\eb5c'; }
.codicon-symbol-customcolor:before { content: '\eb5c'; }
.codicon-symbol-constant:before { content: '\eb5d'; }
.codicon-symbol-enum-member:before { content: '\eb5e'; }
.codicon-symbol-field:before { content: '\eb5f'; }
.codicon-symbol-file:before { content: '\eb60'; }
.codicon-symbol-interface:before { content: '\eb61'; }
.codicon-symbol-keyword:before { content: '\eb62'; }
.codicon-symbol-misc:before { content: '\eb63'; }
.codicon-symbol-operator:before { content: '\eb64'; }
.codicon-symbol-property:before { content: '\eb65'; }
.codicon-wrench:before { content: '\eb65'; }
.codicon-wrench-subaction:before { content: '\eb65'; }
.codicon-symbol-snippet:before { content: '\eb66'; }
.codicon-tasklist:before { content: '\eb67'; }
.codicon-telescope:before { content: '\eb68'; }
.codicon-text-size:before { content: '\eb69'; }
.codicon-three-bars:before { content: '\eb6a'; }
.codicon-thumbsdown:before { content: '\eb6b'; }
.codicon-thumbsup:before { content: '\eb6c'; }
.codicon-tools:before { content: '\eb6d'; }
.codicon-triangle-down:before { content: '\eb6e'; }
.codicon-triangle-left:before { content: '\eb6f'; }
.codicon-triangle-right:before { content: '\eb70'; }
.codicon-triangle-up:before { content: '\eb71'; }
.codicon-twitter:before { content: '\eb72'; }
.codicon-unfold:before { content: '\eb73'; }
.codicon-unlock:before { content: '\eb74'; }
.codicon-unmute:before { content: '\eb75'; }
.codicon-unverified:before { content: '\eb76'; }
.codicon-verified:before { content: '\eb77'; }
.codicon-versions:before { content: '\eb78'; }
.codicon-vm-active:before { content: '\eb79'; }
.codicon-vm-outline:before { content: '\eb7a'; }
.codicon-vm-running:before { content: '\eb7b'; }
.codicon-watch:before { content: '\eb7c'; }
.codicon-whitespace:before { content: '\eb7d'; }
.codicon-whole-word:before { content: '\eb7e'; }
.codicon-window:before { content: '\eb7f'; }
.codicon-word-wrap:before { content: '\eb80'; }
.codicon-zoom-in:before { content: '\eb81'; }
.codicon-zoom-out:before { content: '\eb82'; }
.codicon-list-filter:before { content: '\eb83'; }
.codicon-list-flat:before { content: '\eb84'; }
.codicon-list-selection:before { content: '\eb85'; }
.codicon-selection:before { content: '\eb85'; }
.codicon-list-tree:before { content: '\eb86'; }
.codicon-debug-breakpoint-function-unverified:before { content: '\eb87'; }
.codicon-debug-breakpoint-function:before { content: '\eb88'; }
.codicon-debug-breakpoint-function-disabled:before { content: '\eb88'; }
.codicon-debug-stackframe-active:before { content: '\eb89'; }
.codicon-debug-stackframe-dot:before { content: '\eb8a'; }
.codicon-debug-stackframe:before { content: '\eb8b'; }
.codicon-debug-stackframe-focused:before { content: '\eb8b'; }
.codicon-debug-breakpoint-unsupported:before { content: '\eb8c'; }
.codicon-symbol-string:before { content: '\eb8d'; }
.codicon-debug-reverse-continue:before { content: '\eb8e'; }
.codicon-debug-step-back:before { content: '\eb8f'; }
.codicon-debug-restart-frame:before { content: '\eb90'; }
.codicon-call-incoming:before { content: '\eb92'; }
.codicon-call-outgoing:before { content: '\eb93'; }
.codicon-menu:before { content: '\eb94'; }
.codicon-expand-all:before { content: '\eb95'; }
.codicon-feedback:before { content: '\eb96'; }
.codicon-group-by-ref-type:before { content: '\eb97'; }
.codicon-ungroup-by-ref-type:before { content: '\eb98'; }
.codicon-account:before { content: '\eb99'; }
.codicon-bell-dot:before { content: '\eb9a'; }
.codicon-debug-console:before { content: '\eb9b'; }
.codicon-library:before { content: '\eb9c'; }
.codicon-output:before { content: '\eb9d'; }
.codicon-run-all:before { content: '\eb9e'; }
.codicon-sync-ignored:before { content: '\eb9f'; }
.codicon-pinned:before { content: '\eba0'; }
.codicon-github-inverted:before { content: '\eba1'; }
.codicon-debug-alt:before { content: '\eb91'; }
.codicon-server-process:before { content: '\eba2'; }
.codicon-server-environment:before { content: '\eba3'; }
.codicon-pass:before { content: '\eba4'; }
.codicon-stop-circle:before { content: '\eba5'; }
.codicon-play-circle:before { content: '\eba6'; }
.codicon-record:before { content: '\eba7'; }
.codicon-debug-alt-small:before { content: '\eba8'; }
.codicon-vm-connect:before { content: '\eba9'; }
.codicon-cloud:before { content: '\ebaa'; }
.codicon-merge:before { content: '\ebab'; }
.codicon-export:before { content: '\ebac'; }
.codicon-graph-left:before { content: '\ebad'; }
.codicon-magnet:before { content: '\ebae'; }
.codicon-notebook:before { content: '\ebaf'; }
.codicon-redo:before { content: '\ebb0'; }
.codicon-check-all:before { content: '\ebb1'; }
.codicon-pinned-dirty:before { content: '\ebb2'; }
.codicon-pass-filled:before { content: '\ebb3'; }
.codicon-circle-large-filled:before { content: '\ebb4'; }
.codicon-circle-large-outline:before { content: '\ebb5'; }
.codicon-combine:before { content: '\ebb6'; }
.codicon-gather:before { content: '\ebb6'; }
.codicon-table:before { content: '\ebb7'; }
.codicon-variable-group:before { content: '\ebb8'; }
.codicon-type-hierarchy:before { content: '\ebb9'; }
.codicon-type-hierarchy-sub:before { content: '\ebba'; }
.codicon-type-hierarchy-super:before { content: '\ebbb'; }
.codicon-git-pull-request-create:before { content: '\ebbc'; }
.codicon-run-above:before { content: '\ebbd'; }
.codicon-run-below:before { content: '\ebbe'; }
.codicon-notebook-template:before { content: '\ebbf'; }
.codicon-debug-rerun:before { content: '\ebc0'; }
.codicon-workspace-trusted:before { content: '\ebc1'; }
.codicon-workspace-untrusted:before { content: '\ebc2'; }
.codicon-workspace-unspecified:before { content: '\ebc3'; }
.codicon-terminal-cmd:before { content: '\ebc4'; }
.codicon-terminal-debian:before { content: '\ebc5'; }
.codicon-terminal-linux:before { content: '\ebc6'; }
.codicon-terminal-powershell:before { content: '\ebc7'; }
.codicon-terminal-tmux:before { content: '\ebc8'; }
.codicon-terminal-ubuntu:before { content: '\ebc9'; }
.codicon-terminal-bash:before { content: '\ebca'; }
.codicon-arrow-swap:before { content: '\ebcb'; }
.codicon-copy:before { content: '\ebcc'; }
.codicon-person-add:before { content: '\ebcd'; }
.codicon-filter-filled:before { content: '\ebce'; }
.codicon-wand:before { content: '\ebcf'; }
.codicon-debug-line-by-line:before { content: '\ebd0'; }
.codicon-inspect:before { content: '\ebd1'; }
.codicon-layers:before { content: '\ebd2'; }
.codicon-layers-dot:before { content: '\ebd3'; }
.codicon-layers-active:before { content: '\ebd4'; }
.codicon-compass:before { content: '\ebd5'; }
.codicon-compass-dot:before { content: '\ebd6'; }
.codicon-compass-active:before { content: '\ebd7'; }
.codicon-azure:before { content: '\ebd8'; }
.codicon-issue-draft:before { content: '\ebd9'; }
.codicon-git-pull-request-closed:before { content: '\ebda'; }
.codicon-git-pull-request-draft:before { content: '\ebdb'; }
.codicon-debug-all:before { content: '\ebdc'; }
.codicon-debug-coverage:before { content: '\ebdd'; }
.codicon-run-errors:before { content: '\ebde'; }
.codicon-folder-library:before { content: '\ebdf'; }
.codicon-debug-continue-small:before { content: '\ebe0'; }
.codicon-beaker-stop:before { content: '\ebe1'; }
.codicon-graph-line:before { content: '\ebe2'; }
.codicon-graph-scatter:before { content: '\ebe3'; }
.codicon-pie-chart:before { content: '\ebe4'; }
.codicon-bracket:before { content: '\eb0f'; }
.codicon-bracket-dot:before { content: '\ebe5'; }
.codicon-bracket-error:before { content: '\ebe6'; }
.codicon-lock-small:before { content: '\ebe7'; }
.codicon-azure-devops:before { content: '\ebe8'; }
.codicon-verified-filled:before { content: '\ebe9'; }
.codicon-newline:before { content: '\ebea'; }
.codicon-layout:before { content: '\ebeb'; }
.codicon-layout-activitybar-left:before { content: '\ebec'; }
.codicon-layout-activitybar-right:before { content: '\ebed'; }
.codicon-layout-panel-left:before { content: '\ebee'; }
.codicon-layout-panel-center:before { content: '\ebef'; }
.codicon-layout-panel-justify:before { content: '\ebf0'; }
.codicon-layout-panel-right:before { content: '\ebf1'; }
.codicon-layout-panel:before { content: '\ebf2'; }
.codicon-layout-sidebar-left:before { content: '\ebf3'; }
.codicon-layout-sidebar-right:before { content: '\ebf4'; }
.codicon-layout-statusbar:before { content: '\ebf5'; }
.codicon-layout-menubar:before { content: '\ebf6'; }
.codicon-layout-centered:before { content: '\ebf7'; }
.codicon-target:before { content: '\ebf8'; }
.codicon-indent:before { content: '\ebf9'; }
.codicon-record-small:before { content: '\ebfa'; }
.codicon-error-small:before { content: '\ebfb'; }
.codicon-arrow-circle-down:before { content: '\ebfc'; }
.codicon-arrow-circle-left:before { content: '\ebfd'; }
.codicon-arrow-circle-right:before { content: '\ebfe'; }
.codicon-arrow-circle-up:before { content: '\ebff'; }
.codicon-dialog-error:before { content: '\ea87'; }
.codicon-dialog-warning:before { content: '\ea6c'; }
.codicon-dialog-info:before { content: '\ea74'; }
.codicon-dialog-close:before { content: '\ea76'; }
.codicon-tree-item-expanded:before { content: '\eab4'; }
.codicon-tree-filter-on-type-on:before { content: '\eb83'; }
.codicon-tree-filter-on-type-off:before { content: '\eb85'; }
.codicon-tree-filter-clear:before { content: '\ea76'; }
.codicon-tree-item-loading:before { content: '\eb19'; }
.codicon-menu-selection:before { content: '\eab2'; }
.codicon-menu-submenu:before { content: '\eab6'; }
.codicon-menubar-more:before { content: '\ea7c'; }
.codicon-scrollbar-button-left:before { content: '\eb6f'; }
.codicon-scrollbar-button-right:before { content: '\eb70'; }
.codicon-scrollbar-button-up:before { content: '\eb71'; }
.codicon-scrollbar-button-down:before { content: '\eb6e'; }
.codicon-toolbar-more:before { content: '\ea7c'; }
.codicon-quick-input-back:before { content: '\ea9b'; }
.codicon-widget-close:before { content: '\ea76'; }
.codicon-goto-previous-location:before { content: '\eaa1'; }
.codicon-goto-next-location:before { content: '\ea9a'; }
.codicon-find-selection:before { content: '\eb85'; }
.codicon-find-collapsed:before { content: '\eab6'; }
.codicon-find-expanded:before { content: '\eab4'; }
.codicon-find-replace:before { content: '\eb3d'; }
.codicon-find-replace-all:before { content: '\eb3c'; }
.codicon-find-previous-match:before { content: '\eaa1'; }
.codicon-find-next-match:before { content: '\ea9a'; }
.codicon-marker-navigation-next:before { content: '\ea9a'; }
.codicon-marker-navigation-previous:before { content: '\eaa1'; }
.codicon-parameter-hints-next:before { content: '\eab4'; }
.codicon-parameter-hints-previous:before { content: '\eab7'; }
.codicon-suggest-more-info:before { content: '\eab6'; }
.codicon-diff-review-insert:before { content: '\ea60'; }
.codicon-diff-review-remove:before { content: '\eb3b'; }
.codicon-diff-review-close:before { content: '\ea76'; }
.codicon-diff-insert:before { content: '\ea60'; }
.codicon-diff-remove:before { content: '\eb3b'; }
.monaco-editor, .monaco-editor-background, .monaco-editor .inputarea.ime-input { background-color: #fffffe; }
.monaco-editor, .monaco-editor .inputarea.ime-input { color: #333333; }
.monaco-editor .margin { background-color: #fffffe; }
.monaco-editor .rangeHighlight { background-color: rgba(253, 255, 0, 0.2); }
.monaco-editor .symbolHighlight { background-color: rgba(234, 92, 0, 0.33); }
.monaco-editor .mtkw { color: rgba(51, 51, 51, 0.2) !important; }
.monaco-editor .mtkz { color: rgba(51, 51, 51, 0.2) !important; }
.monaco-editor .line-numbers { color: #237893; }
.monaco-editor .line-numbers.active-line-number { color: #0b216f; }
.monaco-editor .view-overlays .current-line { border: 2px solid #eeeeee; }
.monaco-editor .margin-view-overlays .current-line-margin { border: 2px solid #eeeeee; }

			.monaco-scrollable-element > .shadow.top {
				box-shadow: #dddddd 0 6px 6px -6px inset;
			}

			.monaco-scrollable-element > .shadow.left {
				box-shadow: #dddddd 6px 0 6px -6px inset;
			}

			.monaco-scrollable-element > .shadow.top.left {
				box-shadow: #dddddd 6px 6px 6px -6px inset;
			}
		

			.monaco-scrollable-element > .scrollbar > .slider {
				background: rgba(100, 100, 100, 0.4);
			}
		

			.monaco-scrollable-element > .scrollbar > .slider:hover {
				background: rgba(100, 100, 100, 0.7);
			}
		

			.monaco-scrollable-element > .scrollbar > .slider.active {
				background: rgba(0, 0, 0, 0.6);
			}
		
.monaco-editor .lines-content .core-guide-indent { box-shadow: 1px 0 0 0 rgba(51, 51, 51, 0.2) inset; }
.monaco-editor .lines-content .core-guide-indent-active { box-shadow: 1px 0 0 0 rgba(51, 51, 51, 0.2) inset; }
.monaco-editor .bracket-indent-guide.lvl-0 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-1 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-2 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .bracket-indent-guide.lvl-3 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-4 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-5 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .bracket-indent-guide.lvl-6 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-7 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-8 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .bracket-indent-guide.lvl-9 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-10 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-11 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .bracket-indent-guide.lvl-12 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-13 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-14 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .bracket-indent-guide.lvl-15 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-16 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-17 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .bracket-indent-guide.lvl-18 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-19 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-20 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .bracket-indent-guide.lvl-21 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-22 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-23 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .bracket-indent-guide.lvl-24 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-25 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-26 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .bracket-indent-guide.lvl-27 { --guide-color: rgba(4, 49, 250, 0.3); --guide-color-active: #0431fa; }
.monaco-editor .bracket-indent-guide.lvl-28 { --guide-color: rgba(49, 147, 49, 0.3); --guide-color-active: #319331; }
.monaco-editor .bracket-indent-guide.lvl-29 { --guide-color: rgba(123, 56, 20, 0.3); --guide-color-active: #7b3814; }
.monaco-editor .vertical { box-shadow: 1px 0 0 0 var(--guide-color) inset; }
.monaco-editor .horizontal-top { border-top: 1px solid var(--guide-color); }
.monaco-editor .horizontal-bottom { border-bottom: 1px solid var(--guide-color); }
.monaco-editor .vertical.indent-active { box-shadow: 1px 0 0 0 var(--guide-color-active) inset; }
.monaco-editor .horizontal-top.indent-active { border-top: 1px solid var(--guide-color-active); }
.monaco-editor .horizontal-bottom.indent-active { border-bottom: 1px solid var(--guide-color-active); }
.monaco-editor .minimap-slider .minimap-slider-horizontal { background: rgba(100, 100, 100, 0.2); }
.monaco-editor .minimap-slider:hover .minimap-slider-horizontal { background: rgba(100, 100, 100, 0.35); }
.monaco-editor .minimap-slider.active .minimap-slider-horizontal { background: rgba(0, 0, 0, 0.3); }
.monaco-editor .minimap-shadow-visible { box-shadow: #dddddd -6px 0 6px -6px inset; }
.monaco-editor .view-ruler { box-shadow: 1px 0 0 0 #d3d3d3 inset; }
.monaco-editor .scroll-decoration { box-shadow: #dddddd 0 6px 6px -6px inset; }
.monaco-editor .focused .selected-text { background-color: #add6ff; }
.monaco-editor .selected-text { background-color: rgba(173, 214, 255, 0.5); }
.monaco-editor .inputarea.ime-input { caret-color: #000000; }
.monaco-editor .cursors-layer .cursor { background-color: #000000; border-color: #000000; color: #ffffff; }
.monaco-editor .unexpected-closing-bracket { color: rgba(255, 18, 18, 0.8); }
.monaco-editor .bracket-highlighting-0 { color: #0431fa; }
.monaco-editor .bracket-highlighting-1 { color: #319331; }
.monaco-editor .bracket-highlighting-2 { color: #7b3814; }
.monaco-editor .bracket-highlighting-3 { color: #0431fa; }
.monaco-editor .bracket-highlighting-4 { color: #319331; }
.monaco-editor .bracket-highlighting-5 { color: #7b3814; }
.monaco-editor .bracket-highlighting-6 { color: #0431fa; }
.monaco-editor .bracket-highlighting-7 { color: #319331; }
.monaco-editor .bracket-highlighting-8 { color: #7b3814; }
.monaco-editor .bracket-highlighting-9 { color: #0431fa; }
.monaco-editor .bracket-highlighting-10 { color: #319331; }
.monaco-editor .bracket-highlighting-11 { color: #7b3814; }
.monaco-editor .bracket-highlighting-12 { color: #0431fa; }
.monaco-editor .bracket-highlighting-13 { color: #319331; }
.monaco-editor .bracket-highlighting-14 { color: #7b3814; }
.monaco-editor .bracket-highlighting-15 { color: #0431fa; }
.monaco-editor .bracket-highlighting-16 { color: #319331; }
.monaco-editor .bracket-highlighting-17 { color: #7b3814; }
.monaco-editor .bracket-highlighting-18 { color: #0431fa; }
.monaco-editor .bracket-highlighting-19 { color: #319331; }
.monaco-editor .bracket-highlighting-20 { color: #7b3814; }
.monaco-editor .bracket-highlighting-21 { color: #0431fa; }
.monaco-editor .bracket-highlighting-22 { color: #319331; }
.monaco-editor .bracket-highlighting-23 { color: #7b3814; }
.monaco-editor .bracket-highlighting-24 { color: #0431fa; }
.monaco-editor .bracket-highlighting-25 { color: #319331; }
.monaco-editor .bracket-highlighting-26 { color: #7b3814; }
.monaco-editor .bracket-highlighting-27 { color: #0431fa; }
.monaco-editor .bracket-highlighting-28 { color: #319331; }
.monaco-editor .bracket-highlighting-29 { color: #7b3814; }
.monaco-editor .squiggly-error { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23e51400'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-warning { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23bf8803'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-info { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%231a85ff'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-hint { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20height%3D%223%22%20width%3D%2212%22%3E%3Cg%20fill%3D%22%236c6c6c%22%3E%3Ccircle%20cx%3D%221%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%225%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%229%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") no-repeat bottom left; }
.monaco-editor.showUnused .squiggly-inline-unnecessary { opacity: 0.467; }
.monaco-editor.showDeprecated .squiggly-inline-deprecated { text-decoration: line-through; text-decoration-color: #333333}
.monaco-editor .bracket-match { background-color: rgba(0, 100, 0, 0.1); }
.monaco-editor .bracket-match { border: 1px solid #b9b9b9; }
.monaco-editor .findOptionsWidget { background-color: #f3f3f3; }
.monaco-editor .findOptionsWidget { color: #616161; }
.monaco-editor .findOptionsWidget { box-shadow: 0 0 8px 2px rgba(0, 0, 0, 0.16); }
.monaco-editor .findMatch { background-color: rgba(234, 92, 0, 0.33); }
.monaco-editor .currentFindMatch { background-color: #a8ac94; }
.monaco-editor .findScope { background-color: rgba(180, 180, 180, 0.3); }
.monaco-editor .find-widget { background-color: #f3f3f3; }
.monaco-editor .find-widget { box-shadow: 0 0 8px 2px rgba(0, 0, 0, 0.16); }
.monaco-editor .find-widget { color: #616161; }
.monaco-editor .find-widget.no-results .matchesCount { color: #a1260d; }
.monaco-editor .find-widget .monaco-sash { background-color: #c8c8c8; }

		.monaco-editor .find-widget .button:not(.disabled):hover,
		.monaco-editor .find-widget .codicon-find-selection:hover {
			background-color: rgba(184, 184, 184, 0.31) !important;
		}
	
.monaco-editor .find-widget .monaco-inputbox.synthetic-focus { outline-color: #0090f1; }
.monaco-editor .goto-definition-link { color: #0000ff !important; }

		.monaco-editor .contentWidgets .codicon.codicon-light-bulb {
			color: #ddb100;
			background-color: rgba(255, 255, 254, 0.7);
		}

		.monaco-editor .contentWidgets .codicon.codicon-lightbulb-autofix {
			color: #007acc;
			background-color: rgba(255, 255, 254, 0.7);
		}

			.monaco-editor .zone-widget .codicon.codicon-error,
			.markers-panel .marker-icon.codicon.codicon-error,
			.text-search-provider-messages .providerMessage .codicon.codicon-error,
			.extensions-viewlet > .extensions .codicon.codicon-error {
				color: #e51400;
			}
		

			.monaco-editor .zone-widget .codicon.codicon-warning,
			.markers-panel .marker-icon.codicon.codicon-warning,
			.extensions-viewlet > .extensions .codicon.codicon-warning,
			.extension-editor .codicon.codicon-warning,
			.text-search-provider-messages .providerMessage .codicon.codicon-warning,
			.preferences-editor .codicon.codicon-warning {
				color: #bf8803;
			}
		

			.monaco-editor .zone-widget .codicon.codicon-info,
			.markers-panel .marker-icon.codicon.codicon-info,
			.extensions-viewlet > .extensions .codicon.codicon-info,
			.text-search-provider-messages .providerMessage .codicon.codicon-info,
			.extension-editor .codicon.codicon-info {
				color: #1a85ff;
			}
		
.monaco-hover .hover-contents a.code-link span { color: #006ab1; }
.monaco-hover .hover-contents a.code-link span:hover { color: #006ab1; }
.monaco-editor .hoverHighlight { background-color: rgba(173, 214, 255, 0.15); }
.monaco-editor .monaco-hover { background-color: #f3f3f3; }
.monaco-editor .monaco-hover { border: 1px solid #c8c8c8; }
.monaco-editor .monaco-hover .hover-row:not(:first-child):not(:empty) { border-top: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .monaco-hover hr { border-top: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .monaco-hover hr { border-bottom: 0px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .monaco-hover a { color: #006ab1; }
.monaco-editor .monaco-hover a:hover { color: #006ab1; }
.monaco-editor .monaco-hover { color: #616161; }
.monaco-editor .monaco-hover .hover-row .actions { background-color: #e7e7e7; }
.monaco-editor .monaco-hover code { background-color: rgba(220, 220, 220, 0.4); }
.monaco-editor.vs .valueSetReplacement { outline: solid 2px #b9b9b9; }
.monaco-editor .detected-link-active { color: #0000ff !important; }
.monaco-editor .parameter-hints-widget { border: 1px solid #c8c8c8; }
.monaco-editor .parameter-hints-widget.multiple .body { border-left: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .parameter-hints-widget .signature.has-docs { border-bottom: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .parameter-hints-widget { background-color: #f3f3f3; }
.monaco-editor .parameter-hints-widget a { color: #006ab1; }
.monaco-editor .parameter-hints-widget a:hover { color: #006ab1; }
.monaco-editor .parameter-hints-widget { color: #616161; }
.monaco-editor .parameter-hints-widget code { background-color: rgba(220, 220, 220, 0.4); }
.monaco-editor .parameter-hints-widget .parameter.active { color: #0066bf}
.codicon.codicon-symbol-array { color: #616161; }
.codicon.codicon-symbol-boolean { color: #616161; }
.codicon.codicon-symbol-class { color: #d67e00; }
.codicon.codicon-symbol-method { color: #652d90; }
.codicon.codicon-symbol-color { color: #616161; }
.codicon.codicon-symbol-constant { color: #616161; }
.codicon.codicon-symbol-constructor { color: #652d90; }

			.codicon.codicon-symbol-value,.codicon.codicon-symbol-enum { color: #d67e00; }
.codicon.codicon-symbol-enum-member { color: #007acc; }
.codicon.codicon-symbol-event { color: #d67e00; }
.codicon.codicon-symbol-field { color: #007acc; }
.codicon.codicon-symbol-file { color: #616161; }
.codicon.codicon-symbol-folder { color: #616161; }
.codicon.codicon-symbol-function { color: #652d90; }
.codicon.codicon-symbol-interface { color: #007acc; }
.codicon.codicon-symbol-key { color: #616161; }
.codicon.codicon-symbol-keyword { color: #616161; }
.codicon.codicon-symbol-module { color: #616161; }
.codicon.codicon-symbol-namespace { color: #616161; }
.codicon.codicon-symbol-null { color: #616161; }
.codicon.codicon-symbol-number { color: #616161; }
.codicon.codicon-symbol-object { color: #616161; }
.codicon.codicon-symbol-operator { color: #616161; }
.codicon.codicon-symbol-package { color: #616161; }
.codicon.codicon-symbol-property { color: #616161; }
.codicon.codicon-symbol-reference { color: #616161; }
.codicon.codicon-symbol-snippet { color: #616161; }
.codicon.codicon-symbol-string { color: #616161; }
.codicon.codicon-symbol-struct { color: #616161; }
.codicon.codicon-symbol-text { color: #616161; }
.codicon.codicon-symbol-type-parameter { color: #616161; }
.codicon.codicon-symbol-unit { color: #616161; }
.codicon.codicon-symbol-variable { color: #007acc; }
.monaco-editor .focused .selectionHighlight { background-color: rgba(219, 237, 255, 0.6); }
.monaco-editor .selectionHighlight { background-color: rgba(219, 237, 255, 0.3); }
.monaco-editor .wordHighlight { background-color: rgba(87, 87, 87, 0.25); }
.monaco-editor .wordHighlightStrong { background-color: rgba(14, 99, 156, 0.25); }
.monaco-editor .accessibilityHelpWidget { background-color: #f3f3f3; }
.monaco-editor .accessibilityHelpWidget { color: #616161; }
.monaco-editor .accessibilityHelpWidget { box-shadow: 0 2px 8px rgba(0, 0, 0, 0.16); }
.monaco-editor .tokens-inspect-widget { border: 1px solid #c8c8c8; }
.monaco-editor .tokens-inspect-widget .tokens-inspect-separator { background-color: #c8c8c8; }
.monaco-editor .tokens-inspect-widget { background-color: #f3f3f3; }
.monaco-editor .tokens-inspect-widget { color: #616161; }
.monaco-diff-editor .diff-review-line-number { color: #237893; }
.monaco-diff-editor .diff-review-shadow { box-shadow: #dddddd 0 -6px 6px -6px inset; }
.monaco-editor .char-insert, .monaco-diff-editor .char-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .line-insert, .monaco-diff-editor .line-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .inline-added-margin-view-zone { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .gutter-insert, .monaco-diff-editor .gutter-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .char-delete, .monaco-diff-editor .char-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .line-delete, .monaco-diff-editor .line-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .inline-deleted-margin-view-zone { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .gutter-delete, .monaco-diff-editor .gutter-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-diff-editor.side-by-side .editor.modified { box-shadow: -6px 0 5px -5px #dddddd; }

			.monaco-diff-editor .diffViewport {
				background: rgba(100, 100, 100, 0.4);
			}
		

			.monaco-diff-editor .diffViewport:hover {
				background: rgba(100, 100, 100, 0.7);
			}
		

			.monaco-diff-editor .diffViewport:active {
				background: rgba(0, 0, 0, 0.6);
			}
		

	.monaco-editor .diagonal-fill {
		background-image: linear-gradient(
			-45deg,
			rgba(34, 34, 34, 0.2) 12.5%,
			#0000 12.5%, #0000 50%,
			rgba(34, 34, 34, 0.2) 50%, rgba(34, 34, 34, 0.2) 62.5%,
			#0000 62.5%, #0000 100%
		);
		background-size: 8px 8px;
	}
	
.monaco-editor { --vscode-foreground: #616161;
--vscode-errorForeground: #a1260d;
--vscode-descriptionForeground: #717171;
--vscode-icon-foreground: #424242;
--vscode-focusBorder: #0090f1;
--vscode-textSeparator-foreground: rgba(0, 0, 0, 0.18);
--vscode-textLink-foreground: #006ab1;
--vscode-textLink-activeForeground: #006ab1;
--vscode-textPreformat-foreground: #a31515;
--vscode-textBlockQuote-background: rgba(127, 127, 127, 0.1);
--vscode-textBlockQuote-border: rgba(0, 122, 204, 0.5);
--vscode-textCodeBlock-background: rgba(220, 220, 220, 0.4);
--vscode-widget-shadow: rgba(0, 0, 0, 0.16);
--vscode-input-background: #ffffff;
--vscode-input-foreground: #616161;
--vscode-inputOption-activeBorder: rgba(0, 122, 204, 0);
--vscode-inputOption-hoverBackground: rgba(184, 184, 184, 0.31);
--vscode-inputOption-activeBackground: rgba(0, 144, 241, 0.2);
--vscode-inputOption-activeForeground: #000000;
--vscode-input-placeholderForeground: rgba(97, 97, 97, 0.5);
--vscode-inputValidation-infoBackground: #d6ecf2;
--vscode-inputValidation-infoBorder: #007acc;
--vscode-inputValidation-warningBackground: #f6f5d2;
--vscode-inputValidation-warningBorder: #b89500;
--vscode-inputValidation-errorBackground: #f2dede;
--vscode-inputValidation-errorBorder: #be1100;
--vscode-dropdown-background: #ffffff;
--vscode-dropdown-border: #cecece;
--vscode-checkbox-background: #ffffff;
--vscode-checkbox-border: #cecece;
--vscode-button-foreground: #ffffff;
--vscode-button-background: #007acc;
--vscode-button-hoverBackground: #0062a3;
--vscode-button-secondaryForeground: #ffffff;
--vscode-button-secondaryBackground: #5f6a79;
--vscode-button-secondaryHoverBackground: #4c5561;
--vscode-badge-background: #c4c4c4;
--vscode-badge-foreground: #333333;
--vscode-scrollbar-shadow: #dddddd;
--vscode-scrollbarSlider-background: rgba(100, 100, 100, 0.4);
--vscode-scrollbarSlider-hoverBackground: rgba(100, 100, 100, 0.7);
--vscode-scrollbarSlider-activeBackground: rgba(0, 0, 0, 0.6);
--vscode-progressBar-background: #0e70c0;
--vscode-editorError-foreground: #e51400;
--vscode-editorWarning-foreground: #bf8803;
--vscode-editorInfo-foreground: #1a85ff;
--vscode-editorHint-foreground: #6c6c6c;
--vscode-sash-hoverBorder: #0090f1;
--vscode-editor-background: #fffffe;
--vscode-editor-foreground: #333333;
--vscode-editorWidget-background: #f3f3f3;
--vscode-editorWidget-foreground: #616161;
--vscode-editorWidget-border: #c8c8c8;
--vscode-quickInput-background: #f3f3f3;
--vscode-quickInput-foreground: #616161;
--vscode-quickInputTitle-background: rgba(0, 0, 0, 0.06);
--vscode-pickerGroup-foreground: #0066bf;
--vscode-pickerGroup-border: #cccedb;
--vscode-keybindingLabel-background: rgba(221, 221, 221, 0.4);
--vscode-keybindingLabel-foreground: #555555;
--vscode-keybindingLabel-border: rgba(204, 204, 204, 0.4);
--vscode-keybindingLabel-bottomBorder: rgba(187, 187, 187, 0.4);
--vscode-editor-selectionBackground: #add6ff;
--vscode-editor-inactiveSelectionBackground: rgba(173, 214, 255, 0.5);
--vscode-editor-selectionHighlightBackground: rgba(219, 237, 255, 0.6);
--vscode-editor-findMatchBackground: #a8ac94;
--vscode-editor-findMatchHighlightBackground: rgba(234, 92, 0, 0.33);
--vscode-editor-findRangeHighlightBackground: rgba(180, 180, 180, 0.3);
--vscode-searchEditor-findMatchBackground: rgba(234, 92, 0, 0.22);
--vscode-editor-hoverHighlightBackground: rgba(173, 214, 255, 0.15);
--vscode-editorHoverWidget-background: #f3f3f3;
--vscode-editorHoverWidget-foreground: #616161;
--vscode-editorHoverWidget-border: #c8c8c8;
--vscode-editorHoverWidget-statusBarBackground: #e7e7e7;
--vscode-editorLink-activeForeground: #0000ff;
--vscode-editorInlayHint-foreground: rgba(51, 51, 51, 0.8);
--vscode-editorInlayHint-background: rgba(196, 196, 196, 0.3);
--vscode-editorInlayHint-typeForeground: rgba(51, 51, 51, 0.8);
--vscode-editorInlayHint-typeBackground: rgba(196, 196, 196, 0.3);
--vscode-editorInlayHint-parameterForeground: rgba(51, 51, 51, 0.8);
--vscode-editorInlayHint-parameterBackground: rgba(196, 196, 196, 0.3);
--vscode-editorLightBulb-foreground: #ddb100;
--vscode-editorLightBulbAutoFix-foreground: #007acc;
--vscode-diffEditor-insertedTextBackground: rgba(155, 185, 85, 0.2);
--vscode-diffEditor-removedTextBackground: rgba(255, 0, 0, 0.2);
--vscode-diffEditor-diagonalFill: rgba(34, 34, 34, 0.2);
--vscode-list-focusOutline: #0090f1;
--vscode-list-activeSelectionBackground: #0060c0;
--vscode-list-activeSelectionForeground: #ffffff;
--vscode-list-inactiveSelectionBackground: #e4e6f1;
--vscode-list-hoverBackground: #f0f0f0;
--vscode-list-dropBackground: #d6ebff;
--vscode-list-highlightForeground: #0066bf;
--vscode-list-focusHighlightForeground: #9dddff;
--vscode-list-invalidItemForeground: #b89500;
--vscode-list-errorForeground: #b01011;
--vscode-list-warningForeground: #855f00;
--vscode-listFilterWidget-background: #efc1ad;
--vscode-listFilterWidget-outline: rgba(0, 0, 0, 0);
--vscode-listFilterWidget-noMatchesOutline: #be1100;
--vscode-list-filterMatchBackground: rgba(234, 92, 0, 0.33);
--vscode-tree-indentGuidesStroke: #a9a9a9;
--vscode-tree-tableColumnsBorder: rgba(97, 97, 97, 0.13);
--vscode-tree-tableOddRowsBackground: rgba(97, 97, 97, 0.04);
--vscode-list-deemphasizedForeground: #8e8e90;
--vscode-quickInputList-focusForeground: #ffffff;
--vscode-quickInputList-focusBackground: #0060c0;
--vscode-menu-foreground: #616161;
--vscode-menu-background: #ffffff;
--vscode-menu-selectionForeground: #ffffff;
--vscode-menu-selectionBackground: #0060c0;
--vscode-menu-separatorBackground: #888888;
--vscode-toolbar-hoverBackground: rgba(184, 184, 184, 0.31);
--vscode-toolbar-activeBackground: rgba(166, 166, 166, 0.31);
--vscode-editor-snippetTabstopHighlightBackground: rgba(10, 50, 100, 0.2);
--vscode-editor-snippetFinalTabstopHighlightBorder: rgba(10, 50, 100, 0.5);
--vscode-breadcrumb-foreground: rgba(97, 97, 97, 0.8);
--vscode-breadcrumb-background: #fffffe;
--vscode-breadcrumb-focusForeground: #4e4e4e;
--vscode-breadcrumb-activeSelectionForeground: #4e4e4e;
--vscode-breadcrumbPicker-background: #f3f3f3;
--vscode-merge-currentHeaderBackground: rgba(64, 200, 174, 0.5);
--vscode-merge-currentContentBackground: rgba(64, 200, 174, 0.2);
--vscode-merge-incomingHeaderBackground: rgba(64, 166, 255, 0.5);
--vscode-merge-incomingContentBackground: rgba(64, 166, 255, 0.2);
--vscode-merge-commonHeaderBackground: rgba(96, 96, 96, 0.4);
--vscode-merge-commonContentBackground: rgba(96, 96, 96, 0.16);
--vscode-editorOverviewRuler-currentContentForeground: rgba(64, 200, 174, 0.5);
--vscode-editorOverviewRuler-incomingContentForeground: rgba(64, 166, 255, 0.5);
--vscode-editorOverviewRuler-commonContentForeground: rgba(96, 96, 96, 0.4);
--vscode-editorOverviewRuler-findMatchForeground: rgba(209, 134, 22, 0.49);
--vscode-editorOverviewRuler-selectionHighlightForeground: rgba(160, 160, 160, 0.8);
--vscode-minimap-findMatchHighlight: #d18616;
--vscode-minimap-selectionOccurrenceHighlight: #c9c9c9;
--vscode-minimap-selectionHighlight: #add6ff;
--vscode-minimap-errorHighlight: rgba(255, 18, 18, 0.7);
--vscode-minimap-warningHighlight: #bf8803;
--vscode-minimap-foregroundOpacity: #000000;
--vscode-minimapSlider-background: rgba(100, 100, 100, 0.2);
--vscode-minimapSlider-hoverBackground: rgba(100, 100, 100, 0.35);
--vscode-minimapSlider-activeBackground: rgba(0, 0, 0, 0.3);
--vscode-problemsErrorIcon-foreground: #e51400;
--vscode-problemsWarningIcon-foreground: #bf8803;
--vscode-problemsInfoIcon-foreground: #1a85ff;
--vscode-charts-foreground: #616161;
--vscode-charts-lines: rgba(97, 97, 97, 0.5);
--vscode-charts-red: #e51400;
--vscode-charts-blue: #1a85ff;
--vscode-charts-yellow: #bf8803;
--vscode-charts-orange: #d18616;
--vscode-charts-green: #388a34;
--vscode-charts-purple: #652d90;
--vscode-editor-lineHighlightBorder: #eeeeee;
--vscode-editor-rangeHighlightBackground: rgba(253, 255, 0, 0.2);
--vscode-editor-symbolHighlightBackground: rgba(234, 92, 0, 0.33);
--vscode-editorCursor-foreground: #000000;
--vscode-editorWhitespace-foreground: rgba(51, 51, 51, 0.2);
--vscode-editorIndentGuide-background: rgba(51, 51, 51, 0.2);
--vscode-editorIndentGuide-activeBackground: rgba(51, 51, 51, 0.2);
--vscode-editorLineNumber-foreground: #237893;
--vscode-editorActiveLineNumber-foreground: #0b216f;
--vscode-editorLineNumber-activeForeground: #0b216f;
--vscode-editorRuler-foreground: #d3d3d3;
--vscode-editorCodeLens-foreground: #919191;
--vscode-editorBracketMatch-background: rgba(0, 100, 0, 0.1);
--vscode-editorBracketMatch-border: #b9b9b9;
--vscode-editorOverviewRuler-border: rgba(127, 127, 127, 0.3);
--vscode-editorGutter-background: #fffffe;
--vscode-editorUnnecessaryCode-opacity: rgba(0, 0, 0, 0.47);
--vscode-editorGhostText-foreground: rgba(0, 0, 0, 0.47);
--vscode-editorOverviewRuler-rangeHighlightForeground: rgba(0, 122, 204, 0.6);
--vscode-editorOverviewRuler-errorForeground: rgba(255, 18, 18, 0.7);
--vscode-editorOverviewRuler-warningForeground: #bf8803;
--vscode-editorOverviewRuler-infoForeground: #1a85ff;
--vscode-editorBracketHighlight-foreground1: #0431fa;
--vscode-editorBracketHighlight-foreground2: #319331;
--vscode-editorBracketHighlight-foreground3: #7b3814;
--vscode-editorBracketHighlight-foreground4: rgba(0, 0, 0, 0);
--vscode-editorBracketHighlight-foreground5: rgba(0, 0, 0, 0);
--vscode-editorBracketHighlight-foreground6: rgba(0, 0, 0, 0);
--vscode-editorBracketHighlight-unexpectedBracket-foreground: rgba(255, 18, 18, 0.8);
--vscode-editorBracketPairGuide-background1: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background2: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background3: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background4: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background5: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background6: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground1: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground2: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground3: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground4: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground5: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground6: rgba(0, 0, 0, 0);
--vscode-editorUnicodeHighlight-border: #cea33d;
--vscode-editorOverviewRuler-bracketMatchForeground: #a0a0a0;
--vscode-peekViewTitle-background: rgba(26, 133, 255, 0.1);
--vscode-peekViewTitleLabel-foreground: #000000;
--vscode-peekViewTitleDescription-foreground: #616161;
--vscode-peekView-border: #1a85ff;
--vscode-peekViewResult-background: #f3f3f3;
--vscode-peekViewResult-lineForeground: #646465;
--vscode-peekViewResult-fileForeground: #1e1e1e;
--vscode-peekViewResult-selectionBackground: rgba(51, 153, 255, 0.2);
--vscode-peekViewResult-selectionForeground: #6c6c6c;
--vscode-peekViewEditor-background: #f2f8fc;
--vscode-peekViewEditorGutter-background: #f2f8fc;
--vscode-peekViewResult-matchHighlightBackground: rgba(234, 92, 0, 0.3);
--vscode-peekViewEditor-matchHighlightBackground: rgba(245, 216, 2, 0.87);
--vscode-editorMarkerNavigationError-background: #e51400;
--vscode-editorMarkerNavigationError-headerBackground: rgba(229, 20, 0, 0.1);
--vscode-editorMarkerNavigationWarning-background: #bf8803;
--vscode-editorMarkerNavigationWarning-headerBackground: rgba(191, 136, 3, 0.1);
--vscode-editorMarkerNavigationInfo-background: #1a85ff;
--vscode-editorMarkerNavigationInfo-headerBackground: rgba(26, 133, 255, 0.1);
--vscode-editorMarkerNavigation-background: #fffffe;
--vscode-editorHoverWidget-highlightForeground: #0066bf;
--vscode-symbolIcon-arrayForeground: #616161;
--vscode-symbolIcon-booleanForeground: #616161;
--vscode-symbolIcon-classForeground: #d67e00;
--vscode-symbolIcon-colorForeground: #616161;
--vscode-symbolIcon-constantForeground: #616161;
--vscode-symbolIcon-constructorForeground: #652d90;
--vscode-symbolIcon-enumeratorForeground: #d67e00;
--vscode-symbolIcon-enumeratorMemberForeground: #007acc;
--vscode-symbolIcon-eventForeground: #d67e00;
--vscode-symbolIcon-fieldForeground: #007acc;
--vscode-symbolIcon-fileForeground: #616161;
--vscode-symbolIcon-folderForeground: #616161;
--vscode-symbolIcon-functionForeground: #652d90;
--vscode-symbolIcon-interfaceForeground: #007acc;
--vscode-symbolIcon-keyForeground: #616161;
--vscode-symbolIcon-keywordForeground: #616161;
--vscode-symbolIcon-methodForeground: #652d90;
--vscode-symbolIcon-moduleForeground: #616161;
--vscode-symbolIcon-namespaceForeground: #616161;
--vscode-symbolIcon-nullForeground: #616161;
--vscode-symbolIcon-numberForeground: #616161;
--vscode-symbolIcon-objectForeground: #616161;
--vscode-symbolIcon-operatorForeground: #616161;
--vscode-symbolIcon-packageForeground: #616161;
--vscode-symbolIcon-propertyForeground: #616161;
--vscode-symbolIcon-referenceForeground: #616161;
--vscode-symbolIcon-snippetForeground: #616161;
--vscode-symbolIcon-stringForeground: #616161;
--vscode-symbolIcon-structForeground: #616161;
--vscode-symbolIcon-textForeground: #616161;
--vscode-symbolIcon-typeParameterForeground: #616161;
--vscode-symbolIcon-unitForeground: #616161;
--vscode-symbolIcon-variableForeground: #007acc;
--vscode-editorSuggestWidget-background: #f3f3f3;
--vscode-editorSuggestWidget-border: #c8c8c8;
--vscode-editorSuggestWidget-foreground: #333333;
--vscode-editorSuggestWidget-selectedForeground: #ffffff;
--vscode-editorSuggestWidget-selectedBackground: #0060c0;
--vscode-editorSuggestWidget-highlightForeground: #0066bf;
--vscode-editorSuggestWidget-focusHighlightForeground: #9dddff;
--vscode-editorSuggestWidgetStatus-foreground: rgba(51, 51, 51, 0.5);
--vscode-editor-wordHighlightBackground: rgba(87, 87, 87, 0.25);
--vscode-editor-wordHighlightStrongBackground: rgba(14, 99, 156, 0.25);
--vscode-editorOverviewRuler-wordHighlightForeground: rgba(160, 160, 160, 0.8);
--vscode-editorOverviewRuler-wordHighlightStrongForeground: rgba(192, 160, 192, 0.8); }

.mtk1 { color: #000000; }
.mtk2 { color: #ffffff; }
.mtk3 { color: #008000; }
.mtk4 { color: #0000ff; }
.mtk5 { color: #811f3f; }
.mtk6 { color: #ee0000; }
.mtk7 { color: #098658; }
.mtk8 { color: #0451a5; }
.mtk9 { color: #267f99; }
.mtk10 { color: #795e26; }
.mtk11 { color: #af00db; }
.mtk12 { color: #800000; }
.mtk13 { color: #001080; }
.mtk14 { color: #ff0000; }
.mtk15 { color: #cd3131; }
.mtk16 { color: #d16969; }
.mtk17 { color: #000080; }
.mtk18 { color: #a31515; }
.mtk19 { color: #0070c1; }
.mtki { font-style: italic; }
.mtkb { font-weight: bold; }
.mtku { text-decoration: underline; text-underline-position: under; }
.mtks { text-decoration: line-through; }
.mtks.mtku { text-decoration: underline line-through; text-underline-position: under; }</style><link rel="stylesheet" type="text/css" href="Fizz%20Buzz%20-%20LeetCode_files/77d332a91c9f12f3.css"><style id="17918">._3B069 ._2hOcC a,._2hOcC a{--tw-text-opacity:1;color:rgb(0 122 255/var(--tw-text-opacity))}</style></head><body><div id="__next" data-reactroot=""><div class="flex min-h-screen min-w-[360px] flex-col text-label-1 dark:text-dark-label-1"><div class="bg-layer-bg dark:bg-dark-layer-bg h-[100vh]"><div class="flex h-full w-full flex-col"><nav class="relative flex h-[50px] w-full shrink-0 items-center px-5 z-nav-1 bg-layer-1 dark:bg-dark-layer-1"><div class="flex w-full justify-between"><div class="flex w-full items-center justify-between"><div class="flex"><ul class="relative flex h-[50px] items-end space-x-5 lc-lg:space-x-7"><a class="self-center" href="https://leetcode.com/"><div class="mb-0.5 pl-1"><div class="hidden h-[22px] dark:flex"><img src="Fizz%20Buzz%20-%20LeetCode_files/logo-large-dark-94099a3702daad8363bf79c3faef5a3f.png" alt="LeetCode Logo"></div><div class="flex h-[22px] dark:hidden"><img src="Fizz%20Buzz%20-%20LeetCode_files/logo-large-748c77d15b8d04e659615ebb5baa7bb6.png" alt="LeetCode Logo"></div></div></a><div class="hidden lc-lg:block"><li class="relative border-opacity-0 dark:border-opacity-0 flex items-center pb-3 text-base leading-[22px]
   cursor-pointer text-label-2 dark:text-dark-label-2 hover:text-label-1 dark:hover:text-dark-label-1"></li><hr class="border-divider-2 dark:border-dark-divider-2 h-0.5 rounded-[1px] border-none bg-gray-8 dark:bg-white shadow-level2 dark:shadow-dark-level2 invisible"></div></ul></div><div class="absolute left-[50%] hidden -translate-x-2/4 items-center space-x-4 lc-md:flex"><div class="flex h-8 w-8 cursor-pointer rounded bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-gray-7 dark:text-dark-gray-7"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="16" height="16" fill="currentColor" class="m-auto items-center"><path fill-rule="evenodd" d="M16.091 4.929l-7.057 7.078 7.057 7.064a1 1 0 01-1.414 1.414l-7.764-7.77a1 1 0 010-1.415l7.764-7.785a1 1 0 111.415 1.414z" clip-rule="evenodd"></path></svg></div><div class="flex cursor-pointer items-center space-x-2"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="16" height="16" fill="currentColor" class="text-gray-8 dark:text-dark-gray-8"><path fill-rule="evenodd" d="M5 6a1 1 0 011-1h12a1 1 0 110 2H6a1 1 0 01-1-1zm0 6a1 1 0 011-1h12a1 1 0 110 2H6a1 1 0 01-1-1zm1 5a1 1 0 100 2h12a1 1 0 100-2H6z" clip-rule="evenodd"></path></svg><div class="max-w-[170px] truncate font-medium text-gray-8 dark:text-dark-gray-8">Problem List</div></div><div class="flex h-8 w-8 cursor-pointer rounded bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-gray-7 dark:text-dark-gray-7"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="16" height="16" fill="currentColor" class="m-auto items-center"><path fill-rule="evenodd" d="M7.913 19.071l7.057-7.078-7.057-7.064a1 1 0 011.414-1.414l7.764 7.77a1 1 0 010 1.415l-7.764 7.785a1 1 0 01-1.414-1.414z" clip-rule="evenodd"></path></svg></div></div><div class="relative ml-4 flex items-center space-x-4"><div class="hidden lc-lg:block"><div class="flex cursor-pointer items-center rounded hover:bg-fill-3 dark:hover:bg-dark-fill-3"><div class="flex items-center justify-center h-8 p-1 text-gray-6 dark:text-dark-gray-6 hover:text-gray-7 dark:hover:text-dark-gray-7"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-6 w-6"><path fill-rule="evenodd" d="M12 4a9 9 0 110 18 9 9 0 010-18zm0 2a7 7 0 100 14 7 7 0 000-14zm0 1.634a1 1 0 01.993.883l.007.117-.001 3.774 2.111 1.162a1 1 0 01.445 1.253l-.05.105a1 1 0 01-1.254.445l-.105-.05-2.628-1.447a1 1 0 01-.51-.756L11 13V8.634a1 1 0 011-1zM16.235 2.4a1 1 0 011.296-.269l.105.07 4 3 .095.08a1 1 0 01-1.19 1.588l-.105-.069-4-3-.096-.081a1 1 0 01-.105-1.319zM7.8 2.4a1 1 0 01-.104 1.319L7.6 3.8l-4 3a1 1 0 01-1.296-1.518L2.4 5.2l4-3a1 1 0 011.4.2z" clip-rule="evenodd"></path></svg></div></div></div><div class="popover-wrapper inline-block" data-headlessui-state=""><div><div id="headlessui-popover-button-13" aria-expanded="false" data-headlessui-state=""><a class="group flex items-center hover:bg-fill-3 dark:hover:bg-dark-fill-3 rounded p-1 relative" href="https://leetcode.com/problems/make-the-string-great/"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 18 18" width="1em" height="1em" fill="currentColor" class="h-[24px] w-[24px] group-hover:text-gray-7 dark:group-hover:text-dark-gray-7 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M7.19 1.564a.75.75 0 01.729.069c2.137 1.475 3.373 3.558 3.981 5.002l.641-.663a.75.75 0 011.17.115c1.633 2.536 1.659 5.537.391 7.725-1.322 2.282-3.915 2.688-5.119 2.688-1.177 0-3.679-.203-5.12-2.688-.623-1.076-.951-2.29-.842-3.528.109-1.245.656-2.463 1.697-3.54.646-.67 1.129-1.592 1.468-2.492.337-.895.51-1.709.564-2.105a.75.75 0 01.44-.583zm.784 2.023c-.1.368-.226.773-.385 1.193-.375.997-.947 2.13-1.792 3.005-.821.851-1.205 1.754-1.282 2.63-.078.884.153 1.792.647 2.645C6.176 14.81 7.925 15 8.983 15c1.03 0 2.909-.366 3.822-1.94.839-1.449.97-3.446.11-5.315l-.785.812a.75.75 0 01-1.268-.345c-.192-.794-1.04-2.948-2.888-4.625z" clip-rule="evenodd"></path></svg><span class="mx-1 text-sm font-medium text-label-3 dark:text-dark-label-3 group-hover:text-label-2 dark:group-hover:text-dark-label-2">0</span></a></div></div></div><div class="relative" data-headlessui-state=""><button class="flex items-center focus:outline-none" id="headlessui-popover-button-16" type="button" aria-expanded="false" data-headlessui-state=""><div class="relative ml-1"><div class="h-6 w-6"><img src="Fizz%20Buzz%20-%20LeetCode_files/avatar_1667818486.png" alt="avatar" class="h-6 w-6 rounded-full object-cover"></div></div></button></div></div></div></div></nav><div class="flex h-full w-full flex-grow overflow-y-hidden"><div id="qd-content" class="h-full w-full bg-layer-bg dark:bg-dark-layer-bg flex min-w-[770px]"><div class="h-full flex-col ssg__qd-splitter-primary-w" style="width: calc(50% - 4px);"><div class="relative flex h-full flex-col"><div class="min-h-0 flex-grow ssg__qd-splitter-primary-h" style="height:100%"><div class="flex h-full flex-col"><div><div class="flex h-11 w-full items-center pt-2"><div class="flex flex-row space-x-2 overflow-x-auto overflow-y-hidden" style="overflow-x: hidden;"><div class="flex flex-1 select-none justify-center whitespace-nowrap rounded-t-[5px] px-4 py-[10px] text-xs bg-layer-1 dark:bg-dark-layer-1 text-label-1 dark:text-dark-label-1 px-5">Description</div><div class="flex flex-1 select-none justify-center whitespace-nowrap rounded-t-[5px] px-4 py-[10px] text-xs cursor-pointer text-label-2 dark:text-dark-label-2 px-5">Discussion (9)</div><div class="flex flex-1 select-none justify-center whitespace-nowrap rounded-t-[5px] px-4 py-[10px] text-xs cursor-pointer text-label-2 dark:text-dark-label-2 px-5">Solutions (2.7K)</div><div class="flex flex-1 select-none justify-center whitespace-nowrap rounded-t-[5px] px-4 py-[10px] text-xs cursor-pointer text-label-2 dark:text-dark-label-2 px-5">Submissions</div></div></div></div><div class="flex h-full w-full overflow-y-auto"><div class="flex h-full w-full overflow-y-auto bg-layer-1 dark:bg-dark-layer-1"><div class="flex h-full w-full flex-1 flex-col"><div class="w-full px-5 pt-4"><div class="w-full"><div class="flex space-x-4"><div class="flex-1"><div class="flex items-center"><div class="h-full"><span class="mr-2 text-lg font-medium text-label-1 dark:text-dark-label-1">412. Fizz Buzz</span><div class="mt-1 inline-flex min-h-[20px] items-center space-x-2 align-top"><div class="inline-flex items-center space-x-2"></div></div></div></div></div><div class="flex items-center"><div class="inline-flex gap-2 text-lg"><div class="popover-wrapper inline-block" data-headlessui-state=""><div><div id="headlessui-popover-button-1" aria-expanded="false" data-headlessui-state=""><div class="cursor-pointer rounded p-[3px] text-gray-6 transition-colors dark:text-dark-gray-6 hover:bg-fill-3 dark:hover:bg-dark-fill-3"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M12 2c5.523 0 10 4.477 10 10s-4.477 10-10 10S2 17.523 2 12 6.477 2 12 2zm0 2a8 8 0 100 16 8 8 0 000-16zm-4.998 9.27a1.25 1.25 0 100-2.5 1.25 1.25 0 000 2.5zm6.25-1.25a1.25 1.25 0 11-2.5 0 1.25 1.25 0 012.5 0zm3.75 1.25a1.25 1.25 0 100-2.5 1.25 1.25 0 000 2.5z" clip-rule="evenodd"></path></svg></div></div></div></div></div></div></div><div class="mt-3 flex space-x-4"><div><div class="bg-olive dark:bg-dark-olive text-olive dark:text-dark-olive inline-block rounded-[21px] bg-opacity-[.15] px-2.5 py-1 text-xs font-medium capitalize dark:bg-opacity-[.15]">Easy</div></div><div class="rounded p-[3px] text-lg transition-colors duration-200 text-green-s dark:text-dark-green-s"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M20 12.005v-.828a1 1 0 112 0v.829a10 10 0 11-5.93-9.14 1 1 0 01-.814 1.826A8 8 0 1020 12.005zM8.593 10.852a1 1 0 011.414 0L12 12.844l8.293-8.3a1 1 0 011.415 1.413l-9 9.009a1 1 0 01-1.415 0l-2.7-2.7a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg></div><div><div class="flex items-center space-x-4"><div class="text-xstransition-colors flex cursor-pointer items-center space-x-1 rounded py-[3px] px-1 hover:bg-fill-3 dark:hover:bg-dark-fill-3 text-gray-6 dark:text-dark-gray-6"><div class="text-lg text-gray-6 dark:text-dark-gray-6"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M7.04 9.11l3.297-7.419a1 1 0 01.914-.594 3.67 3.67 0 013.67 3.671V7.33h4.028a2.78 2.78 0 012.78 3.2l-1.228 8.01a2.778 2.778 0 01-2.769 2.363H5.019a2.78 2.78 0 01-2.78-2.78V11.89a2.78 2.78 0 012.78-2.78H7.04zm-2.02 2a.78.78 0 00-.781.78v6.232c0 .431.35.78.78.78H6.69V11.11H5.02zm12.723 7.793a.781.781 0 00.781-.666l1.228-8.01a.78.78 0 00-.791-.898h-5.04a1 1 0 01-1-1V4.77c0-.712-.444-1.32-1.07-1.56L8.69 10.322v8.58h9.053z" clip-rule="evenodd"></path></svg></div><div class="text-xs">1.2K</div></div><div class="text-xstransition-colors flex cursor-pointer items-center space-x-1 rounded py-[3px] px-1 hover:bg-fill-3 dark:hover:bg-dark-fill-3 text-gray-6 dark:text-dark-gray-6"><div class="text-lg text-gray-6 dark:text-dark-gray-6"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M13.663 22.309a1 1 0 01-.914.594 3.67 3.67 0 01-3.67-3.671V16.67H5.05a2.78 2.78 0 01-2.78-3.2l1.228-8.01a2.778 2.778 0 012.769-2.364H18.98a2.78 2.78 0 012.78 2.781v6.232a2.78 2.78 0 01-2.78 2.78H16.96l-3.297 7.419zm5.318-9.419a.78.78 0 00.78-.78V5.878a.78.78 0 00-.78-.78H17.31v7.792h1.67zM6.257 5.097a.781.781 0 00-.781.666l-1.229 8.01a.78.78 0 00.792.898h5.04a1 1 0 011 1v3.56c0 .712.443 1.32 1.07 1.56l3.16-7.113v-8.58H6.258z" clip-rule="evenodd"></path></svg></div><div class="text-xs">187</div></div></div></div><div><div class="popover-wrapper inline-block" data-headlessui-state=""><div><div id="headlessui-popover-button-10" aria-expanded="false" data-headlessui-state=""><div><div class="flex h-full cursor-pointer items-center rounded p-[3px] text-lg transition-colors hover:bg-fill-3 dark:hover:bg-dark-fill-3 text-gray-6 dark:text-dark-gray-6"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M11.394 2.074a2.5 2.5 0 011.212 0c.723.181 1.185.735 1.526 1.262.342.528.703 1.259 1.131 2.127l.392.795c.302.61.348.667.386.7a.502.502 0 00.086.063c.043.025.11.052.786.15l.877.128c.958.139 1.764.256 2.372.418.606.162 1.276.43 1.671 1.062a2.5 2.5 0 01.375 1.152c.052.744-.333 1.354-.728 1.841-.397.489-.98 1.058-1.674 1.733l-.634.619c-.489.476-.527.537-.548.583a.506.506 0 00-.033.101c-.01.05-.015.122.1.794l.15.873c.164.954.302 1.758.335 2.386.034.627-.014 1.346-.493 1.918a2.5 2.5 0 01-.98.712c-.692.279-1.39.102-1.976-.124-.588-.226-1.309-.605-2.165-1.056l-.785-.412c-.603-.317-.674-.335-.724-.34a.496.496 0 00-.106 0c-.05.005-.12.023-.724.34l-.785.412c-.856.45-1.577.83-2.165 1.056-.585.226-1.284.403-1.976.124a2.501 2.501 0 01-.98-.712c-.48-.572-.527-1.291-.493-1.918.033-.628.171-1.431.335-2.386l.15-.873c.115-.672.11-.745.1-.794a.5.5 0 00-.033-.101c-.02-.046-.06-.107-.548-.583l-.634-.619c-.694-.675-1.277-1.244-1.674-1.733-.395-.487-.78-1.097-.728-1.841a2.5 2.5 0 01.375-1.152c.395-.633 1.065-.9 1.67-1.062.61-.162 1.415-.28 2.373-.418l.877-.128c.675-.098.743-.125.786-.15a.5.5 0 00.086-.062c.038-.034.084-.09.386-.701l.392-.795c.428-.868.789-1.599 1.131-2.127.341-.527.803-1.08 1.526-1.262zm.493 1.939c-.023.013-.132.089-.34.41-.271.418-.58 1.042-1.045 1.982l-.364.738-.05.103c-.213.434-.428.872-.788 1.197a2.5 2.5 0 01-.43.312c-.42.241-.903.31-1.381.379a52.6 52.6 0 00-.114.016l-.815.119c-1.037.15-1.725.252-2.207.38-.37.099-.476.18-.495.197a.5.5 0 00-.07.216c.005.025.044.153.285.45.314.386.811.874 1.562 1.605l.59.575.082.08c.346.336.697.676.895 1.118.072.162.127.332.164.506.1.474.016.955-.067 1.431l-.02.113-.138.811c-.178 1.033-.294 1.72-.32 2.217-.02.382.023.508.034.532.05.058.113.103.183.133.026.003.16.006.516-.132.465-.18 1.082-.502 2.01-.99l.728-.382.102-.054c.427-.226.859-.454 1.34-.505.177-.02.355-.02.532 0 .481.051.913.28 1.34.505l.102.054.728.383c.928.487 1.545.81 2.01.99.357.137.49.134.516.13a.499.499 0 00.183-.132c.01-.024.055-.15.034-.532-.026-.497-.142-1.184-.32-2.217l-.139-.81-.02-.114c-.082-.476-.166-.957-.066-1.431.037-.174.092-.344.164-.506.198-.442.549-.782.895-1.118a20.8 20.8 0 00.083-.08l.59-.575c.75-.731 1.247-1.219 1.561-1.606.241-.296.28-.424.285-.45a.5.5 0 00-.07-.215c-.02-.017-.126-.098-.495-.196-.482-.129-1.17-.23-2.207-.381l-.815-.119-.113-.016c-.479-.068-.963-.138-1.382-.379a2.5 2.5 0 01-.43-.312c-.36-.325-.575-.763-.788-1.197a31.757 31.757 0 00-.05-.103l-.364-.738c-.464-.94-.774-1.564-1.045-1.982-.208-.321-.317-.397-.34-.41a.5.5 0 00-.226 0zm8.326 6.044v.002-.002zm-3.246 9.575h-.002.002zm-9.934 0h.002-.002zm-3.246-9.575v.002-.002z" clip-rule="evenodd"></path></svg></div></div></div></div></div></div><div><div class="popover-wrapper inline-block" data-headlessui-state=""><div><div id="headlessui-popover-button-7" aria-expanded="false" data-headlessui-state=""><div class="flex h-full cursor-pointer items-center rounded p-[3px] text-lg text-dark-gray-6 transition-colors dark:text-dark-gray-6 hover:bg-fill-3 dark:hover:bg-dark-fill-3"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M11.5 5.5a7 7 0 107 7 1 1 0 112 0 9 9 0 11-9-9 1 1 0 110 2z" clip-rule="evenodd"></path><path fill-rule="evenodd" d="M20.207 3.793a1 1 0 010 1.414l-7 7a1 1 0 01-1.414-1.414l7-7a1 1 0 011.414 0z" clip-rule="evenodd"></path><path fill-rule="evenodd" d="M14.5 4.5a1 1 0 011-1h4a1 1 0 011 1v4a1 1 0 11-2 0v-3h-3a1 1 0 01-1-1z" clip-rule="evenodd"></path></svg></div></div></div></div></div></div></div></div><div class="px-5 pt-3"><div class="relative"><div class="inline-block"><div class="transition-colors flex cursor-pointer items-center space-x-1.5 rounded-[21px] px-2 py-1 text-xs hover:bg-opacity-20 bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="text-brand-orange dark:text-dark-brand-orange"><path fill-rule="evenodd" d="M7 8v2H6a3 3 0 00-3 3v6a3 3 0 003 3h12a3 3 0 003-3v-6a3 3 0 00-3-3h-1V8A5 5 0 007 8zm8 0v2H9V8a3 3 0 116 0zm-3 6a2 2 0 100 4 2 2 0 000-4z" clip-rule="evenodd"></path></svg><span>Companies</span></div></div></div></div><div class="px-5 pt-4"><div class="_1l1MA"><p>Given an integer <code>n</code>, return <em>a string array </em><code>answer</code><em> (<strong>1-indexed</strong>) where</em>:</p>

<ul>
	<li><code>answer[i] == "FizzBuzz"</code> if <code>i</code> is divisible by <code>3</code> and <code>5</code>.</li>
	<li><code>answer[i] == "Fizz"</code> if <code>i</code> is divisible by <code>3</code>.</li>
	<li><code>answer[i] == "Buzz"</code> if <code>i</code> is divisible by <code>5</code>.</li>
	<li><code>answer[i] == i</code> (as a string) if none of the above conditions are true.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> n = 3
<strong>Output:</strong> ["1","2","Fizz"]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> n = 5
<strong>Output:</strong> ["1","2","Fizz","4","Buzz"]
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> n = 15
<strong>Output:</strong> ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 10<sup>4</sup></code></li>
</ul>
</div></div><div class="px-5 py-3 pt-[38px]"><div class="flex h-full flex-wrap items-center"><div class="mr-4 flex items-center space-x-2.5"><div class="text-label-2 dark:text-dark-label-2 text-xs">Accepted</div><div class="text-label-1 dark:text-dark-label-1 text-sm font-medium">805.2K</div></div><div class="bg-divider-2 dark:bg-dark-divider-2 h-full w-px border-divider-1 dark:border-dark-divider-1 mr-4 max-h-[14px]"></div><div class="mr-4 flex items-center space-x-2.5"><div class="text-label-2 dark:text-dark-label-2 text-xs">Submissions</div><div class="text-label-1 dark:text-dark-label-1 text-sm font-medium">1.2M</div></div><div class="bg-divider-2 dark:bg-dark-divider-2 h-full w-px border-divider-1 dark:border-dark-divider-1 mr-4 max-h-[14px]"></div><div class="mr-4 flex items-center space-x-2.5"><div class="text-label-2 dark:text-dark-label-2 text-xs">Acceptance Rate</div><div class="text-label-1 dark:text-dark-label-1 text-sm font-medium"><span class="text-md font-medium">68.8%</span></div></div></div></div><hr class="border-divider-3 dark:border-dark-divider-3 mx-5"><div class="px-5 py-3"><div><div class="mb-2 flex items-center space-x-4"><div class="text-label-2 dark:text-dark-label-2 text-md">Seen this question in a real interview before?</div><div class="text-label-3 dark:text-dark-label-3 text-md font-medium">1/4</div></div><div class="flex"><div class="py-1 px-2 cursor-pointer text-xs mr-3 rounded-[12px] text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2" data-has-seen="true">Yes</div><div class="py-1 px-2 cursor-pointer text-xs mr-3 rounded-[12px] text-label-2 dark:text-dark-label-2 bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2">No</div></div></div></div><hr class="border-divider-3 dark:border-dark-divider-3 mx-5"><div class="px-5 py-3"><div class="flex flex-col"><div class="group flex cursor-pointer items-center transition-colors text-label-2 dark:text-dark-label-2 hover:text-label-1 dark:hover:text-dark-label-1"><div class="flex-1 text-sm leading-[22px]">Similar Questions</div><div class="text-[24px] transition-colors text-gray-4 dark:text-dark-gray-4 group-hover:text-gray-5 dark:group-hover:text-dark-gray-5"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M16.293 9.293a1 1 0 111.414 1.414l-5 5a1 1 0 01-1.414 0l-5-5a1 1 0 011.414-1.414L12 13.586l4.293-4.293z" clip-rule="evenodd"></path></svg></div></div></div></div><hr class="border-divider-3 dark:border-dark-divider-3 mx-5"><div class="px-5 py-3"><div class="flex flex-col"><div class="group flex cursor-pointer items-center transition-colors text-label-2 dark:text-dark-label-2 hover:text-label-1 dark:hover:text-dark-label-1"><div class="flex-1 text-sm leading-[22px]">Related Topics</div><div class="text-[24px] transition-colors text-gray-4 dark:text-dark-gray-4 group-hover:text-gray-5 dark:group-hover:text-dark-gray-5"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"><path fill-rule="evenodd" d="M16.293 9.293a1 1 0 111.414 1.414l-5 5a1 1 0 01-1.414 0l-5-5a1 1 0 011.414-1.414L12 13.586l4.293-4.293z" clip-rule="evenodd"></path></svg></div></div></div></div><div class="mt-auto px-5 pt-8 pb-2.5"><div class="text-label-2 dark:text-dark-label-2 text-xs">Copyright ©️ 2022 LeetCode All rights reserved</div></div></div></div></div></div></div></div></div><div class="group flex h-full items-center justify-center transition hover:bg-blue-s dark:hover:bg-dark-blue-s w-2 hover:cursor-col-resize"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 2 14" width="2" height="14" fill="currentColor" class="text-gray-3 dark:text-dark-gray-3 transition -translate-y-6 group-hover:text-white dark:group-hover:text-white"><circle r="1" transform="matrix(4.37114e-08 -1 -1 -4.37114e-08 1 1)"></circle><circle r="1" transform="matrix(4.37114e-08 -1 -1 -4.37114e-08 1 7)"></circle><circle r="1" transform="matrix(4.37114e-08 -1 -1 -4.37114e-08 1 13)"></circle></svg></div><div class="h-full flex-col ssg__qd-splitter-secondary-w" style="width: calc(50% - 4px);"><div class="relative flex h-full flex-col"><div class="min-h-0 flex-grow ssg__qd-splitter-primary-h" style="height: calc(50% - 4px);"><div class="flex h-full flex-col"><div class="h-full flex-col flex"><div class="relative flex h-full flex-col" id="editor"><div class="relative z-base-3"></div><div class="text-label-r dark:text-dark-label-r fixed top-[215px] right-0 flex h-10 w-8 cursor-pointer items-center justify-center rounded bg-gray-5 z-base-1 dark:bg-dark-gray-5"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-5 w-5"><path fill-rule="evenodd" d="M14 5.592V9h3.314L14 5.592zM18 11h-5a1 1 0 01-1-1V4H6.75c-.408 0-.75.352-.75.8v14.4c0 .448.342.8.75.8h10.5c.408 0 .75-.352.75-.8V11zm-5.125-9a1 1 0 01.717.303l6.125 6.3A1 1 0 0120 9.3v9.9c0 1.54-1.225 2.8-2.75 2.8H6.75C5.225 22 4 20.74 4 19.2V4.8C4 3.26 5.225 2 6.75 2h6.125z" clip-rule="evenodd"></path></svg></div><div class="flex min-h-[44px] flex-shrink-0 flex-wrap items-center pr-5"><div class="mr-auto flex flex-nowrap gap-3"><div><div class="relative"><button class="flex cursor-pointer items-center rounded text-left focus:outline-none whitespace-nowrap bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 hover:bg-fill-2 dark:hover:bg-dark-fill-2 active:bg-fill-3 dark:active:bg-dark-fill-3 px-2 py-1.5 font-medium" id="headlessui-listbox-button-19" type="button" aria-haspopup="true" aria-expanded="false" data-headlessui-state=""><div class="flex items-center"><svg xmlns="http://www.w3.org/2000/svg" viewBox="4 4 16 16" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-5 dark:text-dark-gray-5"><path fill-rule="evenodd" d="M13.741 7.314a.95.95 0 00-.627-.272.95.95 0 00-.627.272.833.833 0 00-.246.614c0 .246.082.45.246.614a.85.85 0 00.627.245.85.85 0 00.627-.245.833.833 0 00.246-.614.832.832 0 00-.246-.614zm-.34 2.919c-.01-.273-.178-.41-.505-.41-.4.092-.914.36-1.541.805-.628.446-.969.696-1.023.75-.055.055-.082.091-.082.11l.082.136c.036.09.063.14.082.15.018.01.054-.004.109-.04l.627-.41c.564-.364.732-.16.505.614-.228.772-.505 1.94-.832 3.505-.055.709.127 1.013.545.913.419-.1.746-.231.982-.395l1.364-.955c.055-.036.073-.072.055-.109l-.11-.19c-.036-.037-.072-.055-.109-.055l-.027.027c-.218.145-.45.29-.695.436-.246.146-.405.146-.478 0-.036-.218.064-.754.3-1.609l.682-2.564c.055-.2.077-.436.068-.71z" clip-rule="evenodd"></path></svg><div class="text-xs text-label-2 dark:text-dark-label-2">Java</div></div><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="pointer-events-none ml-2 w-3 h-3 text-gray-6 dark:text-dark-gray-6" aria-hidden="true"><path fill-rule="evenodd" d="M4.929 7.913l7.078 7.057 7.064-7.057a1 1 0 111.414 1.414l-7.77 7.764a1 1 0 01-1.415 0L3.515 9.328a1 1 0 011.414-1.414z" clip-rule="evenodd"></path></svg></button></div></div><div class="flex items-center"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex bg-fill-3 dark:bg-dark-fill-3 text-label-2 dark:text-dark-label-2 group text-xs hover:text-brand-orange dark:hover:text-dark-brand-orange hover:bg-yellow-0 dark:hover:bg-dark-yellow-0"><div class="mr-2 h-1 w-1 rounded-full transition-all bg-gray-5 dark:bg-dark-gray-5 group-hover:bg-brand-orange"></div>Auto</button></div></div><div class="overflow-hidden ml-2 my-2"><div class="flex flex-wrap !flex-nowrap" style="margin: -4px;"><div style="margin: 4px;" class="flex items-center"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto !p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M12 16.945l-5.331 4.798C6.025 22.323 5 21.866 5 21V5a3 3 0 013-3h8a3 3 0 013 3v16c0 .866-1.025 1.323-1.669.743L12 16.945zm5 1.81V5a1 1 0 00-1-1H8a1 1 0 00-1 1v13.755l4.331-3.898a1 1 0 011.338 0L17 18.755z" clip-rule="evenodd"></path></svg></button></div><div style="margin: 4px;" class="flex items-center"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto !p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M5.725 9.255h2.843a1 1 0 110 2H3.2a1 1 0 01-1-1V4.887a1 1 0 012 0v3.056l2.445-2.297a9.053 9.053 0 11-2.142 9.415 1 1 0 011.886-.665 7.053 7.053 0 1010.064-8.515 7.063 7.063 0 00-8.417 1.202L5.725 9.255z" clip-rule="evenodd"></path></svg></button></div><div style="margin: 4px;" class="flex items-center"><button class="rounded font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M15.667 10.333v3.334h1.666a3.667 3.667 0 11-3.666 3.666v-1.666h-3.334v1.666a3.667 3.667 0 11-3.666-3.666h1.666v-3.334H6.667a3.667 3.667 0 113.666-3.666v1.666h3.334V6.667a3.667 3.667 0 113.666 3.666h-1.666zm-5.334 0v3.334h3.334v-3.334h-3.334zm-2-2V6.667a1.667 1.667 0 10-1.666 1.666h1.666zm-1.666 7.334a1.667 1.667 0 101.666 1.666v-1.666H6.667zm9 1.666a1.667 1.667 0 101.666-1.666h-1.666v1.666zm1.666-9a1.667 1.667 0 10-1.666-1.666v1.666h1.666z" clip-rule="evenodd"></path></svg></button></div><div style="margin: 4px;" class="flex items-center"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto !p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M7.174 5.619a8.064 8.064 0 011.635-.946l.29-1.158A2 2 0 0111.039 2h1.922a2 2 0 011.94 1.515l.29 1.158c.584.252 1.132.57 1.635.946l1.15-.329a2 2 0 012.282.923l.961 1.665a2 2 0 01-.342 2.437l-.86.832a8.151 8.151 0 010 1.888l.86.83a2 2 0 01.342 2.438l-.96 1.665a2 2 0 01-2.283.923l-1.15-.329a8.063 8.063 0 01-1.635.946l-.29 1.158a2 2 0 01-1.94 1.515H11.04a2 2 0 01-1.94-1.515l-.29-1.158a8.064 8.064 0 01-1.635-.946l-1.15.329a2 2 0 01-2.282-.923l-.961-1.665a2 2 0 01.342-2.437l.86-.831a8.158 8.158 0 010-1.889l-.86-.83a2 2 0 01-.342-2.438l.96-1.665a2 2 0 012.283-.923l1.15.329zm-1.7 1.594l-.961 1.665 1.57 1.518-.114.982a6.157 6.157 0 000 1.425l.114.982-1.57 1.518.96 1.665 2.104-.601.794.593c.38.284.793.523 1.23.711l.908.392.53 2.118h1.922l.53-2.118.909-.392a6.07 6.07 0 001.23-.711l.793-.593 2.103.601.961-1.665-1.57-1.518.114-.982a6.172 6.172 0 000-1.425l-.114-.982 1.57-1.518-.96-1.665-2.104.601-.794-.593a6.067 6.067 0 00-1.23-.71l-.908-.392L12.96 4H11.04l-.53 2.119-.909.391a6.064 6.064 0 00-1.23.711l-.793.593-2.103-.601zM12 16a4 4 0 100-8 4 4 0 000 8zm0-2a2 2 0 110-4 2 2 0 010 4z" clip-rule="evenodd"></path></svg></button></div><div style="margin: 4px;" class="flex items-center"><button class="rounded px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-3 dark:hover:bg-dark-fill-3 ml-auto !p-1"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4 text-gray-6 dark:text-dark-gray-6"><path fill-rule="evenodd" d="M6.414 19H10a1 1 0 110 2H4a1 1 0 01-1-1v-6a1 1 0 112 0v3.586l4.293-4.293a1 1 0 011.414 1.414L6.414 19zM17.586 5H14a1 1 0 110-2h6a1 1 0 011 1v6a1 1 0 11-2 0V6.414l-4.293 4.293a1 1 0 01-1.414-1.414L17.586 5z" clip-rule="evenodd"></path></svg></button></div></div></div></div><div class="flex flex-1 flex-col overflow-hidden"><div class="flex-1 overflow-hidden"><div class="h-full w-full" data-keybinding-context="1" data-mode-id="java"><div class="monaco-editor no-user-select  showUnused showDeprecated vs" role="code" style="width: 790px; height: 311px;" data-uri="inmemory://model/1"><div data-mprt="3" class="overflow-guard" style="width: 790px; height: 311px;"><div class="margin" style="position: absolute; transform: translate3d(0px, 0px, 0px); contain: strict; top: 0px; height: 314px; width: 49px;" role="presentation" aria-hidden="true"><div class="glyph-margin" style="left: 0px; width: 18px; height: 314px;"></div><div class="margin-view-zones" style="position: absolute;" role="presentation" aria-hidden="true"></div><div class="margin-view-overlays" style="position: absolute; width: 49px; font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 13px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 18px; letter-spacing: 0px; height: 314px;" role="presentation" aria-hidden="true"><div style="position:absolute;top:8px;width:100%;height:18px;"><div class="current-line current-line-margin-both" style="width:49px; height:18px;"></div><div class="active-line-number line-numbers" style="left:18px;width:14px;">1</div></div><div style="position:absolute;top:26px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">2</div></div><div style="position:absolute;top:44px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">3</div></div><div style="position:absolute;top:62px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">4</div></div><div style="position:absolute;top:80px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">5</div></div><div style="position:absolute;top:98px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">6</div></div><div style="position:absolute;top:116px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">7</div></div><div style="position:absolute;top:134px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">8</div></div><div style="position:absolute;top:152px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">9</div></div><div style="position:absolute;top:170px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">10</div></div><div style="position:absolute;top:188px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">11</div></div><div style="position:absolute;top:206px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">12</div></div><div style="position:absolute;top:224px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">13</div></div><div style="position:absolute;top:242px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">14</div></div><div style="position:absolute;top:260px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">15</div></div><div style="position:absolute;top:278px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">16</div></div><div style="position:absolute;top:296px;width:100%;height:18px;"><div class="line-numbers" style="left:18px;width:14px;">17</div></div></div></div><div class="monaco-scrollable-element editor-scrollable vs" role="presentation" style="position: absolute; overflow: hidden; left: 49px; height: 311px; width: 741px;" data-mprt="5"><div class="lines-content monaco-editor-background" style="position: absolute; overflow: hidden; width: 1000000px; height: 1000000px; transform: translate3d(0px, 0px, 0px); contain: strict; top: 0px; left: 0px;"><div class="view-overlays" style="position: absolute; height: 0px; width: 741px;" role="presentation" aria-hidden="true"><div style="position:absolute;top:8px;width:100%;height:18px;"><div class="current-line" style="width:741px; height:18px;"></div></div><div style="position:absolute;top:26px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div></div><div style="position:absolute;top:44px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div></div><div style="position:absolute;top:62px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div></div><div style="position:absolute;top:80px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:56px;height:18px;width:7px"></div></div><div style="position:absolute;top:98px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:56px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:84px;height:18px;width:7px"></div></div><div style="position:absolute;top:116px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:56px;height:18px;width:7px"></div></div><div style="position:absolute;top:134px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:56px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:84px;height:18px;width:7px"></div></div><div style="position:absolute;top:152px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:56px;height:18px;width:7px"></div></div><div style="position:absolute;top:170px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:56px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:84px;height:18px;width:7px"></div></div><div style="position:absolute;top:188px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:56px;height:18px;width:7px"></div></div><div style="position:absolute;top:206px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:56px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:84px;height:18px;width:7px"></div></div><div style="position:absolute;top:224px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:56px;height:18px;width:7px"></div></div><div style="position:absolute;top:242px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div></div><div style="position:absolute;top:260px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div><div class="core-guide core-guide-indent vertical" style="left:28px;height:18px;width:7px"></div></div><div style="position:absolute;top:278px;width:100%;height:18px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:18px;width:7px"></div></div><div style="position:absolute;top:296px;width:100%;height:18px;"></div></div><div role="presentation" aria-hidden="true" class="view-rulers"></div><div class="view-zones" style="position: absolute;" role="presentation" aria-hidden="true"></div><div class="view-lines monaco-mouse-cursor-text" style="position: absolute; font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 13px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 18px; letter-spacing: 0px; width: 741px; height: 314px;" role="presentation" aria-hidden="true" data-mprt="7"><div style="top:8px;height:18px;" class="view-line"><span><span class="mtk4">class</span><span class="mtk1">&nbsp;</span><span class="mtk9">Solution</span><span class="mtk1">&nbsp;{</span></span></div><div style="top:26px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk4">public</span><span class="mtk1">&nbsp;</span><span class="mtk9">List</span><span class="mtk1">&lt;</span><span class="mtk9">String</span><span class="mtk1">&gt;&nbsp;</span><span class="mtk10">fizzBuzz</span><span class="mtk1">(</span><span class="mtk9">int</span><span class="mtk1">&nbsp;</span><span class="mtk13">n</span><span class="mtk1">)&nbsp;{</span></span></div><div style="top:44px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk9">List</span><span class="mtk1">&lt;</span><span class="mtk9">String</span><span class="mtk1">&gt;&nbsp;</span><span class="mtk13">answer</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk11">new</span><span class="mtk1">&nbsp;</span><span class="mtk10">ArrayList</span><span class="mtk1">();</span></span></div><div style="top:62px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk11">for</span><span class="mtk1">&nbsp;(</span><span class="mtk9">int</span><span class="mtk1">&nbsp;</span><span class="mtk13">i</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk7">1</span><span class="mtk1">;&nbsp;i&nbsp;&lt;=&nbsp;n;&nbsp;i++)&nbsp;{</span></span></div><div style="top:80px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk11">if</span><span class="mtk1">&nbsp;(i&nbsp;%&nbsp;</span><span class="mtk7">3</span><span class="mtk1">&nbsp;==&nbsp;</span><span class="mtk7">0</span><span class="mtk1">&nbsp;&amp;&amp;&nbsp;i&nbsp;%&nbsp;</span><span class="mtk7">5</span><span class="mtk1">&nbsp;==&nbsp;</span><span class="mtk7">0</span><span class="mtk1">)&nbsp;{</span></span></div><div style="top:98px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk13">answer</span><span class="mtk1">.</span><span class="mtk10">add</span><span class="mtk1">(</span><span class="mtk18">"FizzBuzz"</span><span class="mtk1">);</span></span></div><div style="top:116px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;</span><span class="mtk11">else</span><span class="mtk1">&nbsp;</span><span class="mtk11">if</span><span class="mtk1">&nbsp;(i&nbsp;%&nbsp;</span><span class="mtk7">5</span><span class="mtk1">&nbsp;==&nbsp;</span><span class="mtk7">0</span><span class="mtk1">)&nbsp;{</span></span></div><div style="top:134px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk13">answer</span><span class="mtk1">.</span><span class="mtk10">add</span><span class="mtk1">(</span><span class="mtk18">"Buzz"</span><span class="mtk1">);</span></span></div><div style="top:152px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;</span><span class="mtk11">else</span><span class="mtk1">&nbsp;</span><span class="mtk11">if</span><span class="mtk1">&nbsp;(i&nbsp;%&nbsp;</span><span class="mtk7">3</span><span class="mtk1">&nbsp;==&nbsp;</span><span class="mtk7">0</span><span class="mtk1">)&nbsp;{</span></span></div><div style="top:170px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk13">answer</span><span class="mtk1">.</span><span class="mtk10">add</span><span class="mtk1">(</span><span class="mtk18">"Fizz"</span><span class="mtk1">);</span></span></div><div style="top:188px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;</span><span class="mtk11">else</span><span class="mtk1">&nbsp;{</span></span></div><div style="top:206px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk13">answer</span><span class="mtk1">.</span><span class="mtk10">add</span><span class="mtk1">(</span><span class="mtk13">Integer</span><span class="mtk1">.</span><span class="mtk10">toString</span><span class="mtk1">(i));</span></span></div><div style="top:224px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top:242px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top:260px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk11">return</span><span class="mtk1">&nbsp;answer;</span></span></div><div style="top:278px;height:18px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top:296px;height:18px;" class="view-line"><span><span class="mtk1">}</span></span></div></div><div data-mprt="1" class="contentWidgets" style="position: absolute; top: 0px;"></div><div role="presentation" aria-hidden="true" class="cursors-layer cursor-line-style cursor-solid"><div class="cursor monaco-mouse-cursor-text " style="height: 18px; top: 8px; left: 0px; font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 13px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 18px; letter-spacing: 0px; display: block; visibility: hidden; width: 2px;"></div></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 727px; height: 12px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 12px; transform: translate3d(0px, 0px, 0px); contain: strict; width: 727px;"></div></div><canvas class="decorationsOverviewRuler" style="position: absolute; transform: translate3d(0px, 0px, 0px); contain: strict; top: 0px; right: 0px; width: 14px; height: 311px; display: block;" aria-hidden="true" width="14" height="311"></canvas><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical fade" style="position: absolute; width: 14px; height: 311px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 14px; transform: translate3d(0px, 0px, 0px); contain: strict; height: 308px;"></div></div></div><div role="presentation" aria-hidden="true" style="width: 790px;"></div><textarea data-mprt="6" class="inputarea monaco-mouse-cursor-text" autocorrect="off" autocapitalize="none" autocomplete="off" spellcheck="false" aria-label="Editor content;Press Alt+F1 for Accessibility Options." tabindex="0" role="textbox" aria-roledescription="editor" aria-multiline="true" aria-haspopup="false" aria-autocomplete="both" style="font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 13px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 18px; letter-spacing: 0px; top: 8px; left: 49px; width: 0px; height: 0px;" wrap="off">class Solution {
    public List&lt;String&gt; fizzBuzz(int n) {
        List&lt;String&gt; answer = new ArrayList();
        for (int i = 1; i &lt;= n; i++) {
            if (i % 3 == 0 &amp;&amp; i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
</textarea><div style="position: absolute; top: 0px; left: 0px; width: 0px; height: 0px;" class="monaco-editor-background textAreaCover margin"></div><div data-mprt="4" class="overlayWidgets" style="width: 790px;"><div class="accessibilityHelpWidget" style="display: none; position: absolute;" role="dialog" aria-hidden="true" widgetid="editor.contrib.accessibilityHelpWidget"><div role="document"></div></div><div style="position: absolute; top: 0px; right: 50%;" widgetid="editor.contrib.quickInputWidget"></div><div class="monaco-hover hidden" tabindex="0" role="tooltip" style="position: absolute;" widgetid="editor.contrib.modesGlyphHoverWidget"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-hover-content" style="overflow: hidden;"></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; transform: translate3d(0px, 0px, 0px); contain: strict;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; transform: translate3d(0px, 0px, 0px); contain: strict;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow"></div></div></div></div><div data-mprt="8" class="minimap slider-mouseover" style="position: absolute; left: 0px; width: 0px; height: 311px;" role="presentation" aria-hidden="true"><div class="minimap-shadow-hidden" style="height: 311px;"></div><canvas style="position: absolute; left: 0px; width: 0px; height: 311px;" width="0" height="311"></canvas><canvas style="position: absolute; left: 0px; width: 0px; height: 311px;" class="minimap-decorations-layer" width="0" height="311"></canvas><div style="position: absolute; transform: translate3d(0px, 0px, 0px); contain: strict; width: 0px;" class="minimap-slider"><div style="position: absolute; width: 0px; height: 0px;" class="minimap-slider-horizontal"></div></div></div></div><div data-mprt="2" class="overflowingContentWidgets"><div class="monaco-hover hidden" tabindex="0" role="tooltip" style="position: absolute; display: none; visibility: hidden; max-width: 1588px;" widgetid="editor.contrib.contentHoverWidget"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-hover-content" style="overflow: hidden; font-size: 13px; line-height: 1.38462; max-height: 250px; max-width: 521.4px;"></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; transform: translate3d(0px, 0px, 0px); contain: strict;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; transform: translate3d(0px, 0px, 0px); contain: strict;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow"></div></div></div></div></div></div></div><div class="text-label-2 dark:text-dark-label-2 bg-gray-2 dark:bg-dark-gray-2"></div></div></div></div></div></div><div class="group flex w-full flex-col items-center justify-center transition hover:cursor-row-resize hover:bg-blue-s dark:hover:bg-dark-blue-s h-2"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 14 2" width="14" height="2" fill="currentColor" class="transition text-gray-3 dark:text-dark-gray-3 group-hover:text-white dark:group-hover:text-white"><circle r="1" transform="matrix(-1 0 0 1 1 1)"></circle><circle r="1" transform="matrix(-1 0 0 1 7 1)"></circle><circle r="1" transform="matrix(-1 0 0 1 13 1)"></circle></svg></div><div class="ssg__qd-splitter-secondary-h" style="height: calc(50% - 4px);"><div class="flex h-full flex-col"><div class="flex h-full w-full flex-col bg-layer-1 dark:bg-dark-layer-1"><div class="shrink-0 border-b-[1px] border-gray-2 dark:border-dark-gray-2"><div class="flex h-10 items-center space-x-6 px-5"><div class="relative flex h-full flex-col justify-center cursor-pointer"><div class="text-sm leading-5 font-medium text-label-1 dark:text-dark-label-1">Testcase</div><hr class="absolute bottom-0 h-0.5 w-full rounded-full border-none bg-label-1 dark:bg-dark-label-1 visible"></div><div class="relative flex h-full flex-col justify-center cursor-pointer"><div class="text-sm leading-5 font-normal text-label-2 dark:text-dark-label-2">Result</div><hr class="absolute bottom-0 h-0.5 w-full rounded-full border-none bg-label-1 dark:bg-dark-label-1 invisible"></div><div class="popover-wrapper inline-block group cursor-pointer rounded hover:bg-fill-2 dark:hover:bg-dark-fill-2 !ml-auto" data-headlessui-state=""><div><div id="headlessui-popover-button-4" aria-expanded="false" data-headlessui-state=""><div class="p-1"><div><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 18 18" width="1em" height="1em" fill="currentColor" class="h-4 w-4 fill-gray-6 dark:fill-dark-gray-6"><path fill-opacity="0.12" d="M3.333 10.333h3.333v3.333H3.333z"></path><path fill-rule="evenodd" d="M4 3a2 2 0 00-2 2v8a2 2 0 002 2h9.333a2 2 0 002-2V5a2 2 0 00-2-2H4zm9.333 1.333H4A.667.667 0 003.333 5v4H14V5a.667.667 0 00-.667-.667zm.667 6H8v3.334h5.333A.667.667 0 0014 13v-2.667zm-7.333 0H3.333V13c0 .368.299.667.667.667h2.667v-3.334z" clip-rule="evenodd"></path></svg></div></div></div></div></div></div></div><div class="flex flex-grow overflow-y-auto"><div class="h-full w-full"><div class=""><div class="mx-5 my-4 flex flex-col space-y-4"><div class="flex w-full flex-row items-start justify-between gap-4"><div class="flex flex-wrap items-center gap-x-2 gap-y-4"><button class="font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 relative rounded-lg px-4 py-1 hover:text-label-1 dark:hover:text-dark-label-1 text-label-1 dark:text-dark-label-1">Case 1</button><button class="font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-label-2 dark:text-dark-label-2 relative rounded-lg px-4 py-1 hover:text-label-1 dark:hover:text-dark-label-1 bg-transparent dark:bg-dark-transparent">Case 2</button><button class="font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-label-2 dark:text-dark-label-2 relative rounded-lg px-4 py-1 hover:text-label-1 dark:hover:text-dark-label-1 bg-transparent dark:bg-dark-transparent">Case 3</button><button class="rounded font-medium whitespace-nowrap transition-all focus:outline-none text-gray-5 dark:text-dark-gray-5 hover:text-gray-6 dark:hover:text-dark-gray-6 bg-transparent dark:bg-dark-transparent hover:bg-transparent dark:hover:bg-transparent m-0 flex h-4 w-4 items-center justify-center p-0"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="h-4 w-4"><path fill-rule="evenodd" d="M13 11h7a1 1 0 110 2h-7v7a1 1 0 11-2 0v-7H4a1 1 0 110-2h7V4a1 1 0 112 0v7z" clip-rule="evenodd"></path></svg></button></div></div><div class="space-y-4"><div><div class="flex h-full w-full flex-col space-y-2"><div class="text-xs font-medium text-label-3 dark:text-dark-label-3">n =</div><div class="w-full cursor-text rounded-lg border px-3 py-[10px] font-menlo bg-fill-3 dark:bg-dark-fill-3 border-transparent" spellcheck="false"><div data-gramm="false" data-gramm_editor="false" data-enable-grammarly="false" class="w-full resize-none whitespace-pre-wrap font-menlo outline-none placeholder:text-label-4 dark:placeholder:text-dark-label-4" placeholder="Enter Testcase" autocorrect="off" autocapitalize="none" aria-autocomplete="none" contenteditable="true">3</div></div></div></div></div></div></div></div></div><div class="shrink-0"><div class="flex w-full bg-layer-1 dark:bg-dark-layer-1"><div class="mx-5 my-[10px] flex w-full"><div class="mr-2 flex flex-1 flex-nowrap items-center space-x-4"><button class="px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-label-2 dark:text-dark-label-2 rounded-lg pl-3 pr-2">Console<div class="ml-1 transform transition"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="fill-gray-6 text-[20px] dark:fill-dark-gray-6"><path fill-rule="evenodd" d="M16.293 14.707a1 1 0 001.414-1.414l-5-5a1 1 0 00-1.414 0l-5 5a1 1 0 101.414 1.414L12 10.414l4.293 4.293z" clip-rule="evenodd"></path></svg></div></button></div><div class="flex flex-row items-center justify-center"><img src="Fizz%20Buzz%20-%20LeetCode_files/light-judging-9d7b0f1c4035b59af3a7d6ccd8e0ac12.gif" alt="Judging..." class="mr-2 h-8 w-8 hidden"><img src="Fizz%20Buzz%20-%20LeetCode_files/light-pending-9c28f1f18993ec103b273778b5f6a648.gif" alt="Pending..." class="mr-2 h-8 w-8 hidden"></div><div class="ml-auto flex items-center space-x-4"><button class="rounded font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex p-[6px] cursor-not-allowed opacity-50 hover:bg-fill-3 dark:hover:bg-dark-fill-3"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor" class="text-gray-6 dark:text-dark-gray-6 h-5 w-5"><path fill-rule="evenodd" d="M12 4a2 2 0 00-2 2h4a2 2 0 00-2-2zm3.924 2.384A.997.997 0 0016 6a4 4 0 00-8 0c0 .136.027.265.076.384a5.015 5.015 0 00-1.97 1.48A3.002 3.002 0 014 5a1 1 0 00-2 0 5.001 5.001 0 003.182 4.659A5.005 5.005 0 005 11v1H3a1 1 0 100 2h2v1c0 .425.038.84.11 1.244A5 5 0 002 20.874a1 1 0 102 0c0-1.208.715-2.251 1.746-2.726A7 7 0 0012 22a7 7 0 006.254-3.852A3.002 3.002 0 0120 20.874a1 1 0 102 0 5 5 0 00-3.11-4.63c.072-.404.11-.82.11-1.244v-1h2a1 1 0 100-2h-2v-1c0-.465-.063-.914-.182-1.341A5.001 5.001 0 0022 5a1 1 0 10-2 0 3.002 3.002 0 01-2.105 2.865 5.015 5.015 0 00-1.971-1.481zM17 11a3 3 0 00-3-3h-1v11.9a5.002 5.002 0 004-4.9v-4zm-6 8.9V8h-1a3 3 0 00-3 3v4a5.002 5.002 0 004 4.9z" clip-rule="evenodd"></path></svg></button><button class="px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex bg-fill-3 dark:bg-dark-fill-3 hover:bg-fill-2 dark:hover:bg-dark-fill-2 text-label-2 dark:text-dark-label-2 rounded-lg">Run</button><button class="px-3 py-1.5 font-medium items-center whitespace-nowrap transition-all focus:outline-none inline-flex text-label-r bg-green-s dark:bg-dark-green-s hover:bg-green-3 dark:hover:bg-dark-green-3 rounded-lg">Submit</button></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div><script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"dehydratedState":{"mutations":[],"queries":[{"state":{"data":{"question":{"questionId":"412","questionFrontendId":"412","title":"Fizz Buzz","titleSlug":"fizz-buzz","isPaidOnly":false,"difficulty":"Easy","likes":1190,"dislikes":186}},"dataUpdateCount":1,"dataUpdatedAt":1667845743038,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["questionTitle",{"titleSlug":"fizz-buzz"}],"queryHash":"[\"questionTitle\",{\"titleSlug\":\"fizz-buzz\"}]"},{"state":{"data":{"languageList":[{"id":0,"name":"cpp"},{"id":1,"name":"java"},{"id":2,"name":"python"},{"id":11,"name":"python3"},{"id":3,"name":"mysql"},{"id":14,"name":"mssql"},{"id":15,"name":"oraclesql"},{"id":4,"name":"c"},{"id":5,"name":"csharp"},{"id":6,"name":"javascript"},{"id":7,"name":"ruby"},{"id":8,"name":"bash"},{"id":9,"name":"swift"},{"id":10,"name":"golang"},{"id":12,"name":"scala"},{"id":16,"name":"html"},{"id":17,"name":"pythonml"},{"id":13,"name":"kotlin"},{"id":18,"name":"rust"},{"id":19,"name":"php"},{"id":20,"name":"typescript"},{"id":21,"name":"racket"},{"id":22,"name":"erlang"},{"id":23,"name":"elixir"},{"id":24,"name":"dart"}]},"dataUpdateCount":1,"dataUpdatedAt":1667845742981,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["languageList",{}],"queryHash":"[\"languageList\",{}]"},{"state":{"data":{"question":{"questionId":"412","questionFrontendId":"412","codeSnippets":[{"lang":"C++","langSlug":"cpp","code":"class Solution {\npublic:\n    vector\u003cstring\u003e fizzBuzz(int n) {\n        \n    }\n};"},{"lang":"Java","langSlug":"java","code":"class Solution {\n    public List\u003cString\u003e fizzBuzz(int n) {\n        \n    }\n}"},{"lang":"Python","langSlug":"python","code":"class Solution(object):\n    def fizzBuzz(self, n):\n        \"\"\"\n        :type n: int\n        :rtype: List[str]\n        \"\"\"\n        "},{"lang":"Python3","langSlug":"python3","code":"class Solution:\n    def fizzBuzz(self, n: int) -\u003e List[str]:\n        "},{"lang":"C","langSlug":"c","code":"/**\n * Note: The returned array must be malloced, assume caller calls free().\n */\nchar ** fizzBuzz(int n, int* returnSize){\n\n}"},{"lang":"C#","langSlug":"csharp","code":"public class Solution {\n    public IList\u003cstring\u003e FizzBuzz(int n) {\n        \n    }\n}"},{"lang":"JavaScript","langSlug":"javascript","code":"/**\n * @param {number} n\n * @return {string[]}\n */\nvar fizzBuzz = function(n) {\n    \n};"},{"lang":"Ruby","langSlug":"ruby","code":"# @param {Integer} n\n# @return {String[]}\ndef fizz_buzz(n)\n    \nend"},{"lang":"Swift","langSlug":"swift","code":"class Solution {\n    func fizzBuzz(_ n: Int) -\u003e [String] {\n        \n    }\n}"},{"lang":"Go","langSlug":"golang","code":"func fizzBuzz(n int) []string {\n    \n}"},{"lang":"Scala","langSlug":"scala","code":"object Solution {\n    def fizzBuzz(n: Int): List[String] = {\n        \n    }\n}"},{"lang":"Kotlin","langSlug":"kotlin","code":"class Solution {\n    fun fizzBuzz(n: Int): List\u003cString\u003e {\n        \n    }\n}"},{"lang":"Rust","langSlug":"rust","code":"impl Solution {\n    pub fn fizz_buzz(n: i32) -\u003e Vec\u003cString\u003e {\n        \n    }\n}"},{"lang":"PHP","langSlug":"php","code":"class Solution {\n\n    /**\n     * @param Integer $n\n     * @return String[]\n     */\n    function fizzBuzz($n) {\n        \n    }\n}"},{"lang":"TypeScript","langSlug":"typescript","code":"function fizzBuzz(n: number): string[] {\n\n};"},{"lang":"Racket","langSlug":"racket","code":"(define/contract (fizz-buzz n)\n  (-\u003e exact-integer? (listof string?))\n\n  )"},{"lang":"Erlang","langSlug":"erlang","code":"-spec fizz_buzz(N :: integer()) -\u003e [unicode:unicode_binary()].\nfizz_buzz(N) -\u003e\n  ."},{"lang":"Elixir","langSlug":"elixir","code":"defmodule Solution do\n  @spec fizz_buzz(n :: integer) :: [String.t]\n  def fizz_buzz(n) do\n\n  end\nend"},{"lang":"Dart","langSlug":"dart","code":"class Solution {\n  List\u003cString\u003e fizzBuzz(int n) {\n\n  }\n}"}],"envInfo":"{\"cpp\": [\"C++\", \"\u003cp\u003eCompiled with \u003ccode\u003e clang 11 \u003c/code\u003e using the latest C++ 17 standard.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eYour code is compiled with level two optimization (\u003ccode\u003e-O2\u003c/code\u003e). \u003ca href=\\\"https://github.com/google/sanitizers/wiki/AddressSanitizer\\\" target=\\\"_blank\\\"\u003eAddressSanitizer\u003c/a\u003e is also enabled to help detect out-of-bounds and use-after-free bugs.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eMost standard library headers are already included automatically for your convenience.\u003c/p\u003e\"], \"java\": [\"Java\", \"\u003cp\u003e\u003ccode\u003e OpenJDK 17 \u003c/code\u003e. Java 8 features such as lambda expressions and stream API can be used. \u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eMost standard library headers are already included automatically for your convenience.\u003c/p\u003e\\r\\n\u003cp\u003eIncludes \u003ccode\u003ePair\u003c/code\u003e class from https://docs.oracle.com/javase/8/javafx/api/javafx/util/Pair.html.\u003c/p\u003e\"], \"python\": [\"Python\", \"\u003cp\u003e\u003ccode\u003ePython 2.7.12\u003c/code\u003e.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eMost libraries are already imported automatically for your convenience, such as \u003ca href=\\\"https://docs.python.org/2/library/array.html\\\" target=\\\"_blank\\\"\u003earray\u003c/a\u003e, \u003ca href=\\\"https://docs.python.org/2/library/bisect.html\\\" target=\\\"_blank\\\"\u003ebisect\u003c/a\u003e, \u003ca href=\\\"https://docs.python.org/2/library/collections.html\\\" target=\\\"_blank\\\"\u003ecollections\u003c/a\u003e. If you need more libraries, you can import it yourself.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eFor Map/TreeMap data structure, you may use \u003ca href=\\\"http://www.grantjenks.com/docs/sortedcontainers/\\\" target=\\\"_blank\\\"\u003esortedcontainers\u003c/a\u003e library.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eNote that Python 2.7 \u003ca href=\\\"https://www.python.org/dev/peps/pep-0373/\\\" target=\\\"_blank\\\"\u003ewill not be maintained past 2020\u003c/a\u003e. For the latest Python, please choose Python3 instead.\u003c/p\u003e\"], \"c\": [\"C\", \"\u003cp\u003eCompiled with \u003ccode\u003egcc 8.2\u003c/code\u003e using the gnu11 standard.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eYour code is compiled with level one optimization (\u003ccode\u003e-O1\u003c/code\u003e). \u003ca href=\\\"https://github.com/google/sanitizers/wiki/AddressSanitizer\\\" target=\\\"_blank\\\"\u003eAddressSanitizer\u003c/a\u003e is also enabled to help detect out-of-bounds and use-after-free bugs.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eMost standard library headers are already included automatically for your convenience.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eFor hash table operations, you may use \u003ca href=\\\"https://troydhanson.github.io/uthash/\\\" target=\\\"_blank\\\"\u003euthash\u003c/a\u003e. \\\"uthash.h\\\" is included by default. Below are some examples:\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003e\u003cb\u003e1. Adding an item to a hash.\u003c/b\u003e\\r\\n\u003cpre\u003e\\r\\nstruct hash_entry {\\r\\n    int id;            /* we'll use this field as the key */\\r\\n    char name[10];\\r\\n    UT_hash_handle hh; /* makes this structure hashable */\\r\\n};\\r\\n\\r\\nstruct hash_entry *users = NULL;\\r\\n\\r\\nvoid add_user(struct hash_entry *s) {\\r\\n    HASH_ADD_INT(users, id, s);\\r\\n}\\r\\n\u003c/pre\u003e\\r\\n\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003e\u003cb\u003e2. Looking up an item in a hash:\u003c/b\u003e\\r\\n\u003cpre\u003e\\r\\nstruct hash_entry *find_user(int user_id) {\\r\\n    struct hash_entry *s;\\r\\n    HASH_FIND_INT(users, \u0026user_id, s);\\r\\n    return s;\\r\\n}\\r\\n\u003c/pre\u003e\\r\\n\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003e\u003cb\u003e3. Deleting an item in a hash:\u003c/b\u003e\\r\\n\u003cpre\u003e\\r\\nvoid delete_user(struct hash_entry *user) {\\r\\n    HASH_DEL(users, user);  \\r\\n}\\r\\n\u003c/pre\u003e\\r\\n\u003c/p\u003e\"], \"csharp\": [\"C#\", \"\u003cp\u003e\u003ca href=\\\"https://learn.microsoft.com/en-us/dotnet/csharp/whats-new/csharp-10\\\" target=\\\"_blank\\\"\u003eC# 10 with .NET 6 runtime\u003c/a\u003e\u003c/p\u003e\"], \"javascript\": [\"JavaScript\", \"\u003cp\u003e\u003ccode\u003eNode.js 16.13.2\u003c/code\u003e.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eYour code is run with \u003ccode\u003e--harmony\u003c/code\u003e flag, enabling \u003ca href=\\\"http://node.green/\\\" target=\\\"_blank\\\"\u003enew ES6 features\u003c/a\u003e.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003e\u003ca href=\\\"https://lodash.com\\\" target=\\\"_blank\\\"\u003elodash.js\u003c/a\u003e library is included by default.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eFor Priority Queue / Queue data structures, you may use \u003ca href=\\\"https://github.com/datastructures-js/priority-queue\\\" target=\\\"_blank\\\"\u003edatastructures-js/priority-queue\u003c/a\u003e and \u003ca href=\\\"https://github.com/datastructures-js/queue\\\" target=\\\"_blank\\\"\u003edatastructures-js/queue\u003c/a\u003e.\u003c/p\u003e\"], \"ruby\": [\"Ruby\", \"\u003cp\u003e\u003ccode\u003eRuby 3.1\u003c/code\u003e\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eSome common data structure implementations are provided in the Algorithms module: https://www.rubydoc.info/github/kanwei/algorithms/Algorithms\u003c/p\u003e\"], \"swift\": [\"Swift\", \"\u003cp\u003e\u003ccode\u003eSwift 5.5.2\u003c/code\u003e.\u003c/p\u003e\"], \"golang\": [\"Go\", \"\u003cp\u003e\u003ccode\u003eGo 1.17.6\u003c/code\u003e.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eSupport \u003ca href=\\\"https://godoc.org/github.com/emirpasic/gods\\\" target=\\\"_blank\\\"\u003ehttps://godoc.org/github.com/emirpasic/gods\u003c/a\u003e library.\u003c/p\u003e\"], \"python3\": [\"Python3\", \"\u003cp\u003e\u003ccode\u003ePython 3.10\u003c/code\u003e.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eMost libraries are already imported automatically for your convenience, such as \u003ca href=\\\"https://docs.python.org/3/library/array.html\\\" target=\\\"_blank\\\"\u003earray\u003c/a\u003e, \u003ca href=\\\"https://docs.python.org/3/library/bisect.html\\\" target=\\\"_blank\\\"\u003ebisect\u003c/a\u003e, \u003ca href=\\\"https://docs.python.org/3/library/collections.html\\\" target=\\\"_blank\\\"\u003ecollections\u003c/a\u003e. If you need more libraries, you can import it yourself.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eFor Map/TreeMap data structure, you may use \u003ca href=\\\"http://www.grantjenks.com/docs/sortedcontainers/\\\" target=\\\"_blank\\\"\u003esortedcontainers\u003c/a\u003e library.\u003c/p\u003e\"], \"scala\": [\"Scala\", \"\u003cp\u003e\u003ccode\u003eScala 2.13.7\u003c/code\u003e.\u003c/p\u003e\"], \"kotlin\": [\"Kotlin\", \"\u003cp\u003e\u003ccode\u003eKotlin 1.3.10\u003c/code\u003e.\u003c/p\u003e\"], \"rust\": [\"Rust\", \"\u003cp\u003e\u003ccode\u003eRust 1.58.1\u003c/code\u003e\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eSupports \u003ca href=\\\"https://crates.io/crates/rand\\\" target=\\\"_blank\\\"\u003erand \u003c/a\u003e v0.6\\u00a0from crates.io\u003c/p\u003e\"], \"php\": [\"PHP\", \"\u003cp\u003e\u003ccode\u003ePHP 8.1\u003c/code\u003e.\u003c/p\u003e\\r\\n\u003cp\u003eWith bcmath module\u003c/p\u003e\"], \"typescript\": [\"Typescript\", \"\u003cp\u003e\u003ccode\u003eTypeScript 4.5.4, Node.js 16.13.2\u003c/code\u003e.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eYour code is run with \u003ccode\u003e--harmony\u003c/code\u003e flag, enabling \u003ca href=\\\"http://node.green/\\\" target=\\\"_blank\\\"\u003enew ES2020 features\u003c/a\u003e.\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003e\u003ca href=\\\"https://lodash.com\\\" target=\\\"_blank\\\"\u003elodash.js\u003c/a\u003e library is included by default.\u003c/p\u003e\"], \"racket\": [\"Racket\", \"\u003cp\u003eRun with \u003ccode\u003eRacket 8.3\u003c/code\u003e.\u003c/p\u003e\"], \"erlang\": [\"Erlang\", \"Erlang/OTP 24.2\"], \"elixir\": [\"Elixir\", \"Elixir 1.13.0 with Erlang/OTP 24.2\"], \"dart\": [\"Dart\", \"\u003cp\u003eDart 2.17.3\u003c/p\u003e\\r\\n\\r\\n\u003cp\u003eYour code will be run directly without compiling\u003c/p\u003e\"]}","enableRunCode":true}},"dataUpdateCount":1,"dataUpdatedAt":1667845743061,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["questionEditorData",{"titleSlug":"fizz-buzz"}],"queryHash":"[\"questionEditorData\",{\"titleSlug\":\"fizz-buzz\"}]"},{"state":{"data":{"question":{"isPaidOnly":false}},"dataUpdateCount":1,"dataUpdatedAt":1667845743010,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["premiumQuestion",{"titleSlug":"fizz-buzz"}],"queryHash":"[\"premiumQuestion\",{\"titleSlug\":\"fizz-buzz\"}]"},{"state":{"data":{"question":{"questionId":"412","questionFrontendId":"412","questionTitle":"Fizz Buzz","enableDebugger":true,"enableRunCode":true,"enableSubmit":true,"enableTestMode":false,"exampleTestcaseList":["3","5","15"],"metaData":"{\r\n  \"name\": \"fizzBuzz\",\r\n  \"params\": [\r\n    {\r\n      \"name\": \"n\",\r\n      \"type\": \"integer\"\r\n    }\r\n  ],\r\n  \"return\": {\r\n    \"type\": \"list\u003cstring\u003e\"\r\n  }\r\n}"}},"dataUpdateCount":1,"dataUpdatedAt":1667845743061,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["consolePanelConfig",{"titleSlug":"fizz-buzz"}],"queryHash":"[\"consolePanelConfig\",{\"titleSlug\":\"fizz-buzz\"}]"},{"state":{"data":{"questionTopicsList":{"totalNum":2727},"questionDiscussionTopic":{"topLevelCommentCount":9}},"dataUpdateCount":1,"dataUpdatedAt":1667845743155,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["tabsStatus",{"titleSlug":"fizz-buzz"}],"queryHash":"[\"tabsStatus\",{\"titleSlug\":\"fizz-buzz\"}]"},{"state":{"data":{"question":{"hints":[]}},"dataUpdateCount":1,"dataUpdatedAt":1667845743417,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["questionHints",{"titleSlug":"fizz-buzz"}],"queryHash":"[\"questionHints\",{\"titleSlug\":\"fizz-buzz\"}]"},{"state":{"data":{"question":{"content":"\u003cp\u003eGiven an integer \u003ccode\u003en\u003c/code\u003e, return \u003cem\u003ea string array \u003c/em\u003e\u003ccode\u003eanswer\u003c/code\u003e\u003cem\u003e (\u003cstrong\u003e1-indexed\u003c/strong\u003e) where\u003c/em\u003e:\u003c/p\u003e\n\n\u003cul\u003e\n\t\u003cli\u003e\u003ccode\u003eanswer[i] == \u0026quot;FizzBuzz\u0026quot;\u003c/code\u003e if \u003ccode\u003ei\u003c/code\u003e is divisible by \u003ccode\u003e3\u003c/code\u003e and \u003ccode\u003e5\u003c/code\u003e.\u003c/li\u003e\n\t\u003cli\u003e\u003ccode\u003eanswer[i] == \u0026quot;Fizz\u0026quot;\u003c/code\u003e if \u003ccode\u003ei\u003c/code\u003e is divisible by \u003ccode\u003e3\u003c/code\u003e.\u003c/li\u003e\n\t\u003cli\u003e\u003ccode\u003eanswer[i] == \u0026quot;Buzz\u0026quot;\u003c/code\u003e if \u003ccode\u003ei\u003c/code\u003e is divisible by \u003ccode\u003e5\u003c/code\u003e.\u003c/li\u003e\n\t\u003cli\u003e\u003ccode\u003eanswer[i] == i\u003c/code\u003e (as a string) if none of the above conditions are true.\u003c/li\u003e\n\u003c/ul\u003e\n\n\u003cp\u003e\u0026nbsp;\u003c/p\u003e\n\u003cp\u003e\u003cstrong class=\"example\"\u003eExample 1:\u003c/strong\u003e\u003c/p\u003e\n\u003cpre\u003e\u003cstrong\u003eInput:\u003c/strong\u003e n = 3\n\u003cstrong\u003eOutput:\u003c/strong\u003e [\"1\",\"2\",\"Fizz\"]\n\u003c/pre\u003e\u003cp\u003e\u003cstrong class=\"example\"\u003eExample 2:\u003c/strong\u003e\u003c/p\u003e\n\u003cpre\u003e\u003cstrong\u003eInput:\u003c/strong\u003e n = 5\n\u003cstrong\u003eOutput:\u003c/strong\u003e [\"1\",\"2\",\"Fizz\",\"4\",\"Buzz\"]\n\u003c/pre\u003e\u003cp\u003e\u003cstrong class=\"example\"\u003eExample 3:\u003c/strong\u003e\u003c/p\u003e\n\u003cpre\u003e\u003cstrong\u003eInput:\u003c/strong\u003e n = 15\n\u003cstrong\u003eOutput:\u003c/strong\u003e [\"1\",\"2\",\"Fizz\",\"4\",\"Buzz\",\"Fizz\",\"7\",\"8\",\"Fizz\",\"Buzz\",\"11\",\"Fizz\",\"13\",\"14\",\"FizzBuzz\"]\n\u003c/pre\u003e\n\u003cp\u003e\u0026nbsp;\u003c/p\u003e\n\u003cp\u003e\u003cstrong\u003eConstraints:\u003c/strong\u003e\u003c/p\u003e\n\n\u003cul\u003e\n\t\u003cli\u003e\u003ccode\u003e1 \u0026lt;= n \u0026lt;= 10\u003csup\u003e4\u003c/sup\u003e\u003c/code\u003e\u003c/li\u003e\n\u003c/ul\u003e\n","mysqlSchemas":[]}},"dataUpdateCount":1,"dataUpdatedAt":1667845743418,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["questionContent",{"titleSlug":"fizz-buzz"}],"queryHash":"[\"questionContent\",{\"titleSlug\":\"fizz-buzz\"}]"},{"state":{"data":{"question":{"stats":"{\"totalAccepted\": \"804.5K\", \"totalSubmission\": \"1.2M\", \"totalAcceptedRaw\": 804532, \"totalSubmissionRaw\": 1169117, \"acRate\": \"68.8%\"}"}},"dataUpdateCount":1,"dataUpdatedAt":1667845743417,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["questionStats",{"titleSlug":"fizz-buzz"}],"queryHash":"[\"questionStats\",{\"titleSlug\":\"fizz-buzz\"}]"},{"state":{"data":{"question":{"topicTags":[{"name":"Math","slug":"math"},{"name":"String","slug":"string"},{"name":"Simulation","slug":"simulation"}]}},"dataUpdateCount":1,"dataUpdatedAt":1667845743417,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["singleQuestionTopicTags",{"titleSlug":"fizz-buzz"}],"queryHash":"[\"singleQuestionTopicTags\",{\"titleSlug\":\"fizz-buzz\"}]"},{"state":{"data":{"interviewed":{"companies":[{"id":1111,"name":"Accenture","slug":"accenture"},{"id":1140,"name":"Accolite","slug":"accolite"},{"id":56886,"name":"Activision","slug":"activision"},{"id":54,"name":"Adobe","slug":"adobe"},{"id":69,"name":"Aetion","slug":"aetion"},{"id":1434,"name":"Affinity","slug":"affinity"},{"id":204,"name":"Affirm","slug":"affirm"},{"id":49,"name":"Airbnb","slug":"airbnb"},{"id":2034,"name":"Airtel","slug":"airtel"},{"id":745,"name":"Akamai","slug":"akamai"},{"id":521,"name":"Akuna Capital","slug":"akuna-capital"},{"id":123,"name":"Alation","slug":"alation"},{"id":59,"name":"Alibaba","slug":"alibaba"},{"id":57884,"name":"AllinCall","slug":"allincall"},{"id":55117,"name":"alphonso","slug":"alphonso"},{"id":55864,"name":"Altimetrik","slug":"altimetrik"},{"id":42,"name":"Amazon","slug":"amazon"},{"id":1097,"name":"American Express","slug":"american-express"},{"id":56475,"name":"Analytics quotient","slug":"analytics-quotient"},{"id":168,"name":"AppDynamics","slug":"appdynamics"},{"id":47,"name":"Apple","slug":"apple"},{"id":54556,"name":"AQR Capital Management LLC","slug":"aqr-capital-management-llc"},{"id":54227,"name":"Arcesium","slug":"arcesium"},{"id":1418,"name":"Arista Networks","slug":"arista-networks"},{"id":274,"name":"Asana","slug":"asana"},{"id":55327,"name":"Ascend","slug":"ascend"},{"id":54548,"name":"Athenahealth","slug":"athenahealth"},{"id":335,"name":"Atlassian","slug":"atlassian"},{"id":182,"name":"Audible","slug":"audible"},{"id":55126,"name":"Avalara","slug":"avalara"},{"id":55,"name":"Baidu","slug":"baidu"},{"id":1009,"name":"Barclays","slug":"barclays"},{"id":1051,"name":"BitGo","slug":"bitgo"},{"id":179,"name":"BlackRock","slug":"blackrock"},{"id":131,"name":"Blizzard","slug":"blizzard"},{"id":43,"name":"Bloomberg","slug":"bloomberg"},{"id":55256,"name":"Bolt","slug":"bolt"},{"id":1333,"name":"Booking.com","slug":"bookingcom"},{"id":124,"name":"Box","slug":"box"},{"id":60987,"name":"Bridgewater Associates","slug":"bridgewater-associates"},{"id":670,"name":"ByteDance","slug":"bytedance"},{"id":755,"name":"C3 IoT","slug":"c3-iot"},{"id":56140,"name":"Canonical","slug":"canonical"},{"id":1868,"name":"Capgemini","slug":"capgemini"},{"id":198,"name":"Capital One","slug":"capital-one"},{"id":58364,"name":"Cashfree","slug":"cashfree"},{"id":105,"name":"Cisco","slug":"cisco"},{"id":145,"name":"Citadel","slug":"citadel"},{"id":258,"name":"Citrix","slug":"citrix"},{"id":907,"name":"Clari","slug":"clari"},{"id":70,"name":"Cloudera","slug":"cloudera"},{"id":61658,"name":"Code Studio","slug":"code-studio"},{"id":59620,"name":"codeagon","slug":"codeagon"},{"id":426,"name":"Codenation","slug":"codenation"},{"id":54368,"name":"CoderByte","slug":"coderbyte"},{"id":1867,"name":"Cognizant","slug":"cognizant"},{"id":839,"name":"Cohesity","slug":"cohesity"},{"id":230,"name":"Coinbase","slug":"coinbase"},{"id":508,"name":"Commvault","slug":"commvault"},{"id":300,"name":"Coupang","slug":"coupang"},{"id":71,"name":"Coursera","slug":"coursera"},{"id":543,"name":"Cruise Automation","slug":"cruise-automation"},{"id":92,"name":"Cryptic Studios","slug":"cryptic-studios"},{"id":56520,"name":"DailyHunt","slug":"dailyhunt"},{"id":989,"name":"Databricks","slug":"databricks"},{"id":1544,"name":"Dataminr","slug":"dataminr"},{"id":393,"name":"DE Shaw","slug":"de-shaw"},{"id":222,"name":"Dell","slug":"dell"},{"id":1021,"name":"Deloitte","slug":"deloitte"},{"id":126,"name":"Deutsche Bank","slug":"deutsche-bank"},{"id":376,"name":"DiDi","slug":"didi"},{"id":621,"name":"Directi","slug":"directi"},{"id":61389,"name":"Discord","slug":"discord"},{"id":859,"name":"Docusign","slug":"docusign"},{"id":223,"name":"DoorDash","slug":"doordash"},{"id":565,"name":"Drawbridge","slug":"drawbridge"},{"id":56,"name":"Dropbox","slug":"dropbox"},{"id":1477,"name":"DRW","slug":"drw"},{"id":54919,"name":"Dunzo","slug":"dunzo"},{"id":221,"name":"Duolingo","slug":"duolingo"},{"id":63,"name":"eBay","slug":"ebay"},{"id":59741,"name":"edabit","slug":"edabit"},{"id":103,"name":"Electronic Arts","slug":"electronic-arts"},{"id":137,"name":"EMC","slug":"emc"},{"id":1698,"name":"Epam Systems","slug":"epam-systems"},{"id":72,"name":"Epic Systems","slug":"epic-systems"},{"id":60780,"name":"epiFi","slug":"epifi"},{"id":150,"name":"Evernote","slug":"evernote"},{"id":73,"name":"Expedia","slug":"expedia"},{"id":40,"name":"Facebook","slug":"facebook"},{"id":161,"name":"FactSet","slug":"factset"},{"id":74,"name":"Fallible","slug":"fallible"},{"id":59960,"name":"Fleetx","slug":"fleetx"},{"id":132,"name":"Flipkart","slug":"flipkart"},{"id":1999,"name":"ForUsAll","slug":"forusall"},{"id":1850,"name":"fourkites","slug":"fourkites"},{"id":55773,"name":"FPT","slug":"fpt"},{"id":1164,"name":"Garena","slug":"garena"},{"id":173,"name":"GE Digital","slug":"ge-digital"},{"id":1632,"name":"GE Healthcare","slug":"ge-healthcare"},{"id":623,"name":"general electric","slug":"general-electric"},{"id":75,"name":"Gilt Groupe","slug":"gilt-groupe"},{"id":76,"name":"GoDaddy","slug":"godaddy"},{"id":107,"name":"Goldman Sachs","slug":"goldman-sachs"},{"id":94,"name":"Goo","slug":"goo"},{"id":39,"name":"Google","slug":"google"},{"id":828,"name":"Grab","slug":"grab"},{"id":135,"name":"Groupon","slug":"groupon"},{"id":56456,"name":"GSN Games","slug":"gsn-games"},{"id":163,"name":"HBO","slug":"hbo"},{"id":95,"name":"Hedvig","slug":"hedvig"},{"id":1451,"name":"Helix","slug":"helix"},{"id":648,"name":"Honeywell","slug":"honeywell"},{"id":54626,"name":"Hotstar","slug":"hotstar"},{"id":77,"name":"Houzz","slug":"houzz"},{"id":1358,"name":"HRT","slug":"hrt"},{"id":199,"name":"HTC","slug":"htc"},{"id":197,"name":"Huawei","slug":"huawei"},{"id":1681,"name":"Hudson River Trading","slug":"hudson-river-trading"},{"id":64,"name":"Hulu","slug":"hulu"},{"id":166,"name":"IBM","slug":"ibm"},{"id":1825,"name":"IIT Bombay","slug":"iit-bombay"},{"id":65,"name":"Indeed","slug":"indeed"},{"id":58428,"name":"Info Edge","slug":"info-edge"},{"id":210,"name":"Infosys","slug":"infosys"},{"id":363,"name":"InMobi","slug":"inmobi"},{"id":55596,"name":"instacart","slug":"instacart"},{"id":56001,"name":"instagram","slug":"instagram"},{"id":102,"name":"Intel","slug":"intel"},{"id":78,"name":"Intuit","slug":"intuit"},{"id":60,"name":"IXL","slug":"ixl"},{"id":111,"name":"Jane Street","slug":"jane-street"},{"id":61895,"name":"Jeavio","slug":"jeavio"},{"id":1701,"name":"Jingchi","slug":"jingchi"},{"id":112,"name":"JPMorgan","slug":"jpmorgan"},{"id":108,"name":"Jump Trading","slug":"jump-trading"},{"id":54625,"name":"Juspay","slug":"juspay"},{"id":1195,"name":"Kakao","slug":"kakao"},{"id":54208,"name":"Karat","slug":"karat"},{"id":54632,"name":"Leap Motion","slug":"leap-motion"},{"id":133,"name":"Lending Club","slug":"lending-club"},{"id":45,"name":"LinkedIn","slug":"linkedin"},{"id":61,"name":"LiveRamp","slug":"liveramp"},{"id":61090,"name":"Lowe","slug":"lowe"},{"id":55160,"name":"Lucid","slug":"lucid"},{"id":79,"name":"Lyft","slug":"lyft"},{"id":552,"name":"Machine Zone","slug":"machine-zone"},{"id":1537,"name":"MachineZone","slug":"machinezone"},{"id":585,"name":"MakeMyTrip","slug":"makemytrip"},{"id":80,"name":"MAQ Software","slug":"maq-software"},{"id":66,"name":"Mathworks","slug":"mathworks"},{"id":119,"name":"Matlab","slug":"matlab"},{"id":2070,"name":"Media.net","slug":"medianet"},{"id":232,"name":"Meituan","slug":"meituan"},{"id":1775,"name":"Mercari","slug":"mercari"},{"id":41,"name":"Microsoft","slug":"microsoft"},{"id":56016,"name":"MindTickle","slug":"mindtickle"},{"id":54815,"name":"MindTree","slug":"mindtree"},{"id":62354,"name":"MishiPay","slug":"mishipay"},{"id":60538,"name":"Mobisy","slug":"mobisy"},{"id":56105,"name":"Moengage","slug":"moengage"},{"id":134,"name":"Morgan Stanley","slug":"morgan-stanley"},{"id":600,"name":"Myntra","slug":"myntra"},{"id":54184,"name":"Nagarro","slug":"nagarro"},{"id":1039,"name":"National Instruments","slug":"national-instruments"},{"id":81,"name":"NetEase","slug":"netease"},{"id":323,"name":"Netflix","slug":"netflix"},{"id":61318,"name":"Netmeds","slug":"netmeds"},{"id":82,"name":"Netsuite","slug":"netsuite"},{"id":561,"name":"NextJump","slug":"nextjump"},{"id":164,"name":"Nutanix","slug":"nutanix"},{"id":104,"name":"Nvidia","slug":"nvidia"},{"id":358,"name":"Opendoor","slug":"opendoor"},{"id":1491,"name":"opentext","slug":"opentext"},{"id":1840,"name":"Optum","slug":"optum"},{"id":106,"name":"Oracle","slug":"oracle"},{"id":96,"name":"Palantir Technologies","slug":"palantir-technologies"},{"id":140,"name":"Paypal","slug":"paypal"},{"id":56756,"name":"PayPay","slug":"paypay"},{"id":948,"name":"PayTM","slug":"paytm"},{"id":1587,"name":"payu","slug":"payu"},{"id":57569,"name":"persistent systems","slug":"persistent-systems"},{"id":54724,"name":"PhonePe","slug":"phonepe"},{"id":60174,"name":"Pickrr","slug":"pickrr"},{"id":67,"name":"Pinterest","slug":"pinterest"},{"id":53,"name":"Pocket Gems","slug":"pocket-gems"},{"id":160,"name":"Point72","slug":"point72"},{"id":1352,"name":"Pony.ai","slug":"ponyai"},{"id":972,"name":"Poshmark","slug":"poshmark"},{"id":371,"name":"Postmates","slug":"postmates"},{"id":83,"name":"Poynt","slug":"poynt"},{"id":97,"name":"Pure","slug":"pure"},{"id":84,"name":"Pure Storage","slug":"pure-storage"},{"id":64513,"name":"Qaultrics","slug":"qaultrics"},{"id":194,"name":"Qualcomm","slug":"qualcomm"},{"id":116,"name":"Qualtrics","slug":"qualtrics"},{"id":372,"name":"Quantcast","slug":"quantcast"},{"id":60330,"name":"Quince","slug":"quince"},{"id":1058,"name":"Quip (Salesforce)","slug":"quip"},{"id":143,"name":"Quora","slug":"quora"},{"id":85,"name":"Rackspace","slug":"rackspace"},{"id":1600,"name":"Radius","slug":"radius"},{"id":1288,"name":"razorpay","slug":"razorpay"},{"id":588,"name":"Reddit","slug":"reddit"},{"id":180,"name":"Redfin","slug":"redfin"},{"id":597,"name":"RetailMeNot","slug":"retailmenot"},{"id":86,"name":"Riot Games","slug":"riot-games"},{"id":1427,"name":"Robinhood","slug":"robinhood"},{"id":853,"name":"Roblox","slug":"roblox"},{"id":169,"name":"Rubrik","slug":"rubrik"},{"id":138,"name":"Salesforce","slug":"salesforce"},{"id":87,"name":"Samsung","slug":"samsung"},{"id":185,"name":"SAP","slug":"sap"},{"id":1314,"name":"Sapient","slug":"sapient"},{"id":220,"name":"ServiceNow","slug":"servicenow"},{"id":56395,"name":"ShareChat","slug":"sharechat"},{"id":54899,"name":"Shopee","slug":"shopee"},{"id":1125,"name":"Siemens","slug":"siemens"},{"id":117,"name":"Sina","slug":"sina"},{"id":48,"name":"Snapchat","slug":"snapchat"},{"id":1126,"name":"Snapdeal","slug":"snapdeal"},{"id":54336,"name":"Société Générale","slug":"societe-generale"},{"id":55484,"name":"Softwire","slug":"softwire"},{"id":149,"name":"Sony","slug":"sony"},{"id":176,"name":"SoundHound","slug":"soundhound"},{"id":170,"name":"Splunk","slug":"splunk"},{"id":518,"name":"Spotify","slug":"spotify"},{"id":54694,"name":"Sprinklr","slug":"sprinklr"},{"id":88,"name":"Square","slug":"square"},{"id":1795,"name":"Strava","slug":"strava"},{"id":121,"name":"Sumologic","slug":"sumologic"},{"id":54377,"name":"Swiggy","slug":"swiggy"},{"id":128,"name":"Symantec","slug":"symantec"},{"id":58263,"name":"T System","slug":"t-system"},{"id":61401,"name":"T-mobile","slug":"t-mobiles"},{"id":171,"name":"Tableau","slug":"tableau"},{"id":1727,"name":"tcs","slug":"tcs"},{"id":68,"name":"Tencent","slug":"tencent"},{"id":257,"name":"Tesla","slug":"tesla"},{"id":1482,"name":"Thomson Reuters","slug":"thomson-reuters"},{"id":56283,"name":"TIAA","slug":"tiaa"},{"id":56419,"name":"Tiger Analytics","slug":"tiger-analytics"},{"id":55610,"name":"TikTok","slug":"tiktok"},{"id":100,"name":"TinyCo","slug":"tinyco"},{"id":357,"name":"Toptal","slug":"toptal"},{"id":63701,"name":"Trilogy","slug":"trilogy"},{"id":129,"name":"TripAdvisor","slug":"tripadvisor"},{"id":509,"name":"TripleByte","slug":"triplebyte"},{"id":625,"name":"TuSimple","slug":"tusimple"},{"id":159,"name":"Twilio","slug":"twilio"},{"id":269,"name":"Twitch","slug":"twitch"},{"id":46,"name":"Twitter","slug":"twitter"},{"id":58,"name":"Two Sigma","slug":"two-sigma"},{"id":44,"name":"Uber","slug":"uber"},{"id":906,"name":"United Health Group","slug":"united-health-group"},{"id":89,"name":"Valve","slug":"valve"},{"id":214,"name":"Veritas","slug":"veritas"},{"id":56399,"name":"Vimeo","slug":"vimeo"},{"id":55120,"name":"Virtu Financial","slug":"virtu"},{"id":203,"name":"Visa","slug":"visa"},{"id":130,"name":"VMware","slug":"vmware"},{"id":1290,"name":"Walmart Global Tech","slug":"walmart-labs"},{"id":61608,"name":"warnermedia","slug":"warnermedia"},{"id":453,"name":"Wayfair","slug":"wayfair"},{"id":54673,"name":"Wayve","slug":"wayve"},{"id":165,"name":"Wealthfront","slug":"wealthfront"},{"id":437,"name":"Wish","slug":"wish"},{"id":1939,"name":"Wix","slug":"wix"},{"id":62,"name":"Works Applications","slug":"works-applications"},{"id":60161,"name":"Xing","slug":"xing"},{"id":52,"name":"Yahoo","slug":"yahoo"},{"id":120,"name":"Yandex","slug":"yandex"},{"id":757,"name":"Yatra","slug":"yatra"},{"id":51,"name":"Yelp","slug":"yelp"},{"id":91,"name":"Zappos","slug":"zappos"},{"id":50,"name":"Zenefits","slug":"zenefits"},{"id":62191,"name":"zeta suite","slug":"zeta-suite"},{"id":200,"name":"Zillow","slug":"zillow"},{"id":469,"name":"Zoho","slug":"zoho"},{"id":584,"name":"Zomato","slug":"zomato"},{"id":54858,"name":"Zoom","slug":"zoom"},{"id":57890,"name":"Zopsmart","slug":"zopsmart"},{"id":1114,"name":"ZScaler","slug":"zscaler"},{"id":731,"name":"Zulily","slug":"zulily"},{"id":109,"name":"Zynga","slug":"zynga"}],"timeOptions":[{"id":0,"name":"last week"},{"id":1,"name":"last month"},{"id":2,"name":"last 3 months"},{"id":3,"name":"last 6 months"},{"id":4,"name":"more than 6 months"},{"id":5,"name":"other"}],"stageOptions":[{"id":0,"name":"Online Assessment"},{"id":1,"name":"Phone Interview"},{"id":4,"name":"On Campus Interview"},{"id":2,"name":"Onsite Interview"},{"id":3,"name":"Don't know"}]}},"dataUpdateCount":1,"dataUpdatedAt":1667845743420,"error":null,"errorUpdateCount":0,"errorUpdatedAt":0,"fetchFailureCount":0,"fetchMeta":null,"isFetching":false,"isInvalidated":false,"isPaused":false,"status":"success"},"queryKey":["questionInterviewOptions",{}],"queryHash":"[\"questionInterviewOptions\",{}]"}]},"_nextI18Next":{"initialI18nStore":{"en":{"common":{"404":{"title":"Page Not Found - LeetCode","pageNotFound":"Page Not Found","message":"Sorry, but we can't find the page you are looking for..."},"meta":{"title":"","description":"Level up your coding skills and quickly land a job. This is the best place to expand your knowledge and get prepared for your next interview.","keywords":""},"ok":"OK","cancel":"Cancel","confirm":"Confirm","update":"Update","submit":"Submit","netFailed":"Something went wrong!","header":{"logo":{"url":"","description":""},"title":{"problemset-all":""},"action":{"login":{"text":"","url":""}}},"conjunctions":{"and":"and","or":"or"},"pages":{"leetcode":"LeetCode","explore":"Explore","problems":"Problems","interview":{"interview":"Interview","onlineInterview":"Online Interview","assessment":"Assessment"},"contest":"Contest","discuss":"Discuss","store":{"store":"Store","redeem":"Redeem","premium":"Premium","shop":"Micro-shop"},"admin":{"admin":"Admin","library":"Library","review":"Review","operations":"User Management","scores":"Points","contribute":"Contribution","backend":"Administration","internalContest":"Internal Contest Dashboard","contestDashboard":"Contest Dashboard","contestAdmin":"Contest Cheating Dashboard","emailBatch":"Email Batch","dangerZone":"Danger Zone"},"mobileApp":"Mobile App","playground":"Playground","signIn":"Sign in","register":"Register","signOut":"Sign Out"},"userMenu":{"renew":"Renew","getPremium":"Access all features with our Premium subscription!","orders":"Orders","translateQuestions":"Display problems in Chinese","unmockUser":"Unmock User","revertToOldVersion":"Revert to old version","categories":{"myList":"My Lists","notebook":"Notebook","submissions":"Submissions","session":"Session","points":"Points","progress":"Progress"}},"streakCounter":{"finished":"Well done! Come back for tomorrow's challenge!","unfinished":"Solve today's Daily Challenge to refresh your streak!","buyTimeTravelTicket":"Buy Time Travel Ticket","missedOneDayThisMonth":"You missed 1 day this month. ","missedDaysThisMonth":"You missed {{count}} days this month. "},"playground":{"playground":"Playground","myPlaygrounds":"My Playgrounds","remainingPlaygrounds":"Remaining","renew":"Renew","templates":{"consoleApplication":"Console Application","empty":"New Playground","frontend":"Frontend","machineLearning":"Machine Learning"}},"links":{"premium":"/subscribe/","discuss":"/discuss/","assessment":"/assessment/","shop":"https://detail.youzan.com/show/goods/newest?alias=271n43vr9hen7","onlineInterview":"https://interview.leetcode.com/interview/","profileArticles":"/submissions/","orders":"/store/orders/","explore":"/explore/","admin":{"scores":"/points/admin","operations":"/user_management"},"playground":"/playground"},"pagination":{"perpage":"/ page"},"expand":"Expand","collapse":"Collapse","difficulty":{"easy":"Easy","medium":"Medium","hard":"Hard"},"easterEgg":{"rewardMessage":"Congratulations! You just found 10 LeetCoins. Happy LeetCoding!"},"markdown":{"heading":"heading","quote":"Quote"},"mentions":{"users":"Users","problems":"Problems"},"confirmModal":{"title":"Are you sure?","confirmBtn":"Confirm","cancelBtn":"Cancel"},"saving":"Saving...","saved":"Saved","autoSaved":"Save automatically","loginRequired":"Sign in required","verifiedRequired":"You need to verify your email","phoneVerifiedRequired":"Your need to verify your phone","maybeVerifiedRequired":"You need to verify your email","dailyCheckIn":"+1 Daily Check-in","copied":"Copied!","survey":{"veryDissatisfied":"Very Dissatisfied","verySatisfied":"Very Satisfied","next":"Next","continue":"Continue","submit":"Submit","questionNo":"Question {{current}} of {{total}}","thanksMsg":"🎉 Thanks for your feedback!"}},"problems":{"meta":{"title":"{{title}} - LeetCode","description":"{{title}} - {{content}}","ogImage":"https://leetcode.com/static/images/LeetCode_Sharing.png","defaultDescription":"Level up your coding skills and quickly land a job. This is the best place to expand your knowledge and get prepared for your next interview."},"tabs":{"description":"Description","discussion":"Discussion","solutions":"Solutions","submissions":"Submissions"},"lockedQuestion":{"subscribeToUnlock":"Subscribe to unlock.","subscribeToUnlockMessage":"Thanks for using LeetCode! To view this question you must subscribe to premium.","subscribe":"Subscribe"},"feedback":{"feedback":"Feedback","revertToOld":"Revert to last version"},"satisfactionSurvey":{"submitBtnText":"Get LeetCoins"}},"console":{"meta":{"title":"Question Detail"},"console":{"console":"Console","run":"Run","to":"to","or":"or","submit":"Submit","execute":"Execute","resetTestcases":"Reset Testcases","debug":"Debug","testcase":"Testcase","debugger":"Debugger","testcaseNumber":"Case {{ number }}","cloneCurrentTestcase":"Clone current testcase","switchConsoleToLeft":"Move console to the left side of the page","switchConsoleToRight":"Move console to the right side of the page","testcasePlaceholder":"Enter Testcase","showFullTree":"Click to view the entire tree","fullTreeTooBig":"Data is too large to display","result":{"result":"Result","stdout":"Stdout","noResult":"You must run your code first","slowdown":{"premium":"You have attempted to run code too soon. Please try again in a few seconds.","first":"You have attempted to run code too soon. Please try again in a few seconds, or","second":"Subscribe","third":"to reduce wait time."},"networkError":"Unknown network error. Please try reloading page.","serverError":"Unknown server error. Please contact our support team.","compileError":"Compile Error","runtimeError":"Runtime Error","copyCompileError":"Copy error message to clipboard","copyContent":"Copy content to clipboard","copied":"Successfully copied to clipboard!","outputLimitExceeded":"Output Limit Exceeded","timeLimitExceeded":"Time Limit Exceeded","memoryLimitExceeded":"Memory Limit Exceeded","timeout":"Server Request Timeout","internalError":"Internal Error","accepted":"Accepted","wrongAnswer":"Wrong Answer","invalidTestcase":"Invalid Testcase","runtime":"Runtime","input":"Input","output":"Output","expected":"Expected","contribution":"Contribute a testcase","pending":"Pending...","premiumPending":"Pending...","judging":"Judging...","debugging":"Debugging...","speedUp":"Speed Up","lastExecutedInput":"Last Executed Input","testcasesPassed":"testcases passed","useTestcaseAsInput":"Use Testcase as Input","cantUseTestcaseAsInput":"You have reached maximum number of testcases","debugger":"Debugger","moreLine_one":"more line","moreLine_other":"more lines"},"info":{"info":"Info","content":"\u003c0\u003eAre 'Run' results inconsistent with 'Submit' results? If you are using global/static variables or C/C++, please check\u003c/0\u003e \u003c1\u003ethis\u003c/1\u003e \u003c0\u003eout.\u003c/0\u003e","ok":"Okay","howToCreateBinaryTreeTestcases":"How to create binary tree testcases","howToCreateDatabaseTestcases":"How to create database testcases"}},"visualizer":{"dataTooLarge":"Data too large to be displayed, input would be truncated.","parseFailed":"Failed to parse your input, please check again.","dataNotSupported":"This doesn't support visualization.","outputDataTypeNotSupported":"Output data type doesn't support visualization","initFailed":"Failed to init the canvas, please refresh the page and try again."},"verifyEmail":"verify email","nonVerifyMsg":"Please verify email to run the code","signToRunOrSubmit":"You need to Login/Sign up to {{action}}","signToRunAndSubmit":"You need to \u003c0\u003eLogin/Sign up\u003c/0\u003e to run or submit","verifyToRunAndSubmit":"You need to \u003c0\u003everify email\u003c/0\u003e to execute or submit your code","notAvailableDuringDebugging":"Not available during debugging","notAvailableDuringExecuting":"Not available during executing","oneClickDebug":"One Click Debug"},"code-editor":{"commonConfirmTitle":"Are you sure?","fullScreen":"Full screen","exitFullScreen":"Exit full screen","lsp":{"autocomplete":"Auto","connectFail":"Autocomplete connect failure","langNotSupportLSP":"The language is not supported by our platform","info":"Provides intelligent code completion based on language and an analysis of your source code."},"langNotSupportLSP":"The language is not supported by our platform","langInfo":"Language Information","settings":{"name":"Settings","fontSize":"Font size","fontSizeDesc":"Choose your preferred font size for the code editor.","theme":"Theme","themeDesc":"Tired of the white background? Try different styles and syntax highlighting.","themeDark":"Dark","themeLight":"Light","themeSystem":"System","keyBinding":"Key binding","keyBindingDesc":"Want to practice Vim or Emacs? We have these key binding options available for you.","keyBindingVim":"Vim","keyBindingEmacs":"Emacs","keyBindingStandard":"Standard","tabSize":"Tab size","tabSizeDesc":"Choose the width of a tab character.","spaces":"{{count}} spaces"},"shortcuts":{"name":"Editor Shortcuts","run":"Run code","submit":"Submit","debug":"Debug code","indent":"To indent one level","indentFew":"To indent one fewer levels","moveLines":"To move lines up/down","cut":"Delete line and copy to buffer","toggleComment":"Comment/uncomment current selection","undo":"Undo action","redo":"Redo action"},"reset":{"tip":"Reset to default code definition","confirmContent":"Your current code will be discarded and reset to the default code!","resetServer":"Continue to work on your code from {{time}}","restore":"Restore"},"history":{"title":"{{lang}} Submission Notes","tip":"Submission Notes","description":"Only the code submitted in the current language will be displayed; When you select and confirm the selection, your current code will be overwritten by the code you selected.","status":"Status","runtime":"Runtime","memory":"Memory","time":"Time","topic":"Topic","notes":"Notes","noNotes":"You haven't added notes to any submissions yet!"},"timer":{"start":"Start timer","hide":"Hide timer","show":"Show timer","reset":"Reset timer"},"debugger":{"loginToDebug":"You need to Login/Sign up to debug","name":"Debugger","stdout":"Standard output","input":"Input","enterTip":"Click on line number to add breakpoints","exit":"Exit","start":"Start Debug","stop":"Stop Debug","startShort":"Debug","stopShort":"Stop","watch":"Watch Expressions","local":"Local Variables","watchHolder":"Please enter the watch expressions value","controlStart":"Start Debug F5","controlForward":"Skip forward F5","controlStepOver":"Step over F10","controlStepOut":"Step out Ctrl+F11","controlStepOutMac":"Step out ⌘+F11","controlStepIn":"Step in Shift+F11","controlStepInMac":"Step in ⇧+F11","controlReset":"Reset Ctrl+Shift+F5","controlResetMac":"Reset ⌘+⇧+F5","exited":"Debugger session exited, terminate it?","startToWatch":"Start debugging session to see watch expressions","watchTip":"You need to Start debugging to add value","startViewVars":"Start debugging session to see local variables","noVars":"No local variables detected","startViewOutput":"Start the debugging session to check output here","noOutput":"No output yet...","edited":"The code has been modified, you can reload debug","cantAddTestcase":"You have reached maximum number of testcases"},"markDownPlaceholder":"Type here...(Markdown is enabled)"},"description":{"status":{"tried":"Attempted","ac":"Solved"},"ok":"OK","somethingWentWrong":"Something went wrong","thanksForVoting":"Thanks for voting!","companies":"Companies","pastSixMonths":"0 - 6 months","pastYear":"6 months - 1 year","pastTwoYears":"1 year - 2 years","companyPremiumAccess":"Only Premium users can access company and interview frequency data.","companySubscribe":"Subscribe","hint":"Hint","showHints":"Show Hints","moreActions":"More Actions","feedback":"Feedback","showEnglish":"Show English Translation","showChinese":"Show Chinese Translation","addToListError":"Something went wrong. Please try again.","feedbackForm":{"optionRequiredError":"Please select at least one option.","title":"Feedback","alternative":"You may also \u003c0\u003esubmit via Github\u003c/0\u003e to get feedback in real time.","cancel":"Cancel","submit":"Submit","issuesEncountered":"Issues Encountered","problem":"Problem","additionalFeedback":"Additional Feedback","description":"We try to keep our questions to the highest quality possible. Could you please tell us why you disliked this question?","somethingWentWrong":"Something went wrong","options":{"unclearDescription":"Description or examples are unclear or incorrect","unclearDifficulty":"Difficulty is inaccurate","unclearTestCases":"Testcases are missing or incorrect","runtimeStrict":"Runtime is too strict","edgeCases":"Edge cases are too frustrating to solve","other":"Other","otherPlaceholder":"Additional feedback"}},"accepted":"Accepted","submissions":"Submissions","acRate":"Acceptance Rate","copyright":"Copyright ©️ {{year}} LeetCode All rights reserved","yes":"Yes","no":"No","add2":"Add","seenBefore":"Seen this question in a real interview before?","whichCompany":"Which Company?","whichTimePeriod":"When did you encounter this question?","whichStage":"Which interview stage?","thanksForFeedback":"🎉 Thank you for your feedback!","relatedTopics":"Related Topics","add":"Add","remove":"Remove","createNewList":"Create a new list","nameListPlaceholder":"Enter a list name","cancel":"Cancel","save":"Save","setAsPrivate":"Set as Private","addToList":"Add to List","sqlSchema":"SQL Schema","confirm":"Confirm","favoriteSignInError":"Sign in to access your lists","feedbackSignInError":"Sign in to give feedback","likeSignInError":"Sign in to like or dislike this question","mysqlCopySuccess":"Successfully copied to clipboard","shareQuestionDescription":"Check out this coding interview problem on LeetCode!","viewMyLists":"View my Lists","searchPlaceholder":"Search...","similarQuestions":"Similar Questions"},"submissions":{"runtime":"Runtime","memory":"Memory","beat":"Beats","noData":"No data","noCode":"There is no code here","copied":"Copied","pending":"Pending...","includesNotes":"Includes Notes","success":{"accept":"Accepted","timeTaken":"Time taken: {{time}}","nextQuestion":"Next question","moreChallenges":"More challenges","second_short":"s","minute_short":"m","hour_one":"hr","hour_other":"hrs"},"details":{"myCode":"My Submitted Code","otherCode":"My Submitted Code","sampleCode":"Sample {{metric}} submission","backToMyCode":"Back to my position","chartHintForAction":"Click on the chart to check sample codes","fetchingCodeFromServer":"Fetching code from server..."},"buttons":{"close":"Close","details":"Details","solution":"Solution"},"filters":{"allStatuses":"All statuses","allLanguages":"All languages"},"notes":{"label":"Notes","placeholder":"Write your notes here"},"relatedTags":{"label":"Related Tags","placeholder":"Select tags","startTyping":"Start typing to find a tag","noResults":"No tags found"},"chart":{"runtimeDescription":"Accepted Solutions Runtime Distribution (%)","memoryDescription":"Accepted Solutions Memory Distribution (%)","runtimeShortDescription":"Distribution (%)","memoryShortDescription":"Distribution (%)","youAreHere":"You are here!","hintForAction":"Click to check the distribution chart","runtime":"Runtime","memory":"Memory","percentLabel":"{{percent}}% of solutions used","runtimeValueLabel":"{{value}} ms of runtime","memoryValueLabel":"{{value}} MB of memory","noData":"Sorry, there are not enough accepted submissions to show data"},"nonSignedIn":{"signInTitle":"🔥 Join LeetCode to Code!","signInInfo":"View your Submission records here","signInButton":"Register or Sign In"},"failedSubmission":{"runtimeError":"Runtime Error","compileError":"Compile Error","lastTestcase":"Last Executed Input"}},"feature-guide":{"layout":"Drag the divider to resize the window based on your preference!","timer":"\u003c0\u003eTimer:\u003c/0\u003e Use the new timer feature to record how much time you spend solving a question!","debugger":"\u003c0\u003eDebugger:\u003c/0\u003e Use the debugger feature to make debugging easy peasy.","problemSwitch":"Quickly navigate to the \u003c0\u003eprevious/next question\u003c/0\u003e here","problemList":"Quickly navigate to the \u003c0\u003eprevious page\u003c/0\u003e here","discussion":"Post any ideas in the \u003c0\u003eDiscussion\u003c/0\u003e. If you want to share a solution, share it under the solution tab!","solution":"Share your solution with other users, and find LeetCode's official solution alongside other users' solutions here.","back":"Back","skip":"Skip","next":"Next","ok":"OK","title":"🎉 Introducing our new question page!"},"solutions":{"filter":{"searchPlaceholder":"Search","tags":{"placeholder":"Tags","searchPlaceholder":"Filter tags","languages":"Languages","topicTags":"Topics","expand":"Expand","collapse":"Collapse","noResults":"No results","reset":"Reset"},"sortBy":{"placeholder":"Sort by","hot":"Hot","most_posts":"Most Posts","most_relevant":"Most Relevant","most_votes":"Most Votes","newest_to_oldest":"Most Recent","oldest_to_newest":"Oldest to Newest","recent_activity":"Recent Activity","hot_short":"Hot","newest_to_oldest_short":"Recent","most_votes_short":"Votes","most_relevant_short":"Relevant"}},"comments":{"edited":"(Edited)","tooShort":"Comment is too short","noComments":"No comments yet.","reply":"Reply","mentionInputPlaceholder":"Tag a user or a problem","user":"Users","problem":"Problems","mdRules":{"inlineCode":"your inline code...","codeBlock":"code block","link":"leetcode","href":"https://leetcode.com"},"pinnedBy":"Pinned by {{pinnedBy}}","share":"Share","edit":"Edit","shareCopySuccess":"Copied link to clipboard","hideReplies":"Hide Replies","showReplies":"Show {{num}} Replies","cancel":"Cancel","confirm":"Confirm","preview":"Preview","comment":"Comment","typeCommentHere":"Type comment here... (Markdown supported)","comments":"Comments","sortBy":"Sort by","newestToOldest":"Newest to Oldest","oldestToNewest":"Oldest to Newest","mostVotes":"Most Votes","best":"Best","editor":"Editor","youMust":"You must","verifyYourEmail":"verify your email","first":"first","readMore":"Read more","somethingWentWrong":"Something went wrong","areYouSure":"Are you sure?","confirmDeleteComment":"Are you sure you want to delete this comment?","confirmRestoreComment":"Are you sure you want to restore this comment?","confirmHideComment":"Are you sure you want to hide this comment from non-authors?","confirmShowComment":"Are you sure you want to show this comment to everyone?","confirmPinComment":"Are you sure you want to pin this comment?","confirmUnpinComment":"Are you sure you want to unpin this comment?","reward":"Reward","delete":"Delete","hide":"Hide","show":"Show","askQuestion":"Ask Question","feedback":"Feedback","tips":"Tips","chooseAType":"Choose a type","showMoreReplies":"Show more replies","hideSuccess":"Comment hidden from non-authors.","showSuccess":"Comment now visible to everyone.","pinSuccess":"Comment has been pinned.","unpinSuccess":"Comment has been unpinned.","deleteSuccess":"Comment Successfully Deleted","restore":"Restore","restoreSuccess":"Comment Successfully Restored","hidden":"Hidden","report":"Report","pin":"Pin","pinned":"Pinned","unpin":"Unpin","hideComment":"Hide Comment","showComment":"Show Comment","move":"Move to Solution","moveTitle":"Title:","moveTitlePlaceholder":"Enter title here","moveSuccess":"Comment Successfully Moved","genericError":"Something went wrong","postSuccess":"Comment Successfully Post"},"solution":"Solution","writeSolution":"Solution","continueSolution":"Solution","videoSolutionTooltip":"Video Solution","premiumOnlyTooltip":"Premium Solution","tags":{"official":"Official","pinned":"Pinned","favorite":"My Favorite","mySolution":"My Solution"},"post":{"prevLabel":"Previous","nextLabel":"Next","isAdmin":"Admin","reputationTooltip":"Reputation","share":"Share","addToCollection":"Favorite","isInCollection":"Favorite","votes":"({{votesCount}} votes)","shareCopySuccess":"Copied link to clipboard","addToFavoriteSuccess":"Added to favorite solutions","removeFromFavoriteSuccess":"Removed from favorite solutions","feedbackTooltip":"Feedback","backToTop":"Back to top","genericError":"Something went wrong","rateSuccess":"Thanks for rating this solution!","more":{"error":"Something went wrong","cancel":"Cancel","edit":"Edit","subscribe":"Subscribe","subscribeMessage":"Subscribed","unsubscribe":"Unsubscribe","unsubscribeMessage":"Unsubscribed","delete":"Delete","deleteMessage":"Deleted","deleteConfirmText":"Are you sure you want to delete this post?","deleteConfirmBtn":"Delete","restore":"Restore","restoreMessage":"Restored","restoreConfirmText":"Are you sure you want to restore this post?","restoreConfirmBtn":"Restore","report":"Report","reportMessage":"Reported","pin":"Pin","pinMessage":"Pinned","pinConfirmText":"Are you sure you want to pin this post?","pinConfirmBtn":"Pin","unpin":"Unpin","unpinMessage":"Unpinned","unpinConfirmText":"Are you sure you want to unpin this post?","unpinConfirmBtn":"Unpin","hide":"Hide","hideMessage":"Hid the post","hideConfirmText":"Are you sure you want to hide this post?","hideConfirmBtn":"Hide","hideFromTrending":"Hide from trending","hideFromTrendingMessage":"Hid post from trending","hideFromTrendingConfirmText":"Are you sure you want to hide this post from trending?","hideFromTrendingConfirmBtn":"Hide from trending","show":"Show","showMessage":"Showed the post","showConfirmText":"Are you sure you want to show this post to everyone?","showConfirmBtn":"Show","moveToDiscussion":"Move to Discussion","moveToDiscussionMessage":"Moved to Discussion","moveToDiscussionConfirmText":"Are you sure you want to move this post to Discussion?","moveToDiscussionConfirmBtn":"Move to Discussion"}},"sidebar":{"comments":"Comments","favorite":"Favorited","views":"Views","relatedTags":"Related Tags","relatedSolutions":"Related Solutions"},"searchResult":{"commentPrefix":" comment","replyPrefix":" reply to ","colon":": "},"noDirectResultsHint":"No results. Here are some related threads.","noResults":"There aren't any solution topics here yet!","report":{"reportModalTitle":"Report this content","contentPlaceholder":"Additional feedback","cancel":"Cancel","confirm":"Confirm","advertising":"Spam advertising","sexual":"Sexual content","violent":"Violent content","terrorism":"Promotes terrorism","illegal":"Illegal content","abuse":"Abuse others","nonEnglish":"Non English content","other":"Others","reportSuccess":"Report submitted!","reportError":"Couldn't submit the report, please try again"},"blocker":{"subscribeToUnlock":"Subscribe to unlock.","subscribeSubTitle":"Thanks for using LeetCode! To view this solution you must subscribe to premium.","subscribe":"Subscribe"}},"post-solution":{"meta":{"newTitle":"{{title}} - LeetCode - New Solution","editTitle":"{{title}} - LeetCode - Edit Solution"},"filterTopic":"Filter topics","publishSolution":"Solution","publishSolutionTooltip":"Submit at least 1 AC to publish a solution","restore":"Restore from draft","overwriteWithLastAc":"Overwrite with the latest AC submission","generatedWithSources":{"lastAc":"Generated from the latest AC submission","submission":"Generated from the chosen submission","draft":"Restored from draft"},"editingSolution":"Editing the existing solution","blockCode":"Code Block","tag":"Tag","related":"Related","selectATag":"Please select at least one tag","post":"Post","publishError":"Could not publish solution","imgUploadSuccuss":"Upload successfully","imgUploadError":"Upload failure","guideTooltip":"Markdown Guide","saved":"Saved"}},"zh":{"common":{"404":{"title":"力扣","pageNotFound":"页面不存在","message":"抱歉！我们找不到您想访问的页面..."},"meta":{"title":"","description":"","keywords":""},"ok":"好","cancel":"取消","confirm":"确认","update":"更新","submit":"提交","netFailed":"网络错误","header":{"logo":{"url":"","description":""},"title":{"problemset-all":""},"action":{"login":{"text":"","url":""}}},"conjunctions":{"and":"and","or":"或"},"pages":{"leetcode":"LeetCode","explore":"学习","problems":"题库","interview":{"interview":"求职","onlineInterview":"在线面试","assessment":"Assessment"},"contest":"竞赛","discuss":"讨论","store":{"store":"商店","redeem":"力扣周边","premium":"Plus 会员","shop":"精品商城"},"admin":{"admin":"管理员","library":"题库","translation":"翻译","operations":"运营管理","scores":"点数","contribute":"贡献","backend":"后台管理","twoStepVerification":"二步验证","internalContest":"Internal Contest Dashboard","contestAdmin":"Contest Cheating Dashboard","dangerZone":"Danger Zone","review":"Review","contestDashboard":"Contest Dashboard"},"mobileApp":"下载 App","playground":"Playground","myPlayground":"我的 Playground","signIn":"登录","register":"注册","signOut":"退出"},"userMenu":{"renew":"续订","getPremium":"升级 Plus 会员享专属特权","orders":"订单","resume":"简历信息","translateQuestions":"题目以中文展示","translateQuestionsEn":"题目以英文显示","enterprise":"企业招聘","revertToOldVersion":"回到旧版","categories":{"myList":"收藏夹","notebook":"笔记本","submissions":"我的题解","session":"进度管理","points":"积分","progress":"做题分析"},"unmockUser":"Unmock User","account":"个人设置"},"streakCounter":{"finished":"干的好！明天再来挑战！","unfinished":"解决今天的「每日 1 题」，刷新你的连胜记录！","buyTimeTravelTicket":"购买补签卡","missedOneDayThisMonth":"这个月你错过了 1 天.","missedDaysThisMonth":"这个月你错过了 {{count}} 天."},"playground":{"playground":"Playground","remainingPlaygrounds":"数量","renew":"升级","myPlaygrounds":"我的 Playgrounds","templates":{"consoleApplication":"控制台程序","empty":"空白 Playground","frontend":"前端程序","machineLearning":"机器学习"}},"links":{"admin":{"scores":"/library/scores","translation":"/contribution/translation/question/admin/","operations":"/management"},"premium":"/premium","discuss":"/circle","interview":"/company","shop":"https://detail.youzan.com/show/goods/newest?alias=271n43vr9hen7","onlineInterview":"https://leetcode.cn/interview","profileArticles":"/profile/articles","orders":"/order","explore":"/leetbook","resume":"/profile/resume/","playground":"/playground","assessment":"/assessment/","account":"/profile/account"},"pagination":{"perpage":" 条/页"},"expand":"展开","collapse":"收起","difficulty":{"easy":"简单","medium":"中等","hard":"困难"},"data":{"question":{"difficulty":{"easy":"简单","medium":"中等","hard":"困难"}}},"markdown":{"heading":"heading","quote":"Quote"},"mentions":{"users":"用户","problems":"题目"},"confirmModal":{"title":"确定执行此操作?","confirmBtn":"确定","cancelBtn":"取消"},"saving":"保存中...","saved":"保存成功","autoSaved":"已自动保存","loginRequired":"您尚未登录","verifiedRequired":"请绑定手机号或者邮箱后继续操作","phoneVerifiedRequired":"请绑定手机号后继续操作","maybeVerifiedRequired":"请绑定手机号后继续操作","copied":"已复制","dailyCheckIn":"+1 Daily Check-in (Please translate)","//maybeVerifiedRequired":"maybeVerifiedRequired means email in LCUS and phone in LCCN","easterEgg":{"rewardMessage":"恭喜您获得了 10 积分，Happy LeetCoding!"},"survey":{"veryDissatisfied":"Very Dissatisfied","verySatisfied":"Very Satisfied","next":"Next","continue":"Continue","submit":"Submit","questionNo":"Question {{current}} of {{total}}","thanksMsg":"🎉 Thanks for your feedback!"}},"problems":{"meta":{"title":"{{title}} - 力扣（Leetcode）","description":"{{title}} - {{content}}","ogImage":"https://static.leetcode-cn.com/cn-legacy-assets/images/LeetCode_Sharing.png","defaultDescription":"备战技术面试？力扣提供海量技术面试资源，帮助你高效提升编程技能,轻松拿下世界 IT 名企 Dream Offer。"},"tabs":{"description":"题目描述","discussion":"讨论","solutions":"题解","submissions":"提交记录"},"feedback":{"feedback":"反馈","revertToOld":"回退到上一个版本"},"lockedQuestion":{"subscribe":"升级 Plus 会员","subscribeToUnlockMessage":"感谢使用力扣！您需要升级为 Plus 会员来解锁该题目","subscribeToUnlock":"该题目是 Plus 会员专享题"},"satisfactionSurvey":{"submitBtnText":"Get LeetCoins"}},"console":{"meta":{"title":"题目详情"},"console":{"console":"控制台","run":"运行","submit":"提交","resetTestcases":"重置测试用例","debug":"调试","testcase":"测试用例","debugger":"调试器","testcaseNumber":"Case {{ number }}","cloneCurrentTestcase":"克隆当前用例","switchConsoleToLeft":"控制台置于左侧","switchConsoleToRight":"控制台置于右侧","testcasePlaceholder":"请输入测试用例","result":{"result":"执行结果","stdout":"标准输出","noResult":"请先执行代码","slowdown":{"premium":"你的提交过于频繁，请稍候重试","first":"你的提交过于频繁，请稍候重试，或","second":"升级 Plus 会员","third":"，可减少等待时间"},"networkError":"网络错误，请稍后刷新页面重试","serverError":"未知的服务器错误，请联系我们的团队进行技术支持。","compileError":"编译出错","runtimeError":"执行出错","copyCompileError":"复制错误信息","copied":"已复制","outputLimitExceeded":"超出输出限制","timeLimitExceeded":"超出时间限制","memoryLimitExceeded":"超出内存限制","timeout":"请求超时","internalError":"内部错误","accepted":"通过","wrongAnswer":"解答错误","invalidTestcase":"测试用例非有效值","runtime":"执行用时","input":"输入","output":"输出","expected":"预期结果","contribution":"贡献测试用例","pending":"运行中...","premiumPending":"极速判题中...","judging":"判题中...","debugging":"调试中...","speedUp":"开启极速判题","lastExecutedInput":"最后执行的输入","testcasesPassed":"个通过的测试用例","useTestcaseAsInput":"添加到测试用例","cantUseTestcaseAsInput":"测试用例数达到最大限制","debugger":"调试器","copyContent":"已复制到剪切板","moreLine_one":"更多","moreLine_other":"更多"},"info":{"info":"注意","content":"\u003c0\u003e执行代码与提交代码的结果不同？如果您在C/C++的代码中使用了全局变量，请看\u003c/0\u003e \u003c1\u003e这里\u003c/1\u003e","ok":"确定","howToCreateBinaryTreeTestcases":"如何创建二叉树测试用例？","howToCreateDatabaseTestcases":"如何创建数据库测试用例？"},"execute":"Execute","to":"to","fullTreeTooBig":"数据太大，无法展示","or":"or","showFullTree":"点击查看完整的二叉树"},"visualizer":{"dataTooLarge":"数据量过大，只展示部分","parseFailed":"生成错误，请检查格式是否正确","dataNotSupported":"不支持可视化","outputDataTypeNotSupported":"输出类型不支持可视化","initFailed":"画布初始化失败，请刷新页面重试"},"verifyEmail":"请绑定邮箱后继续操作","signToRunOrSubmit":"{{action}}需要登录","signToRunAndSubmit":"运行和提交代码需要\u003c0\u003e登录\u003c/0\u003e","verifyToRunAndSubmit":"您的手机号尚未绑定，\u003c0\u003e前往验证\u003c/0\u003e！ ","notAvailableDuringDebugging":"调试状态不可用","notAvailableDuringExecuting":"代码执行中不可用","nonVerifyMsg":"请绑定手机号后继续操作","oneClickDebug":"一键调试"},"code-editor":{"commonConfirmTitle":"操作确认","fullScreen":"全屏","exitFullScreen":"退出全屏","lsp":{"autocomplete":"智能模式","connectFail":"连接失败","langNotSupportLSP":"该语言暂不支持智能补全 / 语法检查","info":"智能补全/语法检查"},"langNotSupportLSP":"该语言暂不支持智能补全 / 语法检查","langInfo":"了解语言环境","settings":{"name":"代码编辑器设置","fontSize":"字体设置","fontSizeDesc":"调整适合你的字体大小。","theme":"主题设置","themeDesc":"切换不同的代码编辑器主题，选择适合你的语法高亮。","themeDark":"Dark","themeLight":"Light","themeSystem":"System","keyBinding":"键位绑定","keyBindingDesc":"想要练习使用 Vim 或者 Emacs？你可以在这里切换这些预设的键位绑定。","keyBindingVim":"Vim","keyBindingEmacs":"Emacs","keyBindingStandard":"Standard","tabSize":"Tab 长度","tabSizeDesc":"选择你想要的 Tab 长度，默认设置为4个空格。","spaces":"{{count}}"},"shortcuts":{"name":"编辑器快捷键","run":"执行代码","submit":"提交解答","debug":"调试","indent":"行缩进","indentFew":"行减少缩进","moveLines":"上下移动行","cut":"剪切","toggleComment":"切换行注释","undo":"撤销","redo":"重做"},"reset":{"tip":"还原到默认的代码模版","confirmContent":"您将放弃所有更改并初始化代码！","resetServer":"您的代码已在 {{time}} 保存在云端,","restore":"恢复"},"history":{"title":"添加了备注的 {{lang}} 提交记录","tip":"获取备注过的提交记录","description":"仅展示当前语言下提交的代码；选中并确认后，当前代码编辑区的全部内容将会被替换。","status":"结果","runtime":"执行用时","memory":"消耗内存","time":"时间","topic":"标签","notes":"备注","noNotes":"暂无提交记录！"},"timer":{"start":"开始计时","hide":"隐藏","show":"展示","reset":"重置"},"debugger":{"loginToDebug":"启用调试功能需要登录","name":"调试器","stdout":"标准输出","input":"输入","enterTip":"点击行号添加断点","exit":"退出调试","start":"开始调试","stop":"停止调试","startShort":"调试","stopShort":"停止","watch":"监听表达式","local":"本地变量","watchHolder":"请输入需要监听的变量，按回车确认","controlStart":"开始调试 F5","controlForward":"继续 F5","controlStepOver":"单步跳过 F10","controlStepOut":"单步跳出 Ctrl+F11","controlStepOutMac":"单步跳出 ⌘+F11","controlStepIn":"单步调试 Shift+F11","controlStepInMac":"单步调试 ⇧+F11","controlReset":"重置 Ctrl+Shift+F5","controlResetMac":"重置 ⌘+⇧+F5","exited":"已经有一个调试会话在运行，是否将其终止？","startToWatch":"开启调试后查看表达式","watchTip":"开启调试才可添加表达式","startViewVars":"开启调试查看本地变量","noVars":"暂无变量","startViewOutput":"开启调试查看输出","noOutput":"暂无输出...","edited":"代码已变更，需要重启调试","cantAddTestcase":"您已達到最大測試用例數"},"markDownPlaceholder":"请输入...(支持使用 Markdown)"},"description":{"status":{"tried":"尝试过","ac":"已解答"},"somethingWentWrong":"网络错误","thanksForVoting":"感谢反馈！","companies":"相关企业","pastSixMonths":"0 - 6 个月","pastYear":"6 个月 - 1 年","pastTwoYears":"1 年 - 2 年","companyPremiumAccess":"升级力扣 Plus 会员后，可查看面试中出现该题目的企业","companySubscribe":"订阅","hint":"提示","showHints":"显示提示","moreActions":"更多操作","feedback":"反馈","showEnglish":"切换为英文","showChinese":"切换为中文","feedbackForm":{"title":"反馈","alternative":"您也可以通过 \u003c0\u003eGitHub 快速反馈通道\u003c/0\u003e 进行提交","cancel":"取消","submit":"提交","issuesEncountered":"遇到问题","problem":"题目","somethingWentWrong":"网络错误","additionalFeedback":"额外的反馈","description":"我们将致力于提高题目质量，你不喜欢的理由是什么？","options":{"unclearDescription":"描述和示例不清楚或不正确","unclearDifficulty":"难度不准确","unclearTestCases":"测试用例缺失或不正确","runtimeStrict":"时间要求太严格","edgeCases":"边界情况太多","other":"其他","otherPlaceholder":"额外的反馈"},"optionRequiredError":"至少选择一个选项."},"accepted":"通过次数","submissions":"提交次数","acRate":"通过率","copyright":"© {{year}} 领扣网络（上海）有限公司","yes":"是","no":"否","add2":"添加","seenBefore":"请问您在哪类招聘中遇到此题？","whichCompany":"请问您应聘的哪家公司？","whichPosition":"请问您应聘的岗位类型？","whichTimePeriod":"您是在什么时候遇到该题的？","whichStage":"请问您进行了哪种形式的面试？","thanksForFeedback":"🎉 谢谢您的反馈！","relatedTopics":"相关标签","add":"加入","remove":"移除","createNewList":"创建新列表","nameListPlaceholder":"请输入列表标题","cancel":"取消","save":"保存","setAsPrivate":"设为私有","addToList":"加入收藏夹","sqlSchema":"SQL Schema","confirm":"确定","favoriteSignInError":"登录后才能收藏题目","changeLanguageError":"登录后才能切换语言","feedbackSignInError":"登录后才能反馈问题","likeSignInError":"登录后才能点赞","mysqlCopySuccess":"已复制到剪贴板","shareQuestionDescription":"分享题目","viewMyLists":"查看我的收藏夹","searchPlaceholder":"搜索","ok":"OK","addToListError":"Something went wrong. Please try again.","similarQuestions":"相似题目"},"submissions":{"runtime":"时间","memory":"内存","beat":"击败","noData":"暂无数据","copied":"已复制","success":{"accept":"通过","timeTaken":"用时: {{time}}","nextQuestion":"下一题","moreChallenges":"更多挑战","second_short":"s","minute_short":"m","hour_one":"hr","hour_other":"hrs"},"details":{"myCode":"我提交的代码","otherCode":"他提交的代码","sampleCode":"{{metric}} 的代码示例","backToMyCode":"返回我的位置","chartHintForAction":"点击查看代码","fetchingCodeFromServer":"加载中..."},"buttons":{"close":"关闭","details":"详情","solution":"写题解"},"filters":{"allStatuses":"所有状态","allLanguages":"所有语言"},"notes":{"label":"备注","placeholder":"在此输入备注"},"relatedTags":{"label":"相关标签","placeholder":"选择标签","startTyping":"搜索标签","noResults":"暂无标签"},"chart":{"runtimeDescription":"执行用时 (%)","memoryDescription":"消耗内存 (%)","youAreHere":"你在这里","hintForAction":"点击图片查看分布详情","runtime":"执行用时分布","memory":"消耗内存分布","percentLabel":"{{percent}}% 的用户使用了类似解法","runtimeValueLabel":"Runtime: {{value}} ms","memoryValueLabel":"Memory: {{value}} MB","noData":"加载中，暂无数据","memoryShortDescription":"Distribution (%)","runtimeShortDescription":"Distribution (%)"},"nonSignedIn":{"signInTitle":"🔥 登录力扣开始写代码","signInInfo":"这里会展示你的提交记录 ","signInButton":"登录/注册"},"noCode":"There is no code here","pending":"Pending...","includesNotes":"含有备注","failedSubmission":{"runtimeError":"执行出错信息","compileError":"编译出错信息","lastTestcase":"最后执行的输入"}},"feature-guide":{"layout":"支持上下、左右拖拽调整布局","timer":"\u003c0\u003e计时器：\u003c/0\u003e 现在可以在做题过程中使用计时器了！","debugger":"\u003c0\u003e调试器：\u003c/0\u003e 我们将 Debugger 移动到了这里","problemSwitch":"这里可以快速切换到 \u003c0\u003e上一题/下一题\u003c/0\u003e ","problemList":"这里可以快速返回\u003c0\u003e题目列表\u003c/0\u003e","discussion":"新的 \u003c0\u003e“讨论”，\u003c/0\u003e 您可以发布任何想法","solution":"将 \u003c0\u003e“评论”\u003c/0\u003e 的名字修改为新的 \u003c0\u003e“题解” 名\u003c/0\u003e","back":"返回","skip":"跳过","next":"下一步","ok":"确定","title":"🎉 我们的新界面"},"solutions":{"filter":{"searchPlaceholder":"搜索","tags":{"placeholder":"标签","searchPlaceholder":"搜索标签","languages":"语言","topicTags":"主题","expand":"展开","collapse":"收起","noResults":"暂无结果","reset":"重置"},"sortBy":{"placeholder":"排序","hot":"热度最高","most_posts":"发布数量","most_relevant":"默认排序","most_votes":"点赞最多","newest_to_oldest":"最新发布","oldest_to_newest":"最早发布","recent_activity":"默认排序","recent_activity_short":"默认排序","hot_short":"热度最高","newest_to_oldest_short":"最新发布","oldest_to_newest_short":"最早发布","most_votes_short":"点赞最多","most_relevant_short":"默认排序"}},"comments":{"edited":"(编辑过)","tooShort":"评论过短","noComments":"暂无评论","reply":"回复","mentionInputPlaceholder":"用户或题目","user":"用户","problem":"题目","mdRules":{"inlineCode":"行内代码...","codeBlock":"code block","link":"leetcode","href":"https://leetcode.cn"},"pinnedBy":"被 {{pinnedBy}} 置顶","share":"分享","edit":"编辑","shareCopySuccess":"已复制到剪切板","hideReplies":"隐藏回复","showReplies":"展示 {{num}} 条回复","cancel":"取消","confirm":"确定","preview":"预览","comment":"评论","typeCommentHere":"请输入评论...","comments":"评论","sortBy":"排序","newestToOldest":"最新","oldestToNewest":"最早","mostVotes":"赞成数","best":"最热","editor":"编辑","youMust":"您需要先","verifyYourEmail":"绑定邮箱","first":"first","readMore":"展开全部","somethingWentWrong":"未知错误","areYouSure":"操作确认","confirmDeleteComment":"确定删除该条评论？","confirmRestoreComment":"确定恢复该条评论？","confirmHideComment":"确定将该条评论灰色屏蔽？","confirmShowComment":"确定将该条评论取消灰色屏蔽？","confirmPinComment":"确定置顶该评论？","confirmUnpinComment":"确定移除置顶？","reward":"赞赏","delete":"删除","hide":"隐藏","show":"展示","askQuestion":"问问题","feedback":"反馈","tips":"提示","chooseAType":"请选择一个类型","showMoreReplies":"展示更多","hideSuccess":"灰色屏蔽成功.","showSuccess":"取消灰色屏蔽成功.","pinSuccess":"Comment has been pinned.","unpinSuccess":"Comment has been unpinned.","deleteSuccess":"删除成功","restore":"Restore","restoreSuccess":"成功恢复评论","hidden":"Hidden","report":"举报","pin":"设为精选","pinned":"精选","unpin":"取消精选","hideComment":"灰色屏蔽","showComment":"取消灰色屏蔽","move":"Move to Solution","moveTitle":"Title:","moveTitlePlaceholder":"Enter title here","moveSuccess":"Comment Successfully Moved","postSuccess":"发布成功","genericError":"Something went wrong"},"solution":"题解","writeSolution":"写题解","continueSolution":"继续写题解","tags":{"official":"官方","pinned":"精选","favorite":"收藏","mySolution":"我的题解"},"post":{"prevLabel":"上一篇题解","nextLabel":"下一篇题接","isAdmin":"管理员","reputationTooltip":"声望","share":"分享","addToCollection":"收藏","isInCollection":"已收藏","votes":"({{votesCount}} votes)","shareCopySuccess":"分享链接复制到剪切板","addToFavoriteSuccess":"添加成功","removeFromFavoriteSuccess":"移除成功","feedbackTooltip":"反馈","backToTop":"回到顶部","genericError":"未知错误","more":{"error":"网络错误","cancel":"取消","edit":"编辑","subscribe":"Subscribe","subscribeMessage":"Subscribed","unsubscribe":"Unsubscribe","unsubscribeMessage":"Unsubscribed","delete":"删除","deleteMessage":"删除成功","deleteConfirmText":"确定删除?","deleteConfirmBtn":"删除","restore":"Restore","restoreMessage":"Restored","restoreConfirmText":"Are you sure you want to restore this post?","restoreConfirmBtn":"Restore","report":"举报","reportMessage":"举报成功","pin":"Pin","pinMessage":"Pinned","pinConfirmText":"Are you sure you want to pin this post?","pinConfirmBtn":"Pin","unpin":"Unpin","unpinMessage":"Unpinned","unpinConfirmText":"Are you sure you want to unpin this post?","unpinConfirmBtn":"Unpin","hide":"Hide","hideMessage":"Hid the post","hideConfirmText":"Are you sure you want to hide this post?","hideConfirmBtn":"Hide","hideFromTrending":"Hide from trending","hideFromTrendingMessage":"Hid post from trending","hideFromTrendingConfirmText":"Are you sure you want to hide this post from trending?","hideFromTrendingConfirmBtn":"Hide from trending","show":"Show","showMessage":"Showed the post","showConfirmText":"Are you sure you want to show this post to everyone?","showConfirmBtn":"Show","moveToDiscussion":"Move to Discussion","moveToDiscussionMessage":"Moved to Discussion","moveToDiscussionConfirmText":"Are you sure you want to move this post to Discussion?","moveToDiscussionConfirmBtn":"Move to Discussion"},"rateSuccess":"Thanks for rating this solution!"},"sidebar":{"comments":"评论人数","favorite":"收藏次数","views":"浏览次数","relatedTags":"标签","relatedSolutions":"相关题解"},"searchResult":{"commentPrefix":" comment","replyPrefix":" reply to ","colon":": "},"noDirectResultsHint":"No result. Show you some related content","noResults":"暂无相关题解内容","report":{"reportModalTitle":"举报","contentPlaceholder":"其他","cancel":"取消","confirm":"确认","advertising":"骚扰广告","sexual":"黄色内容","violent":"暴力内容","terrorism":"恐怖言论","illegal":"违法内容","politics":"政治言论","abuse":"辱骂他人","fake":"造谣传谣","nonEnglish":"Non English content","other":"其他","reportSuccess":"提交成功","reportError":"提交遇到问题，请稍后再试！"},"blocker":{"subscribeToUnlock":"Subscribe to unlock.","subscribeSubTitle":"Thanks for using LeetCode! To view this solution you must subscribe to premium.","subscribe":"Subscribe"},"videoSolutionTooltip":"Video Solution","premiumOnlyTooltip":"Premium Solution"},"post-solution":{"meta":{"newTitle":"{{title}} - LeetCode - New Solution","editTitle":"{{title}} - LeetCode - Edit Solution"},"filterTopic":"搜索标签","publishSolution":"写题解","publishSolutionTooltip":"您需要先通过这道题目才能发布题解","restore":"是否清空草稿？","discard":"清空","discardConfirmTitle":"您确定要清空草稿吗？","discardConfirmContent":"如果清空草稿，会删除当前编辑器中的所有内容","discardConfirmOk":"确定","discardConfirmCancel":"取消","guide":"力扣「Markdown 编辑器」使用说明","check":"查看","blockCode":"「代码块」","tag":"标签","related":"与题相关","selectATag":"请为该题解选择至少1个标签","post":"发布题解","publishError":"发布失败","imgUploadSuccuss":"上传成功","imgUploadError":"上传失败，请重试","guideTooltip":"Markdown 指引","saved":"已保存为草稿"}}},"initialLocale":"en","userConfig":{"i18n":{"defaultLocale":"zh","locales":["en","zh"]},"react":{"useSuspense":false},"reloadOnPrerender":false,"default":{"i18n":{"defaultLocale":"zh","locales":["en","zh"]},"react":{"useSuspense":false},"reloadOnPrerender":false}}},"revalidate":60},"__N_SSG":true},"page":"/problems/[slug]/[[...tab]]","query":{"slug":"fizz-buzz"},"buildId":"s885dJVWNMGpwH_1lu46H","isFallback":false,"gsp":true,"scriptLoader":[]}</script><div id="modal-root"></div><next-route-announcer><p aria-live="assertive" id="__next-route-announcer__" role="alert" style="border: 0px none; clip: rect(0px, 0px, 0px, 0px); height: 1px; margin: -1px; overflow: hidden; padding: 0px; position: absolute; width: 1px; white-space: nowrap; overflow-wrap: normal;"></p></next-route-announcer><div id="headlessui-portal-root"><div data-headlessui-portal=""></div><div data-headlessui-portal=""></div><div data-headlessui-portal=""></div></div><script src="Fizz%20Buzz%20-%20LeetCode_files/monaco-cb2048234dffebc3198e_0.33.10.js" crossorigin="anonymous"></script><div class="monaco-aria-container"><div class="monaco-alert" role="alert" aria-atomic="true"></div><div class="monaco-alert" role="alert" aria-atomic="true"></div><div class="monaco-status" role="complementary" aria-live="polite" aria-atomic="true"></div><div class="monaco-status" role="complementary" aria-live="polite" aria-atomic="true"></div></div></body></html>
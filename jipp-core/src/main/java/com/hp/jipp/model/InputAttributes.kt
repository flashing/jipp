// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "input-attributes" collection as defined in:
 * [PWG5100.15](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class InputAttributes
constructor(
    var inputAutoScaling: Boolean? = null,
    var inputAutoSkewCorrection: Boolean? = null,
    var inputBrightness: Int? = null,
    /** May contain any keyword from [InputColorMode]. */
    var inputColorMode: String? = null,
    /** May contain any keyword from [InputContentType]. */
    var inputContentType: String? = null,
    var inputContrast: Int? = null,
    /** May contain any keyword from [InputFilmScanMode]. */
    var inputFilmScanMode: String? = null,
    var inputImagesToTransfer: Int? = null,
    /** May contain any size name keyword from [Media] or a name. */
    var inputMedia: KeywordOrName? = null,
    var inputOrientationRequested: Orientation? = null,
    var inputQuality: PrintQuality? = null,
    var inputResolution: Resolution? = null,
    var inputScalingHeight: Int? = null,
    var inputScalingWidth: Int? = null,
    var inputScanRegions: List<InputScanRegions>? = null,
    var inputSharpness: Int? = null,
    /** May contain any keyword from [Sides]. */
    var inputSides: String? = null,
    /** May contain any keyword from [InputSource]. */
    var inputSource: String? = null
) : AttributeCollection {

    /** Construct an empty [InputAttributes]. */
    constructor() : this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            inputAutoScaling?.let { Types.inputAutoScaling.of(it) },
            inputAutoSkewCorrection?.let { Types.inputAutoSkewCorrection.of(it) },
            inputBrightness?.let { Types.inputBrightness.of(it) },
            inputColorMode?.let { Types.inputColorMode.of(it) },
            inputContentType?.let { Types.inputContentType.of(it) },
            inputContrast?.let { Types.inputContrast.of(it) },
            inputFilmScanMode?.let { Types.inputFilmScanMode.of(it) },
            inputImagesToTransfer?.let { Types.inputImagesToTransfer.of(it) },
            inputMedia?.let { Types.inputMedia.of(it) },
            inputOrientationRequested?.let { Types.inputOrientationRequested.of(it) },
            inputQuality?.let { Types.inputQuality.of(it) },
            inputResolution?.let { Types.inputResolution.of(it) },
            inputScalingHeight?.let { Types.inputScalingHeight.of(it) },
            inputScalingWidth?.let { Types.inputScalingWidth.of(it) },
            inputScanRegions?.let { Types.inputScanRegions.of(it) },
            inputSharpness?.let { Types.inputSharpness.of(it) },
            inputSides?.let { Types.inputSides.of(it) },
            inputSource?.let { Types.inputSource.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val inputAutoScaling = BooleanType("input-auto-scaling")
        @JvmField val inputAutoSkewCorrection = BooleanType("input-auto-skew-correction")
        @JvmField val inputBrightness = IntType("input-brightness")
        @JvmField val inputColorMode = KeywordType("input-color-mode")
        @JvmField val inputContentType = KeywordType("input-content-type")
        @JvmField val inputContrast = IntType("input-contrast")
        @JvmField val inputFilmScanMode = KeywordType("input-film-scan-mode")
        @JvmField val inputImagesToTransfer = IntType("input-images-to-transfer")
        @JvmField val inputMedia = KeywordOrNameType("input-media")
        /**
         * "input-orientation-requested" member type.
         */
        @JvmField val inputOrientationRequested = Orientation.Type("input-orientation-requested")
        /**
         * "input-quality" member type.
         */
        @JvmField val inputQuality = PrintQuality.Type("input-quality")
        @JvmField val inputResolution = ResolutionType("input-resolution")
        @JvmField val inputScalingHeight = IntType("input-scaling-height")
        @JvmField val inputScalingWidth = IntType("input-scaling-width")
        @JvmField val inputScanRegions = AttributeCollection.SetType("input-scan-regions", InputScanRegions)
        @JvmField val inputSharpness = IntType("input-sharpness")
        @JvmField val inputSides = KeywordType("input-sides")
        @JvmField val inputSource = KeywordType("input-source")
    }

    /** Defines types for each member of [InputAttributes] */
    companion object : AttributeCollection.Converter<InputAttributes> {
        override fun convert(attributes: List<Attribute<*>>): InputAttributes =
            InputAttributes(
                extractOne(attributes, Types.inputAutoScaling),
                extractOne(attributes, Types.inputAutoSkewCorrection),
                extractOne(attributes, Types.inputBrightness),
                extractOne(attributes, Types.inputColorMode),
                extractOne(attributes, Types.inputContentType),
                extractOne(attributes, Types.inputContrast),
                extractOne(attributes, Types.inputFilmScanMode),
                extractOne(attributes, Types.inputImagesToTransfer),
                extractOne(attributes, Types.inputMedia),
                extractOne(attributes, Types.inputOrientationRequested),
                extractOne(attributes, Types.inputQuality),
                extractOne(attributes, Types.inputResolution),
                extractOne(attributes, Types.inputScalingHeight),
                extractOne(attributes, Types.inputScalingWidth),
                extractAll(attributes, Types.inputScanRegions),
                extractOne(attributes, Types.inputSharpness),
                extractOne(attributes, Types.inputSides),
                extractOne(attributes, Types.inputSource)
            )
    }

    /**
     * Data object corresponding to a "input-scan-regions" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class InputScanRegions
    constructor(
        var xDimension: Int? = null,
        var xOrigin: Int? = null,
        var yDimension: Int? = null,
        var yOrigin: Int? = null
    ) : AttributeCollection {

        /** Construct an empty [InputScanRegions]. */
        constructor() : this(null, null, null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                xDimension?.let { Types.xDimension.of(it) },
                xOrigin?.let { Types.xOrigin.of(it) },
                yDimension?.let { Types.yDimension.of(it) },
                yOrigin?.let { Types.yOrigin.of(it) }
            )
        }

        /** Types for each member attribute. */
        object Types {
            @JvmField val xDimension = IntType("x-dimension")
            @JvmField val xOrigin = IntType("x-origin")
            @JvmField val yDimension = IntType("y-dimension")
            @JvmField val yOrigin = IntType("y-origin")
        }

        /** Defines types for each member of [InputScanRegions] */
        companion object : AttributeCollection.Converter<InputScanRegions> {
            override fun convert(attributes: List<Attribute<*>>): InputScanRegions =
                InputScanRegions(
                    extractOne(attributes, Types.xDimension),
                    extractOne(attributes, Types.xOrigin),
                    extractOne(attributes, Types.yDimension),
                    extractOne(attributes, Types.yOrigin)
                )
        }
        override fun toString() = "InputScanRegions(${attributes.joinToString()})"
    }
    override fun toString() = "InputAttributes(${attributes.joinToString()})"
}

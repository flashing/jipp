// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "output-attributes" collection as defined in:
 * [PWG5100.17](https://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class OutputAttributes
constructor(
    var noiseRemoval: Int? = null,
    var outputCompressionQualityFactor: Int? = null
) : AttributeCollection {

    /** Construct an empty [OutputAttributes]. */
    constructor() : this(null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            noiseRemoval?.let { Types.noiseRemoval.of(it) },
            outputCompressionQualityFactor?.let { Types.outputCompressionQualityFactor.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val noiseRemoval = IntType("noise-removal")
        @JvmField val outputCompressionQualityFactor = IntType("output-compression-quality-factor")
    }

    /** Defines types for each member of [OutputAttributes] */
    companion object : AttributeCollection.Converter<OutputAttributes> {
        override fun convert(attributes: List<Attribute<*>>): OutputAttributes =
            OutputAttributes(
                extractOne(attributes, Types.noiseRemoval),
                extractOne(attributes, Types.outputCompressionQualityFactor)
            )
    }
    override fun toString() = "OutputAttributes(${attributes.joinToString()})"
}

// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "pdl-init-file" collection as defined in:
 * [PWG5100.11](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PdlInitFile
constructor(
    var pdlInitFileEntry: String? = null,
    var pdlInitFileLocation: java.net.URI? = null,
    var pdlInitFileName: String? = null
) : AttributeCollection {

    /** Construct an empty [PdlInitFile]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            pdlInitFileEntry?.let { Types.pdlInitFileEntry.of(it) },
            pdlInitFileLocation?.let { Types.pdlInitFileLocation.of(it) },
            pdlInitFileName?.let { Types.pdlInitFileName.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val pdlInitFileEntry = NameType("pdl-init-file-entry")
        @JvmField val pdlInitFileLocation = UriType("pdl-init-file-location")
        @JvmField val pdlInitFileName = NameType("pdl-init-file-name")
    }

    /** Defines types for each member of [PdlInitFile] */
    companion object : AttributeCollection.Converter<PdlInitFile> {
        override fun convert(attributes: List<Attribute<*>>): PdlInitFile =
            PdlInitFile(
                extractOne(attributes, Types.pdlInitFileEntry)?.value,
                extractOne(attributes, Types.pdlInitFileLocation),
                extractOne(attributes, Types.pdlInitFileName)?.value
            )
    }
    override fun toString() = "PdlInitFile(${attributes.joinToString()})"
}

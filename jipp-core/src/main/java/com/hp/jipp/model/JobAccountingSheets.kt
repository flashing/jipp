// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-accounting-sheets" collection as defined in:
 * [PWG5100.3](https://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf),
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobAccountingSheets
constructor(
    /** May contain any keyword from [OutputBin] or a name. */
    var jobAccountingOutputBin: KeywordOrName? = null,
    /** May contain any keyword from [JobAccountingSheetsType] or a name. */
    var jobAccountingSheetsType: KeywordOrName? = null,
    /** May contain any keyword from [Media] or a name. */
    var media: KeywordOrName? = null,
    var mediaCol: MediaCol? = null
) : AttributeCollection {

    /** Construct an empty [JobAccountingSheets]. */
    constructor() : this(null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            jobAccountingOutputBin?.let { Types.jobAccountingOutputBin.of(it) },
            jobAccountingSheetsType?.let { Types.jobAccountingSheetsType.of(it) },
            media?.let { Types.media.of(it) },
            mediaCol?.let { Types.mediaCol.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val jobAccountingOutputBin = KeywordOrNameType("job-accounting-output-bin")
        @JvmField val jobAccountingSheetsType = KeywordOrNameType("job-accounting-sheets-type")
        @JvmField val media = KeywordOrNameType("media")
        @JvmField val mediaCol = AttributeCollection.Type("media-col", MediaCol)
    }

    /** Defines types for each member of [JobAccountingSheets] */
    companion object : AttributeCollection.Converter<JobAccountingSheets> {
        override fun convert(attributes: List<Attribute<*>>): JobAccountingSheets =
            JobAccountingSheets(
                extractOne(attributes, Types.jobAccountingOutputBin),
                extractOne(attributes, Types.jobAccountingSheetsType),
                extractOne(attributes, Types.media),
                extractOne(attributes, Types.mediaCol)
            )
    }
    override fun toString() = "JobAccountingSheets(${attributes.joinToString()})"
}

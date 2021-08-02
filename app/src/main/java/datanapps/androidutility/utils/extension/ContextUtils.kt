package datanapps.androidutility.utils.extension


/*
 * create by yogendrapratapsingh
 * on 2/8/21
 */

const val SPACE = " "
const val EMPTY = ""
const  val LF = "\n"
const  val CR = "\r"
const  val CRLF = "\\r\\n"
const  val NA = "NA"

fun String?.isEmpty(): Boolean = this.isNullOrEmpty()

fun String?.isNotEmpty(): Boolean  = !this.isNullOrEmpty()

fun String?.isNull(): Boolean = this.isNullOrEmpty()

fun String?.length(): Int  = if (this.isNullOrEmpty()) 0 else this.length


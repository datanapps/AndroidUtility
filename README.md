# AndroidUtility


This library contain:

1. Logcat
2. Snackbar
3. Toast
4. CollectionUtils

# How to integrate:

1. download and extract folder 
2. Copy utils folder in your folder app->src->main->java->yourpackagename-> <utils>
3. Now ready to use basics of android

=============================================================================
# How to use in your application:
=============================================================================
# Logcat

For debug :
DNALog.d("this is debug message");

For error :
DNALog.e("this is debug message");

For info :
DNALog.i("this is debug message");

For verbose :
DNALog.v("this is debug message");


Benifits:
1. This log will work only in debug application.
2. It will give you more information then simple log.

=============================================================================

# Snackbar


DNASnackBar.show( this," this is test message");


Benifits:
1. A single class have multiple function.
2. Handling null pointer
2. if given activity is is null or context then no crash and it will show toast.

=============================================================================

# Toast

DNAToast.show(this, " this is test message");

Benifits:
1. A single class have multiple function.
2. Handling null pointer


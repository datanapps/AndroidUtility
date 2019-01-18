# AndroidUtility (Java) (Kotlin)


This library contain:

1. Logcat
2. Snackbar
3. Toast
4. CollectionUtils
5. AppUtils
6. DateUtils
7. StringUtils

# How to integrate:

1. Download and extract folder 
2. Copy utils folder in your folder app->src->main->java->yourpackagename-> <utils>
3. Now ready to use some basics of android applications

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
1. It provide support in JAVA as well as KOTLIN
2. This log will work only in debug application.
3. It will give you more information then simple log.

=============================================================================

# Snackbar


DNASnackBar.show( this," this is test message");


Benifits:
1. It provide support in JAVA as well as KOTLIN
2. A single class have multiple function.
3. Handling null pointer
4. if given activity is is null or context then no crash and it will show toast.

=============================================================================

# Toast

DNAToast.show(this, " this is test message");

Benifits:
1. It provide support in JAVA as well as KOTLIN
2. A single class have multiple function.
3. Handling null pointer

=============================================================================

# CollectionUtils

 List<T> mediaList = new ArrayList();
        if (DNACollectionUtils.isEmpty(mediaList)) {
            // do your stuff 
        }

        if (DNACollectionUtils.isNotEmpty(mediaList)) {
            // do your stuff 
        }
        
   Benifits:
1. It provide support in JAVA as well as KOTLIN
2. It will work for all collections like list, arraylist, hashmap etc
3. Handling null pointer
     
     
=============================================================================

# AppUtils


DNALog.d("App Id"+ DNAAppUtils.getApplicationId());

DNALog.d("App Id"+ DNAAppUtils.getApplicationPackageName());

DNALog.d("Version Code : "+ DNAAppUtils.getAppVersionCode());

DNALog.d("Version Name : "+ DNAAppUtils.getAppVersionName());

DNALog.d("Build Type: "+ DNAAppUtils.getBuildType());

DNALog.d("This is bug build : "+ DNAAppUtils.isBuildType());



 Benifits:
1. It provide support in JAVA as well as KOTLIN
2. It will provide all application information at same place.
3. Easy to integrate and easy to use
        

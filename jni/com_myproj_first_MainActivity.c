#include "com_myproj_first_MainActivity.h"

JNIEXPORT jstring JNICALL Java_com_myproj_first_MainActivity_getMyData(JNIEnv *pEnv, jobject pThis)
{
	return (*pEnv)->NewStringUTF(pEnv, "Fffff fuck it");
}

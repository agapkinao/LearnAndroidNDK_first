LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := mylib
LOCAL_SRC_FILES := com_myproj_first_MainActivity.c

include $(BUILD_SHARED_LIBRARY)
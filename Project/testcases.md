## Test Cases

**List of tests**

|ID|Title|
|:-|:-|
|**Document**||
|D-1| https://github.com/ytdl-org/youtube-dl/tree/master#installation readme.md : Installation |
| **Install TESTS** ||
|I-1|on Windows 11|
|I-2|on Ubuntu-server|
|I-3|on MacOS|
|**Functional TESTS**||
|F-1|Download single video test|
|F-2|Download all in the specific playlist test|
|F-3|Rename downloaded video file test|
|F-4|Download to the Specific folder test|
|F-5|Pause and Resume downloads|
|F-6|Set size limit for videos|
|F-7|Set download speed limit|
|F-8|Download videos by date-wise|
|F-9|Download specific videos from playlist|
|F-10|Download videos by file extension|
|**Non-Functional TESTS**||
|NF-1|Availability -network|
|NF-2|Performance test under wifi|
|NF-3|Accessibility -screen reader|
|NF-4|Usability - get help |
|NF-5|Compatibility - download videos from other than Youtube, other websites: Supported URL test|


## Bugs

**List of bugs found**

|ID|Title|
|:-|:-|
|B-1| ERROR: Missing MSVCR100.dll - only on Windows|
|B-2| ERROR: Unable to extract uploader id; with Official version download youtube video|
|B-3| WARNING: [youtube] Unable to decode n-parameter: (youtube_dl.utils.RegexNotFoundError)|
|B-4| YouTube: Signature extraction failed, KeyError QV.|
|B-5| ERROR: unable to download video data: HTTP Error 403:|


B-3 WARNING: [youtube] Unable to decode n-parameter: download likely to be throttled (Unable to extract Initial JS player n function alias (Usa[0]); please report this issue on https://yt-dl.org/bug . Make sure you are using the latest version; type  youtube-dl -U  to update. Be sure to call youtube-dl with the --verbose flag and include its complete output. Traceback (most recent call last):  
youtube_dl.utils.RegexNotFoundError: Unable to extract Initial JS player n function alias (Usa[0]); please report this issue on https://yt-dl.org/bug 

B-4 ERROR: Signature extraction failed: Traceback (most recent call last):
  File "D:\a\youtube-dl\youtube-dl\youtube_dl\extractor\youtube.py", line 1586, in _decrypt_signature
  File "D:\a\youtube-dl\youtube-dl\youtube_dl\extractor\youtube.py", line 1510, in _extract_signature_function
  File "D:\a\youtube-dl\youtube-dl\youtube_dl\extractor\youtube.py", line 1574, in <lambda>
  File "D:\a\youtube-dl\youtube-dl\youtube_dl\jsinterp.py", line 36, in __call__
  File "D:\a\youtube-dl\youtube-dl\youtube_dl\jsinterp.py", line 1037, in resf
  File "D:\a\youtube-dl\youtube-dl\youtube_dl\jsinterp.py", line 441, in interpret_statement
  File "D:\a\youtube-dl\youtube-dl\youtube_dl\jsinterp.py", line 915, in interpret_statement
  File "D:\a\youtube-dl\youtube-dl\youtube_dl\jsinterp.py", line 907, in eval_method
KeyError: 'QV'
 (caused by KeyError('QV',)); please report this issue on https://yt-dl.org/bug . 

B-5 ERROR: unable to download video data: HTTP Error 403: Forbidden
'list' is not recognized as an internal or external command,
operable program or batch file.


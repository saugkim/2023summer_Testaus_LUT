## Test Cases

**List of tests**

|ID|Title|
|:-|:-|
|**Document**||
|D-1| https://github.com/ytdl-org/youtube-dl/tree/master#installation readme.md : Installation |
|**Install**||
|I-1|on Windows 11|
|I-2|on Ubuntu-server|
|**Functional**||
|F-1|Download single video C:\Users\ugkim\Downloads\Patched>youtube-dl -v https://www.youtube.com/watch?v=euq1xlR_cKI|
|F-2|Download all videos in the playlist|
|F-3|Rename downloaded video file|
|F-4|Download to the specific folder|
|F-5|Pause and Resume downloads|
|F-6|Set size limit for videos|
|F-7|Set download speed limit|
|F-8|Download videos by date-wise|
|F-9|Download specific videos from playlist|
|F-10|Download videos by file extension|
|**Non-Functional**||
|NF-1|Availability -network|
|NF-2|Performance test under wifi|
|NF-3|Accessibility -screen reader|
|NF-4|Usability - get help |
|NF-5|Compatibility - download videos from other than Youtube, other websites: Supported URL test|

```
Downloading single video from youtube
C:\Users\ugkim\Downloads\Patched>youtube-dl -v https://www.youtube.com/watch?v=euq1xlR_cKI

Downloading all videos from playlist
C:\Users\ugkim\Downloads\Patched>youtube-dl -v https://www.youtube.com/playlist?list=PLrJiQiyLS5pYyZs4t1-L8vlMVBQUO50z9

Downloading selected videos from playlist
C:\Users\ugkim\Downloads\Patched>youtube-dl --playlist-items 2,5,9 https://www.youtube.com/playlist?list=PLrJiQiyLS5pYyZs4t1-L8vlMVBQUO50z9

Custom name for downloading file
C:\Users\ugkim\Downloads\Patched>youtube-dl -o hello.mp4 -v https://www.youtube.com/watch?v=euq1xlR_cKI

Available format for downloading video
C:\Users\ugkim\Downloads\Patched>youtube-dl -v -F https://www.youtube.com/watch?v=euq1xlR_cKI
[info] Available formats for euq1xlR_cKI:
format code  extension  resolution note
249          webm       audio only tiny   50k , webm_dash container, opus  (48000Hz), 12.98MiB
250          webm       audio only tiny   56k , webm_dash container, opus  (48000Hz), 14.66MiB
251          webm       audio only tiny  108k , webm_dash container, opus  (48000Hz), 28.16MiB
140          m4a        audio only tiny  129k , m4a_dash container, mp4a.40.2 (44100Hz), 33.56MiB
160          mp4        256x144    144p   16k , mp4_dash container, avc1.4d400c, 30fps, video only, 4.31MiB
278          webm       256x144    144p   19k , webm_dash container, vp9, 30fps, video only, 4.99MiB
242          webm       426x240    240p   29k , webm_dash container, vp9, 30fps, video only, 7.71MiB
133          mp4        426x240    240p   31k , mp4_dash container, avc1.4d4015, 30fps, video only, 8.10MiB
243          webm       640x360    360p   45k , webm_dash container, vp9, 30fps, video only, 11.89MiB
134          mp4        640x360    360p   51k , mp4_dash container, avc1.4d401e, 30fps, video only, 13.32MiB
244          webm       854x480    480p   66k , webm_dash container, vp9, 30fps, video only, 17.18MiB
135          mp4        854x480    480p   71k , mp4_dash container, avc1.4d401f, 30fps, video only, 18.47MiB
247          webm       1280x720   720p  110k , webm_dash container, vp9, 30fps, video only, 28.61MiB
136          mp4        1280x720   720p  112k , mp4_dash container, avc1.64001f, 30fps, video only, 29.18MiB
248          webm       1920x1080  1080p  144k , webm_dash container, vp9, 30fps, video only, 37.46MiB
137          mp4        1920x1080  1080p  185k , mp4_dash container, avc1.640028, 30fps, video only, 48.05MiB
271          webm       2560x1440  1440p  300k , webm_dash container, vp9, 30fps, video only, 77.77MiB
313          webm       3840x2160  2160p  540k , webm_dash container, vp9, 30fps, video only, 140.16MiB
18           mp4        640x360    360p  179k , avc1.42001E, 30fps, mp4a.40.2 (44100Hz)
22           mp4        1280x720   720p  240k , avc1.64001F, 30fps, mp4a.40.2 (44100Hz) (best)

Set file size limit
C:\Users\ugkim\Downloads\OfficialDL>youtube-dl -v --max-filesize 50M https://officeladies.com/episodes/2023/14/06/episode-168-5-a-look-back-on-fun-run-pt-1

Set downloading speed limit 
C:\Users\ugkim\Downloads\OfficialDL>youtube-dl -v -r 50K https://officeladies.com/episodes/2023/14/06/episode-168-5-a-look-back-on-fun-run-pt-1

Set date 
C:\Users\ugkim\Downloads\OfficialDL>youtube-dl -v --datebefore 20180101 https://officeladies.com/episodes/2023/14/06/episode-168-5-a-look-back-on-fun-run-pt-1

```

```
**Ubuntu-server (install patched version)
xxx@kim:~$ sudo wget https://github.com/ytdl-patched/youtube-dl/releases/download/2023.05.31.43044/youtube-dl -O /usr/local/bin/youtube-dl
xxx@kim:~$ sudo chmod a+rx /usr/local/bin/youtube-dl
xxx@kim:~$ sudo ln -s /usr/bin/python3 /usr/bin/python
```


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


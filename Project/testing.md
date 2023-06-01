https://docs.google.com/document/d/1EzVmI-kuSWb4qLVwJ01xKBD63dv55BSm/edit?usp=sharing&ouid=111274102849551070120&rtpof=true&sd=true.

https://manpages.debian.org/testing/youtube-dl/youtube-dl.1.en.html



### OS Windows 

1.Problem when installing process 

**Missing MSVCR100.dll**

<img src="https://github.com/saugkim/2023summer_Testaus_LUT/assets/25344978/fe090d7a-1954-4702-b6df-dbfe3ffc0792" width=350>

solution -> The exe throws an error due to missing MSVCR100.dll

To run the exe you need to install first the Microsoft Visual C++ 2010 Service Pack 1 Redistributable Package (x86) (https://download.microsoft.com/download/1/6/5/165255E7-1014-4D0A-B094-B6A430A6BFFC/vcredist_x86.exe).


2.Problem when downloading youtube video (valid link) using official latest version

```
C:\Users\ugkim\Downloads> youtube-dl -v https://www.youtube.com/watch?v=euq1xlR_cKI
[debug] System config: []
[debug] User config: []
[debug] Custom config: []
[debug] Command-line args: ['-v', 'https://www.youtube.com/watch?v=euq1xlR_cKI']
[debug] Encodings: locale cp1252, fs mbcs, out cp437, pref cp1252
[debug] youtube-dl version 2021.12.17
[debug] Python version 3.4.4 (CPython) - Windows-10-10.0.22621
[debug] exe versions: none
[debug] Proxy map: {}
[youtube] euq1xlR_cKI: Downloading webpage
ERROR: Unable to extract uploader id; please report this issue on https://yt-dl.org/bug . Make sure you are using the latest version; type  youtube-dl -U  to update. Be sure to call youtube-dl with the --verbose flag and include its complete output.
Traceback (most recent call last):
  File "C:\Users\dst\AppData\Roaming\Build archive\youtube-dl\ytdl-org\tmpupik7c6w\build\youtube_dl\YoutubeDL.py", line 815, in wrapper
  File "C:\Users\dst\AppData\Roaming\Build archive\youtube-dl\ytdl-org\tmpupik7c6w\build\youtube_dl\YoutubeDL.py", line 836, in __extract_info
  File "C:\Users\dst\AppData\Roaming\Build archive\youtube-dl\ytdl-org\tmpupik7c6w\build\youtube_dl\extractor\common.py", line 534, in extract
  File "C:\Users\dst\AppData\Roaming\Build archive\youtube-dl\ytdl-org\tmpupik7c6w\build\youtube_dl\extractor\youtube.py", line 1794, in _real_extract
  File "C:\Users\dst\AppData\Roaming\Build archive\youtube-dl\ytdl-org\tmpupik7c6w\build\youtube_dl\extractor\common.py", line 1012, in _search_regex
youtube_dl.utils.RegexNotFoundError: Unable to extract uploader id; please report this issue on https://yt-dl.org/bug . Make sure you are using the latest version; type  youtube-dl -U  to update. Be sure to call youtube-dl with the --verbose flag and include its complete output.
```

solution --> download unofficial version updated by ytdl-patched  

https://github.com/ytdl-patched/youtube-dl/releases

https://github.com/ytdl-patched/youtube-dl/releases/download/2023.05.31.43044/youtube-dl.exe


<br>

3.Download from google drive with official version

```
C:\Users\ugkim\Downloads>youtube-dl -v https://drive.google.com/file/d/1c2BBrnoSPfJHPWzpM_g10hMsrjHkRLCx/view?usp=sharing
[debug] System config: []
[debug] User config: []
[debug] Custom config: []
[debug] Command-line args: ['-v', 'https://drive.google.com/file/d/1c2BBrnoSPfJHPWzpM_g10hMsrjHkRLCx/view?usp=sharing']
[debug] Encodings: locale cp1252, fs mbcs, out cp437, pref cp1252
[debug] youtube-dl version 2021.12.17
[debug] Python version 3.4.4 (CPython) - Windows-10-10.0.22621
[debug] exe versions: none
[debug] Proxy map: {}
[GoogleDrive] 1c2BBrnoSPfJHPWzpM_g10hMsrjHkRLCx: Downloading webpage
[GoogleDrive] 1c2BBrnoSPfJHPWzpM_g10hMsrjHkRLCx: Requesting source file
[debug] Default format spec: best/bestvideo+bestaudio
[debug] Invoking downloader on 'https://doc-08-3k-docs.googleusercontent.com/docs/securesc/ck9v139f62e37h1904926j00bbatuu23/38oo9q09crfmc19cj278q9eeiu3j6kld/1685644275000/10520634967081956801/04520491552648920243Z/1c2BBrnoSPfJHPWzpM_g10hMsrjHkRLCx?e=download&uuid=4602e728-fe44-47be-9a61-cd5cd21d975e&nonce=t0nttejvi4t0e&user=04520491552648920243Z&hash=l8a03u4dbaj306b1ifvbb42i3rr4qqu1'
[download] Destination: 2023-04-13 18-39-04.mp4-1c2BBrnoSPfJHPWzpM_g10hMsrjHkRLCx.mp4
[download] 100% of 1.06MiB in 00:00
```

5.testing from one-drive not working looks

https://unioulu-my.sharepoint.com/:v:/g/personal/ykim20_student_oulu_fi1/Eao8fb3ZKM1Dj2le9LtK7moB_oEMEYWY3CI5ZAr_RwpZ5w?e=laN75z

```
C:\Users\ugkim\Downloads\youtubeDL>youtube-dl -v https://unioulu-my.sharepoint.com/:v:/g/personal/ykim20_student_oulu_fi1/Eao8fb3ZKM1Dj2le9LtK7moB_oEMEYWY3CI5ZAr_RwpZ5w?e=laN75z
[debug] System config: []
[debug] User config: []
[debug] Custom config: []
[debug] Command-line args: ['-v', 'https://unioulu-my.sharepoint.com/:v:/g/personal/ykim20_student_oulu_fi1/Eao8fb3ZKM1Dj2le9LtK7moB_oEMEYWY3CI5ZAr_RwpZ5w?e=laN75z']
[debug] Encodings: locale cp1252, fs mbcs, out cp437, pref cp1252
[debug] youtube-dl version 2021.12.17
[debug] Python version 3.4.4 (CPython) - Windows-10-10.0.22621
[debug] exe versions: none
[debug] Proxy map: {}
[generic] Eao8fb3ZKM1Dj2le9LtK7moB_oEMEYWY3CI5ZAr_RwpZ5w?e=laN75z: Requesting header
[redirect] Following redirect to https://unioulu-my.sharepoint.com/personal/ykim20_student_oulu_fi1/_layouts/15/stream.aspx?id=%2Fpersonal%2Fykim20%5Fstudent%5Foulu%5Ffi1%2FDocuments%2F2023%2D03%2D22%5Fweek9%2Emp4&ga=1
[generic] stream: Requesting header
WARNING: Falling back on generic information extractor.
[generic] stream: Downloading webpage
[generic] stream: Extracting information
ERROR: Unsupported URL: https://unioulu-my.sharepoint.com/personal/ykim20_student_oulu_fi1/_layouts/15/stream.aspx?id=%2Fpersonal%2Fykim20%5Fstudent%5Foulu%5Ffi1%2FDocuments%2F2023%2D03%2D22%5Fweek9%2Emp4&ga=1
Traceback (most recent call last):
  File "C:\Users\dst\AppData\Roaming\Build archive\youtube-dl\ytdl-org\tmpupik7c6w\build\youtube_dl\YoutubeDL.py", line 815, in wrapper
  File "C:\Users\dst\AppData\Roaming\Build archive\youtube-dl\ytdl-org\tmpupik7c6w\build\youtube_dl\YoutubeDL.py", line 836, in __extract_info
  File "C:\Users\dst\AppData\Roaming\Build archive\youtube-dl\ytdl-org\tmpupik7c6w\build\youtube_dl\extractor\common.py", line 534, in extract
  File "C:\Users\dst\AppData\Roaming\Build archive\youtube-dl\ytdl-org\tmpupik7c6w\build\youtube_dl\extractor\generic.py", line 3489, in _real_extract
youtube_dl.utils.UnsupportedError: Unsupported URL: https://unioulu-my.sharepoint.com/personal/ykim20_student_oulu_fi1/_layouts/15/stream.aspx?id=%2Fpersonal%2Fykim20%5Fstudent%5Foulu%5Ffi1%2FDocuments%2F2023%2D03%2D22%5Fweek9%2Emp4&ga=1

```
4.testing download playlist 

```
C:\Users\ugkim\LUT\TEMPforTesting> youtube-dl -v --download-archive archive.txt "https://www.youtube.com/playlist?list=PLnTwHjNdV-XD6C9dRlQKF3idHDXztv6TB"
```

### Ubuntu-server (ISO ubuntu-22.04.2-live-server-amd64 on VirtualBox)

for ubunutu: https://github.com/ytdl-patched/youtube-dl/releases/download/2023.05.31.43044/youtube-dl 


```
ugkim@kim:~$ sudo wget https://github.com/ytdl-patched/youtube-dl/releases/download/2023.05.31.43044/youtube-dl -O /usr/local/bin/youtube-dl
ugkim@kim:~$ sudo chmod a+rx /usr/local/bin/youtube-dl
ugkim@kim:~$ sudo ln -s /usr/bin/python3 /usr/bin/python
ugkim@kim:~$ youtube-dl -v https://www.youtube.com/watch?v=euq1xlR_cKI

[debug] System config: []
[debug] User config: []
[debug] Custom config: []
[debug] Command-line args: ['-v', 'https://www.youtube.com/watch?v=euq1xlR_cKI']
[debug] Encodings: locale UTF-8, fs utf-8, out utf-8, pref UTF-8
[debug] youtube-dl version 2023.05.31.43044 (single file build)
** This build is unofficial daily builds, provided for ease of use.
** Please do not ask for any support.
[debug] Python 3.10.6 (CPython x86_64 64bit) - Linux-5.15.0-71-generic-x86_64-with-glibc2.35 - OpenSSL 3.0.2 15 Mar 2022 - glibc 2.35
[debug] exe versions: none
[debug] Proxy map: {}
[youtube] euq1xlR_cKI: Downloading webpage
[debug] [youtube] Decrypted nsig E2mmR3AgyRyQH2sBVk => QocR0tzNPSteCQ
[debug] [youtube] Decrypted nsig 5BmADnC_Bhe2J_MIpQ => w_pjUExnxyl1uw
[debug] Default format spec: best/bestvideo+bestaudio
[debug] Invoking downloader on 'https://rr4---sn-ixh7rn76.googlevideo.com/videoplayback?expire=1685562699&ei=61B3ZMiwLYrGyAWwyobYCg&ip=86.115.0.76&id=o-ACiCBpaO1Q2PKFjOP5n1Duzye_iJ_CwG7KZFMF7cyQRs&itag=22&source=youtube&requiressl=yes&mh=1Z&mm=31%2C26&mn=sn-ixh7rn76%2Csn-5go7ynld&ms=au%2Conr&mv=m&mvi=4&pl=18&initcwndbps=1540000&vprv=1&svpuc=1&mime=video%2Fmp4&ns=26JJwbFAPXnS2sX_ErQEi-YN&cnr=14&ratebypass=yes&dur=2174.154&lmt=1662125272928470&mt=1685540944&fvip=3&fexp=24007246%2C24363393&c=WEB&txp=6218224&n=w_pjUExnxyl1uw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhAOREHdqmUD93XotZm8pehS2cM8t2bqcivz73KguBGQPiAiEAzZT9xmMgLdAWB8wGlU4uACZ00anBXoIVR0l-siYaQTw%3D&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRQIgey4lqzo0DRvvPAbLofl901Bz46q_ttErfs4b2w-1BxQCIQDps9EERAMB4zPZJMkmAjNoehOcPWwnGEskLXnBYCRiaQ%3D%3D'
[download] Johdanto ohjelmistotestaukseen-euq1xlR_cKI.mp4 has already been downloaded
[download] 100% of 62.46MiB
```

download into specific folder
```
youtube-dl -o '/foldername/%(playlist_title)s/%(playlist_index)s_%(title)s.%(ext)s'
```

### Report 

Introduction  
Points proposal  
Testing strategy  
Environment and test tools  
Existing tests  
Written tests    
Test cases  
Functional tests     	
Non-functional test     	 
Other tests  
Bug report    
Risks report  	  
Conclusion  
 

### Introduction

Descriptive text of the course project and the project being tested
 

### Points proposal

Describe what tasks you have carried out and how many points you should get from each task


### Testing strategy

   - Describe what kind of testing strategy and approach your group is using; 
   - are you doing only white-box testing? 
   - Why/why not? 
   - What are you expecting from the testing?


<Group can answer questions like Background (how methods are used), Rationale for selected method and How method was utilized> 


### Environment and test tools

Document the environment(s) used in testing.   
Describe also all the tools that were used when testing the software

<Group can answer questions like Background (how environment and tools were chosen), Rationale for selected environment and tools and How they were utilized>
 
 
### Existing tests

Describe the existing test. 

Does the software have unit tests etc?
 
### Written tests

If you write unit or other test, describe them here


### Test cases

Describe all the test you have conducted

**Functional tests**

|ID|	Tester|	Feature being tested	|Testing approach and type	|Test result|	
|:-|:-|:-|:-|:-|
|F-1|	N.N.| Printing of a ticket | Black-box test, System test	|Pass| 

					
**Non-functional test**

|ID	|Tester	|Feature being tested	|Testing approach and type	|Test result	|
|:-|:-|:-|:-|:-|
|N-1|	N.N.|System block access from non-authenticated users|Black-box test, Security test|Fail|
					

**Other tests**

|ID	|Tester	|Feature being tested	|Testing approach and type	|Test result|
|:-|:-|:-|:-|:-|
|O-1|||||
					
 
### Bug report (10 is enough)

|Date and time	||
|:-|:-|
|Description	||
|Test case ID	||
|Test steps	||
|Input	||
|Expected result||	
|Achieved result||	
|Other notes	||
|Bug severity ||


### Risks report

Is the software ready to be used in production? 

Why/why not? 

How well was your testing? 

What improvement would still be needed – for software and for testing?

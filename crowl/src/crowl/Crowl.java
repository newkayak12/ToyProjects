package crowl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crowl {
	
	public static void main(String[] args) {
		
	
		
		String url = "https://www.melon.com/chart/index.htm";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
			
			Elements contents01=doc.select(".rank01 a");
			List temp2 = new ArrayList();
			for(Element con : contents01) {
				temp2.add(con.text());
			}
			
			System.out.println(temp2);
			
			Elements contents02=doc.select(".rank02 a");
			
			System.out.println("\n--------------\n");
			
			List list = new ArrayList();
			Iterator it = contents02.iterator();
			while(it.hasNext()) {
				Element result = (Element)it.next();
				
				list.add(result.html());
				
				
			}
			
			List temp = new ArrayList();
			for(int i=0; i<list.size(); i++) {
				if(i%2==0) {
					temp.add(list.get(i));
				}
			}
			
			System.out.println(temp);
			String[] array = null;
			String t = "";
			List<String> result = new ArrayList();
			for(int i=0; i<temp.size(); i++) {
				t = temp2.get(i)+" - "+temp.get(i) ;
				System.out.println(t);
			
			}
			
			
//			System.out.println(list);
			
			
			
			
//			
//			for(Element con : contents02) {
//				System.out.println(con.text());
//			}
//			
//			System.out.println("\n--------------\n");
//			Elements contents03=doc.select(".rank03 a");
//			
//			for(Element con : contents02) {
//				System.out.println(con.text());
//			}
//			
			
//			
//			System.out.println(contents.text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
/*
 * 
 * 
<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33487342);" title="Next Level 재생">Next Level</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2899555');" title="aespa - 페이지 이동">aespa</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2899555');" title="aespa - 페이지 이동">aespa</a></span>
								</div>
								
							</div>
						</div></td>
<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10609232');" title="Next Level - 페이지 이동">Next Level</a>
								</div>
							</div>
						</div></td>
<div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10609232');" title="Next Level - 페이지 이동">Next Level</a>
								</div>
							</div>
						</div>
<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10609232');" title="Next Level - 페이지 이동">Next Level</a>
								</div>
							</div>
						</div></td>
<td><div class="wrap">
							<button type="button" class="button_etc like" title="Next Level 좋아요" data-song-no="33487342" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
129,413</span></button>
						</div></td>
<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33487342);"><span class="none">듣기</span></button>
						</div></td>
<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33487342');"><span class="none">담기</span></button>
						</div></td>
<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33487342', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video" onclick="melon.link.goMvDetail('19030101', '33487342','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
<tr data-song-no="33487342">
						<td><div class="wrap t_right"><input type="checkbox" title="Next Level 곡 선택" class="input_check " name="input_check" value="33487342"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10609232');" title="Next Level" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/09/232/10609232_20210517155130_500.jpg/melon/resize/120/quality/80/optimize" alt="Next Level - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33487342');" title="Next Level 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33487342);" title="Next Level 재생">Next Level</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2899555');" title="aespa - 페이지 이동">aespa</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2899555');" title="aespa - 페이지 이동">aespa</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10609232');" title="Next Level - 페이지 이동">Next Level</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Next Level 좋아요" data-song-no="33487342" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
129,413</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33487342);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33487342');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33487342', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video" onclick="melon.link.goMvDetail('19030101', '33487342','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33507137">
						<td><div class="wrap t_right"><input type="checkbox" title="Butter 곡 선택" class="input_check " name="input_check" value="33507137"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10612483');" title="Butter" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/12/483/10612483_20210521111412_500.jpg/melon/resize/120/quality/80/optimize" alt="Butter - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33507137');" title="Butter 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33507137);" title="Butter 재생">Butter</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10612483');" title="Butter - 페이지 이동">Butter</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Butter 좋아요" data-song-no="33507137" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
204,568</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33507137);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33507137');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33507137', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33507137','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<td><div class="wrap t_right"><input type="checkbox" title="Butter 곡 선택" class="input_check " name="input_check" value="33507137"></div></td>
<div class="wrap t_right"><input type="checkbox" title="Butter 곡 선택" class="input_check " name="input_check" value="33507137"></div>
<td><div class="wrap t_right"><input type="checkbox" title="Butter 곡 선택" class="input_check " name="input_check" value="33507137"></div></td>
<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10612483');" title="Butter" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/12/483/10612483_20210521111412_500.jpg/melon/resize/120/quality/80/optimize" alt="Butter - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33507137');" title="Butter 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33507137);" title="Butter 재생">Butter</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a></span>
								</div>
								
							</div>
						</div></td>
<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10612483');" title="Butter - 페이지 이동">Butter</a>
								</div>
							</div>
						</div></td>
<td><div class="wrap">
							<button type="button" class="button_etc like" title="Butter 좋아요" data-song-no="33507137" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
204,568</span></button>
						</div></td>
<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33507137);"><span class="none">듣기</span></button>
						</div></td>
<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33507137');"><span class="none">담기</span></button>
						</div></td>
<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33507137', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33507137','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
<tr data-song-no="33507137">
						<td><div class="wrap t_right"><input type="checkbox" title="Butter 곡 선택" class="input_check " name="input_check" value="33507137"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10612483');" title="Butter" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/12/483/10612483_20210521111412_500.jpg/melon/resize/120/quality/80/optimize" alt="Butter - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33507137');" title="Butter 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33507137);" title="Butter 재생">Butter</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10612483');" title="Butter - 페이지 이동">Butter</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Butter 좋아요" data-song-no="33507137" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
204,568</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33507137);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33507137');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33507137', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33507137','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33503722">
						<td><div class="wrap t_right"><input type="checkbox" title="헤픈 우연 곡 선택" class="input_check " name="input_check" value="33503722"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10611845');" title="HAPPEN" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/11/845/10611845_20210520170350_500.jpg/melon/resize/120/quality/80/optimize" alt="HAPPEN - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33503722');" title="헤픈 우연 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33503722);" title="헤픈 우연 재생">헤픈 우연</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('751611');" title="헤이즈 (Heize) - 페이지 이동">헤이즈 (Heize)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('751611');" title="헤이즈 (Heize) - 페이지 이동">헤이즈 (Heize)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10611845');" title="HAPPEN - 페이지 이동">HAPPEN</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="헤픈 우연 좋아요" data-song-no="33503722" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
104,620</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33503722);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33503722');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33503722', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33503722','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33589260">
						<td><div class="wrap t_right"><input type="checkbox" title="치맛바람 (Chi Mat Ba Ram) 곡 선택" class="input_check " name="input_check" value="33589260"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10631055');" title="Summer Queen" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/31/055/10631055_20210617140538_500.jpg/melon/resize/120/quality/80/optimize" alt="Summer Queen - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33589260');" title="치맛바람 (Chi Mat Ba Ram) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33589260);" title="치맛바람 (Chi Mat Ba Ram) 재생">치맛바람 (Chi Mat Ba Ram)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('531700');" title="브레이브걸스 - 페이지 이동">브레이브걸스</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('531700');" title="브레이브걸스 - 페이지 이동">브레이브걸스</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10631055');" title="Summer Queen - 페이지 이동">Summer Queen</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="치맛바람 (Chi Mat Ba Ram) 좋아요" data-song-no="33589260" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
57,772</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33589260);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33589260');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33589260', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33589260','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33464805">
						<td><div class="wrap t_right"><input type="checkbox" title="Dun Dun Dance 곡 선택" class="input_check " name="input_check" value="33464805"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10604729');" title="Dear OHMYGIRL" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/04/729/10604729_20210510143932_500.jpg/melon/resize/120/quality/80/optimize" alt="Dear OHMYGIRL - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33464805');" title="Dun Dun Dance 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33464805);" title="Dun Dun Dance 재생">Dun Dun Dance</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('857994');" title="오마이걸 (OH MY GIRL) - 페이지 이동">오마이걸 (OH MY GIRL)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('857994');" title="오마이걸 (OH MY GIRL) - 페이지 이동">오마이걸 (OH MY GIRL)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10604729');" title="Dear OHMYGIRL - 페이지 이동">Dear OHMYGIRL</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Dun Dun Dance 좋아요" data-song-no="33464805" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
117,091</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33464805);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33464805');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33464805', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33464805','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33359317">
						<td><div class="wrap t_right"><input type="checkbox" title="Peaches (Feat. Daniel Caesar &amp; Giveon) 곡 선택" class="input_check " name="input_check" value="33359317"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10580103');" title="Justice" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/80/103/10580103_20210319132819_500.jpg/melon/resize/120/quality/80/optimize" alt="Justice - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33359317');" title="Peaches (Feat. Daniel Caesar &amp; Giveon) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33359317);" title="Peaches (Feat. Daniel Caesar &amp; Giveon) 재생">Peaches (Feat. Daniel Caesar &amp; Giveon)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('420621');" title="Justin Bieber - 페이지 이동">Justin Bieber</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('420621');" title="Justin Bieber - 페이지 이동">Justin Bieber</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10580103');" title="Justice - 페이지 이동">Justice</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Peaches (Feat. Daniel Caesar &amp; Giveon) 좋아요" data-song-no="33359317" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
168,598</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33359317);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33359317');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33359317', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33359317','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="30287019">
						<td><div class="wrap t_right"><input type="checkbox" title="롤린 (Rollin') 곡 선택" class="input_check " name="input_check" value="30287019"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10043575');" title="Rollin'" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/100/43/575/10043575_20210302112520_500.jpg/melon/resize/120/quality/80/optimize" alt="Rollin' - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('30287019');" title="롤린 (Rollin') 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',30287019);" title="롤린 (Rollin') 재생">롤린 (Rollin')</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('531700');" title="브레이브걸스 - 페이지 이동">브레이브걸스</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('531700');" title="브레이브걸스 - 페이지 이동">브레이브걸스</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10043575');" title="Rollin' - 페이지 이동">Rollin'</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="롤린 (Rollin') 좋아요" data-song-no="30287019" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
277,041</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',30287019);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('30287019');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '30287019', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '30287019','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33559180">
						<td><div class="wrap t_right"><input type="checkbox" title="Alcohol-Free 곡 선택" class="input_check " name="input_check" value="33559180"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10623687');" title="Taste of Love" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/23/687/10623687_20210611104446_500.jpg/melon/resize/120/quality/80/optimize" alt="Taste of Love - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33559180');" title="Alcohol-Free 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33559180);" title="Alcohol-Free 재생">Alcohol-Free</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('905701');" title="TWICE (트와이스) - 페이지 이동">TWICE (트와이스)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('905701');" title="TWICE (트와이스) - 페이지 이동">TWICE (트와이스)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10623687');" title="Taste of Love - 페이지 이동">Taste of Love</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Alcohol-Free 좋아요" data-song-no="33559180" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
42,855</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33559180);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33559180');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33559180', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33559180','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33372781">
						<td><div class="wrap t_right"><input type="checkbox" title="라일락 곡 선택" class="input_check " name="input_check" value="33372781"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC'" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/54/246/10554246_20210325161233_500.jpg/melon/resize/120/quality/80/optimize" alt="IU 5th Album 'LILAC' - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33372781');" title="라일락 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33372781);" title="라일락 재생">라일락</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC' - 페이지 이동">IU 5th Album 'LILAC'</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="라일락 좋아요" data-song-no="33372781" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
198,559</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33372781);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33372781');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33372781', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33372781','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33397561">
						<td><div class="wrap t_right"><input type="checkbox" title="ASAP 곡 선택" class="input_check " name="input_check" value="33397561"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10589127');" title="STAYDOM" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/89/127/10589127_20210407175809_500.jpg/melon/resize/120/quality/80/optimize" alt="STAYDOM - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33397561');" title="ASAP 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33397561);" title="ASAP 재생">ASAP</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2899290');" title="STAYC(스테이씨) - 페이지 이동">STAYC(스테이씨)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2899290');" title="STAYC(스테이씨) - 페이지 이동">STAYC(스테이씨)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10589127');" title="STAYDOM - 페이지 이동">STAYDOM</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="ASAP 좋아요" data-song-no="33397561" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
100,050</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33397561);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33397561');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33397561', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33397561','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32860397">
						<td><div class="wrap t_right"><input type="checkbox" title="운전만해 (We Ride) 곡 선택" class="input_check " name="input_check" value="32860397"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10476623');" title="We Ride" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/76/623/10476623_20200814143410_500.jpg/melon/resize/120/quality/80/optimize" alt="We Ride - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32860397');" title="운전만해 (We Ride) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32860397);" title="운전만해 (We Ride) 재생">운전만해 (We Ride)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('531700');" title="브레이브걸스 - 페이지 이동">브레이브걸스</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('531700');" title="브레이브걸스 - 페이지 이동">브레이브걸스</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10476623');" title="We Ride - 페이지 이동">We Ride</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="운전만해 (We Ride) 좋아요" data-song-no="32860397" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
119,047</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32860397);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32860397');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32860397', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32860397','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32872978">
						<td><div class="wrap t_right"><input type="checkbox" title="Dynamite 곡 선택" class="input_check " name="input_check" value="32872978"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10479150');" title="Dynamite (DayTime Version)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/79/150/10479150_20200918102847_500.jpg/melon/resize/120/quality/80/optimize" alt="Dynamite (DayTime Version) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32872978');" title="Dynamite 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32872978);" title="Dynamite 재생">Dynamite</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10479150');" title="Dynamite (DayTime Version) - 페이지 이동">Dynamite (DayTime Version)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Dynamite 좋아요" data-song-no="32872978" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
412,136</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32872978);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32872978');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32872978', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32872978','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33239419">
						<td><div class="wrap t_right"><input type="checkbox" title="Celebrity 곡 선택" class="input_check " name="input_check" value="33239419"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC'" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/54/246/10554246_20210325161233_500.jpg/melon/resize/120/quality/80/optimize" alt="IU 5th Album 'LILAC' - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33239419');" title="Celebrity 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33239419);" title="Celebrity 재생">Celebrity</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC' - 페이지 이동">IU 5th Album 'LILAC'</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Celebrity 좋아요" data-song-no="33239419" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
288,463</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33239419);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33239419');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33239419', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33239419','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33527705">
						<td><div class="wrap t_right"><input type="checkbox" title="안녕 (Hello) 곡 선택" class="input_check " name="input_check" value="33527705"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10614899');" title="안녕 (Hello) - Special Album" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/14/899/10614899_20210531150225_500.jpg/melon/resize/120/quality/80/optimize" alt="안녕 (Hello) - Special Album - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33527705');" title="안녕 (Hello) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33527705);" title="안녕 (Hello) 재생">안녕 (Hello)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('780922');" title="조이 (JOY) - 페이지 이동">조이 (JOY)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('780922');" title="조이 (JOY) - 페이지 이동">조이 (JOY)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10614899');" title="안녕 (Hello) - Special Album - 페이지 이동">안녕 (Hello) - Special Album</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="안녕 (Hello) 좋아요" data-song-no="33527705" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
70,793</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33527705);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33527705');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33527705', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33527705','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33510307">
						<td><div class="wrap t_right"><input type="checkbox" title="상상더하기 곡 선택" class="input_check " name="input_check" value="33510307"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10613163');" title="MSG워너비 TOP 8 경연곡" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/13/163/10613163_20210521172906_500.jpg/melon/resize/120/quality/80/optimize" alt="MSG워너비 TOP 8 경연곡 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33510307');" title="상상더하기 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33510307);" title="상상더하기 재생">상상더하기</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2939206');" title="MSG워너비 TOP 8 (별루지, 김정수, 강창모, 정기석, 이동휘, 이상이, 박재정, 원슈타인) - 페이지 이동">MSG워너비 TOP 8 (별루지, 김정수, 강창모, 정기석, 이동휘, 이상이, 박재정, 원슈타인)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2939206');" title="MSG워너비 TOP 8 (별루지, 김정수, 강창모, 정기석, 이동휘, 이상이, 박재정, 원슈타인) - 페이지 이동">MSG워너비 TOP 8 (별루지, 김정수, 강창모, 정기석, 이동휘, 이상이, 박재정, 원슈타인)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10613163');" title="MSG워너비 TOP 8 경연곡 - 페이지 이동">MSG워너비 TOP 8 경연곡</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="상상더하기 좋아요" data-song-no="33510307" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
47,861</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33510307);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33510307');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33510307', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33510307','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="8130796">
						<td><div class="wrap t_right"><input type="checkbox" title="상상더하기 곡 선택" class="input_check " name="input_check" value="8130796"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('2677681');" title="Fresh Adventure" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/026/77/681/2677681_500.jpg/melon/resize/120/quality/80/optimize" alt="Fresh Adventure - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('8130796');" title="상상더하기 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',8130796);" title="상상더하기 재생">상상더하기</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('783462');" title="라붐 (LABOUM) - 페이지 이동">라붐 (LABOUM)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('783462');" title="라붐 (LABOUM) - 페이지 이동">라붐 (LABOUM)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('2677681');" title="Fresh Adventure - 페이지 이동">Fresh Adventure</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="상상더하기 좋아요" data-song-no="8130796" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
107,035</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',8130796);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('8130796');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '8130796', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '8130796','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="1944399">
						<td><div class="wrap t_right"><input type="checkbox" title="Timeless 곡 선택" class="input_check " name="input_check" value="1944399"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('399659');" title="Sg Wanna Be+" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/003/99/659/399659_500.jpg/melon/resize/120/quality/80/optimize" alt="Sg Wanna Be+ - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('1944399');" title="Timeless 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',1944399);" title="Timeless 재생">Timeless</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('108363');" title="SG 워너비 - 페이지 이동">SG 워너비</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('108363');" title="SG 워너비 - 페이지 이동">SG 워너비</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('399659');" title="Sg Wanna Be+ - 페이지 이동">Sg Wanna Be+</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Timeless 좋아요" data-song-no="1944399" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
92,081</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',1944399);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('1944399');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '1944399', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '1944399','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33359725">
						<td><div class="wrap t_right"><input type="checkbox" title="사이렌 Remix (Feat. UNEDUCATED KID, Paul Blanco) 곡 선택" class="input_check " name="input_check" value="33359725"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10580227');" title="사이렌 Remix" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/80/227/10580227_20210319163608_500.jpg/melon/resize/120/quality/80/optimize" alt="사이렌 Remix - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33359725');" title="사이렌 Remix (Feat. UNEDUCATED KID, Paul Blanco) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33359725);" title="사이렌 Remix (Feat. UNEDUCATED KID, Paul Blanco) 재생">사이렌 Remix (Feat. UNEDUCATED KID, Paul Blanco)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2754623');" title="호미들 - 페이지 이동">호미들</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2754623');" title="호미들 - 페이지 이동">호미들</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10580227');" title="사이렌 Remix - 페이지 이동">사이렌 Remix</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="사이렌 Remix (Feat. UNEDUCATED KID, Paul Blanco) 좋아요" data-song-no="33359725" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
85,280</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33359725);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33359725');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33359725', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33359725','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="3414749">
						<td><div class="wrap t_right"><input type="checkbox" title="내 손을 잡아 곡 선택" class="input_check " name="input_check" value="3414749"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('1286252');" title="최고의 사랑 OST Part.4" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/012/86/252/1286252_500.jpg/melon/resize/120/quality/80/optimize" alt="최고의 사랑 OST Part.4 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('3414749');" title="내 손을 잡아 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',3414749);" title="내 손을 잡아 재생">내 손을 잡아</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('1286252');" title="최고의 사랑 OST Part.4 - 페이지 이동">최고의 사랑 OST Part.4</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="내 손을 잡아 좋아요" data-song-no="3414749" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
155,309</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',3414749);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('3414749');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '3414749', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '3414749','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33315511">
						<td><div class="wrap t_right"><input type="checkbox" title="멜로디 곡 선택" class="input_check " name="input_check" value="33315511"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10570193');" title="멜로디" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/70/193/10570193_20210225111143_500.jpg/melon/resize/120/quality/80/optimize" alt="멜로디 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33315511');" title="멜로디 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33315511);" title="멜로디 재생">멜로디</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2112495');" title="ASH ISLAND - 페이지 이동">ASH ISLAND</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2112495');" title="ASH ISLAND - 페이지 이동">ASH ISLAND</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10570193');" title="멜로디 - 페이지 이동">멜로디</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="멜로디 좋아요" data-song-no="33315511" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
88,186</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33315511);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33315511');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33315511', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33315511','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33589488">
						<td><div class="wrap t_right"><input type="checkbox" title="비와 당신 곡 선택" class="input_check " name="input_check" value="33589488"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10631122');" title="슬기로운 의사생활 시즌2 OST Part 1" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/31/122/10631122_20210617142653_500.jpg/melon/resize/120/quality/80/optimize" alt="슬기로운 의사생활 시즌2 OST Part 1 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33589488');" title="비와 당신 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33589488);" title="비와 당신 재생">비와 당신</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2138620');" title="이무진 - 페이지 이동">이무진</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2138620');" title="이무진 - 페이지 이동">이무진</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10631122');" title="슬기로운 의사생활 시즌2 OST Part 1 - 페이지 이동">슬기로운 의사생활 시즌2 OST Part 1</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="비와 당신 좋아요" data-song-no="33589488" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
27,620</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33589488);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33589488');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33589488', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33589488','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33167063">
						<td><div class="wrap t_right"><input type="checkbox" title="밝게 빛나는 별이 되어 비춰줄게 곡 선택" class="input_check " name="input_check" value="33167063"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10540298');" title="밝게 빛나는 별이 되어 비춰줄게" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/40/298/10540298_20201229150823_500.jpg/melon/resize/120/quality/80/optimize" alt="밝게 빛나는 별이 되어 비춰줄게 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33167063');" title="밝게 빛나는 별이 되어 비춰줄게 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33167063);" title="밝게 빛나는 별이 되어 비춰줄게 재생">밝게 빛나는 별이 되어 비춰줄게</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2189536');" title="송이한 - 페이지 이동">송이한</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2189536');" title="송이한 - 페이지 이동">송이한</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10540298');" title="밝게 빛나는 별이 되어 비춰줄게 - 페이지 이동">밝게 빛나는 별이 되어 비춰줄게</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="밝게 빛나는 별이 되어 비춰줄게 좋아요" data-song-no="33167063" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
80,250</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33167063);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33167063');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33167063', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33167063','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33447280">
						<td><div class="wrap t_right"><input type="checkbox" title="마.피.아. In the morning 곡 선택" class="input_check " name="input_check" value="33447280"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10600760');" title="GUESS WHO" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/00/760/10600760_20210429213541_500.jpg/melon/resize/120/quality/80/optimize" alt="GUESS WHO - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33447280');" title="마.피.아. In the morning 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33447280);" title="마.피.아. In the morning 재생">마.피.아. In the morning</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2622030');" title="ITZY (있지) - 페이지 이동">ITZY (있지)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2622030');" title="ITZY (있지) - 페이지 이동">ITZY (있지)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10600760');" title="GUESS WHO - 페이지 이동">GUESS WHO</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="마.피.아. In the morning 좋아요" data-song-no="33447280" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
52,518</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33447280);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33447280');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33447280', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33447280','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="1854856">
						<td><div class="wrap t_right"><input type="checkbox" title="라라라 곡 선택" class="input_check " name="input_check" value="1854856"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('376502');" title="My Friend" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/003/76/502/376502_500.jpg/melon/resize/120/quality/80/optimize" alt="My Friend - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('1854856');" title="라라라 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',1854856);" title="라라라 재생">라라라</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('108363');" title="SG 워너비 - 페이지 이동">SG 워너비</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('108363');" title="SG 워너비 - 페이지 이동">SG 워너비</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('376502');" title="My Friend - 페이지 이동">My Friend</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="라라라 좋아요" data-song-no="1854856" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
77,903</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',1854856);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('1854856');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '1854856', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '1854856','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33331004">
						<td><div class="wrap t_right"><input type="checkbox" title="LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지) 곡 선택" class="input_check " name="input_check" value="33331004"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10573486');" title="LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/73/486/10573486_20210304202053_500.jpg/melon/resize/120/quality/80/optimize" alt="LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33331004');" title="LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33331004);" title="LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지) 재생">LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('510565');" title="양요섭 - 페이지 이동">양요섭</a>, <a href="javascript:melon.link.goArtistDetail('644871');" title="정은지 - 페이지 이동">정은지</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('510565');" title="양요섭 - 페이지 이동">양요섭</a>, <a href="javascript:melon.link.goArtistDetail('644871');" title="정은지 - 페이지 이동">정은지</a></span>
								</div>
								
									<div class="wrap_atist" style="display:none;">
										<button type="button" title="아티스트 더보기" class="button_icons etc more_down" data-control="dropdown"><span class="none">아티스트명 더보기</span></button>
										<div class="atist_view" style="display:none;">
											<ul>
												
												<li><a href="javascript:melon.link.goArtistDetail('510565');" title="양요섭 페이지 이동" class="ellipsis">양요섭</a></li>
												
												<li><a href="javascript:melon.link.goArtistDetail('644871');" title="정은지 페이지 이동" class="ellipsis">정은지</a></li>
												
											</ul>
										</div>
									</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10573486');" title="LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지) - 페이지 이동">LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지) 좋아요" data-song-no="33331004" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
92,576</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33331004);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33331004');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33331004', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33331004','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32962258">
						<td><div class="wrap t_right"><input type="checkbox" title="Savage Love (Laxed - Siren Beat) (BTS Remix) 곡 선택" class="input_check " name="input_check" value="32962258"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10498123');" title="Savage Love (Laxed - Siren Beat) [BTS Remix]" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/98/123/10498123_20201002094556_500.jpg/melon/resize/120/quality/80/optimize" alt="Savage Love (Laxed - Siren Beat) [BTS Remix] - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32962258');" title="Savage Love (Laxed - Siren Beat) (BTS Remix) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32962258);" title="Savage Love (Laxed - Siren Beat) (BTS Remix) 재생">Savage Love (Laxed - Siren Beat) (BTS Remix)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2868396');" title="Jawsh 685 - 페이지 이동">Jawsh 685</a>, <a href="javascript:melon.link.goArtistDetail('432140');" title="Jason Derulo - 페이지 이동">Jason Derulo</a>, <a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2868396');" title="Jawsh 685 - 페이지 이동">Jawsh 685</a>, <a href="javascript:melon.link.goArtistDetail('432140');" title="Jason Derulo - 페이지 이동">Jason Derulo</a>, <a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a></span>
								</div>
								
									<div class="wrap_atist" style="display:none;">
										<button type="button" title="아티스트 더보기" class="button_icons etc more_down" data-control="dropdown"><span class="none">아티스트명 더보기</span></button>
										<div class="atist_view" style="display:none;">
											<ul>
												
												<li><a href="javascript:melon.link.goArtistDetail('2868396');" title="Jawsh 685 페이지 이동" class="ellipsis">Jawsh 685</a></li>
												
												<li><a href="javascript:melon.link.goArtistDetail('432140');" title="Jason Derulo 페이지 이동" class="ellipsis">Jason Derulo</a></li>
												
												<li><a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 페이지 이동" class="ellipsis">방탄소년단</a></li>
												
											</ul>
										</div>
									</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10498123');" title="Savage Love (Laxed - Siren Beat) [BTS Remix] - 페이지 이동">Savage Love (Laxed - Siren Beat) [BTS Remix]</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Savage Love (Laxed - Siren Beat) (BTS Remix) 좋아요" data-song-no="32962258" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
174,132</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32962258);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32962258');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32962258', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '32962258','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33061995">
						<td><div class="wrap t_right"><input type="checkbox" title="밤하늘의 별을(2020) 곡 선택" class="input_check " name="input_check" value="33061995"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10518234');" title="밤하늘의 별을(2020)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/18/234/10518234_20210216102853_500.jpg/melon/resize/120/quality/80/optimize" alt="밤하늘의 별을(2020) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33061995');" title="밤하늘의 별을(2020) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33061995);" title="밤하늘의 별을(2020) 재생">밤하늘의 별을(2020)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('994005');" title="경서 - 페이지 이동">경서</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('994005');" title="경서 - 페이지 이동">경서</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10518234');" title="밤하늘의 별을(2020) - 페이지 이동">밤하늘의 별을(2020)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="밤하늘의 별을(2020) 좋아요" data-song-no="33061995" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
154,040</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33061995);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33061995');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33061995', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33061995','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32961718">
						<td><div class="wrap t_right"><input type="checkbox" title="Lovesick Girls 곡 선택" class="input_check " name="input_check" value="32961718"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10498032');" title="THE ALBUM" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/98/032/10498032_20200929122954_500.jpg/melon/resize/120/quality/80/optimize" alt="THE ALBUM - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32961718');" title="Lovesick Girls 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32961718);" title="Lovesick Girls 재생">Lovesick Girls</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('995169');" title="BLACKPINK - 페이지 이동">BLACKPINK</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('995169');" title="BLACKPINK - 페이지 이동">BLACKPINK</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10498032');" title="THE ALBUM - 페이지 이동">THE ALBUM</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Lovesick Girls 좋아요" data-song-no="32961718" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
190,835</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32961718);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32961718');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32961718', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32961718','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33372783">
						<td><div class="wrap t_right"><input type="checkbox" title="Coin 곡 선택" class="input_check " name="input_check" value="33372783"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC'" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/54/246/10554246_20210325161233_500.jpg/melon/resize/120/quality/80/optimize" alt="IU 5th Album 'LILAC' - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33372783');" title="Coin 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33372783);" title="Coin 재생">Coin</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC' - 페이지 이동">IU 5th Album 'LILAC'</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Coin 좋아요" data-song-no="33372783" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
93,768</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33372783);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33372783');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33372783', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33372783','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="1500196">
						<td><div class="wrap t_right"><input type="checkbox" title="내사람 곡 선택" class="input_check " name="input_check" value="1500196"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('332658');" title="The Precious History" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/003/32/658/332658_500.jpg/melon/resize/120/quality/80/optimize" alt="The Precious History - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('1500196');" title="내사람 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',1500196);" title="내사람 재생">내사람</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('108363');" title="SG 워너비 - 페이지 이동">SG 워너비</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('108363');" title="SG 워너비 - 페이지 이동">SG 워너비</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('332658');" title="The Precious History - 페이지 이동">The Precious History</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="내사람 좋아요" data-song-no="1500196" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
64,794</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',1500196);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('1500196');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '1500196', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '1500196','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33480898">
						<td><div class="wrap t_right"><input type="checkbox" title="신호등 곡 선택" class="input_check " name="input_check" value="33480898"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10607796');" title="신호등" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/07/796/10607796_20210513201807_500.jpg/melon/resize/120/quality/80/optimize" alt="신호등 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33480898');" title="신호등 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33480898);" title="신호등 재생">신호등</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2138620');" title="이무진 - 페이지 이동">이무진</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2138620');" title="이무진 - 페이지 이동">이무진</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10607796');" title="신호등 - 페이지 이동">신호등</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="신호등 좋아요" data-song-no="33480898" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
50,066</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33480898);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33480898');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33480898', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33480898','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32559782">
						<td><div class="wrap t_right"><input type="checkbox" title="Dolphin 곡 선택" class="input_check " name="input_check" value="32559782"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10423289');" title="NONSTOP" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/23/289/10423289_20200427153909_500.jpg/melon/resize/120/quality/80/optimize" alt="NONSTOP - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32559782');" title="Dolphin 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32559782);" title="Dolphin 재생">Dolphin</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('857994');" title="오마이걸 (OH MY GIRL) - 페이지 이동">오마이걸 (OH MY GIRL)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('857994');" title="오마이걸 (OH MY GIRL) - 페이지 이동">오마이걸 (OH MY GIRL)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10423289');" title="NONSTOP - 페이지 이동">NONSTOP</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Dolphin 좋아요" data-song-no="32559782" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
184,405</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32559782);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32559782');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32559782', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '32559782','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33013877">
						<td><div class="wrap t_right"><input type="checkbox" title="잠이 오질 않네요 곡 선택" class="input_check " name="input_check" value="33013877"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10508266');" title="잠이 오질 않네요" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/08/266/10508266_20201023171236_500.jpg/melon/resize/120/quality/80/optimize" alt="잠이 오질 않네요 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33013877');" title="잠이 오질 않네요 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33013877);" title="잠이 오질 않네요 재생">잠이 오질 않네요</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('648551');" title="장범준 - 페이지 이동">장범준</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('648551');" title="장범준 - 페이지 이동">장범준</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10508266');" title="잠이 오질 않네요 - 페이지 이동">잠이 오질 않네요</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="잠이 오질 않네요 좋아요" data-song-no="33013877" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
140,523</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33013877);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33013877');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33013877', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33013877','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="31737197">
						<td><div class="wrap t_right"><input type="checkbox" title="작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey) 곡 선택" class="input_check " name="input_check" value="31737197"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10273641');" title="MAP OF THE SOUL : PERSONA" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/102/73/641/10273641_500.jpg/melon/resize/120/quality/80/optimize" alt="MAP OF THE SOUL : PERSONA - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('31737197');" title="작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',31737197);" title="작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey) 재생">작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10273641');" title="MAP OF THE SOUL : PERSONA - 페이지 이동">MAP OF THE SOUL : PERSONA</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey) 좋아요" data-song-no="31737197" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
422,218</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',31737197);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('31737197');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '31737197', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '31737197','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32578498">
						<td><div class="wrap t_right"><input type="checkbox" title="에잇(Prod.&amp;Feat. SUGA of BTS) 곡 선택" class="input_check " name="input_check" value="32578498"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10426648');" title="에잇" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/26/648/10426648_20200506153340_500.jpg/melon/resize/120/quality/80/optimize" alt="에잇 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32578498');" title="에잇(Prod.&amp;Feat. SUGA of BTS) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32578498);" title="에잇(Prod.&amp;Feat. SUGA of BTS) 재생">에잇(Prod.&amp;Feat. SUGA of BTS)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10426648');" title="에잇 - 페이지 이동">에잇</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="에잇(Prod.&amp;Feat. SUGA of BTS) 좋아요" data-song-no="32578498" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
360,520</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32578498);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32578498');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32578498', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32578498','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33346446">
						<td><div class="wrap t_right"><input type="checkbox" title="On The Ground 곡 선택" class="input_check " name="input_check" value="33346446"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10576966');" title="R" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/76/966/10576966_20210312112253_500.jpg/melon/resize/120/quality/80/optimize" alt="R - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33346446');" title="On The Ground 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33346446);" title="On The Ground 재생">On The Ground</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('995171');" title="로제 (ROSÉ) - 페이지 이동">로제 (ROSÉ)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('995171');" title="로제 (ROSÉ) - 페이지 이동">로제 (ROSÉ)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10576966');" title="R - 페이지 이동">R</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="On The Ground 좋아요" data-song-no="33346446" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
128,025</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33346446);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33346446');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33346446', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33346446','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32794652">
						<td><div class="wrap t_right"><input type="checkbox" title="취기를 빌려 (취향저격 그녀 X 산들) 곡 선택" class="input_check " name="input_check" value="32794652"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10463600');" title="취기를 빌려 (취향저격 그녀 X 산들)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/63/600/10463600_20200720152905_500.jpg/melon/resize/120/quality/80/optimize" alt="취기를 빌려 (취향저격 그녀 X 산들) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32794652');" title="취기를 빌려 (취향저격 그녀 X 산들) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32794652);" title="취기를 빌려 (취향저격 그녀 X 산들) 재생">취기를 빌려 (취향저격 그녀 X 산들)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('672392');" title="산들 - 페이지 이동">산들</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('672392');" title="산들 - 페이지 이동">산들</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10463600');" title="취기를 빌려 (취향저격 그녀 X 산들) - 페이지 이동">취기를 빌려 (취향저격 그녀 X 산들)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="취기를 빌려 (취향저격 그녀 X 산들) 좋아요" data-song-no="32794652" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
193,463</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32794652);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32794652');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32794652', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '32794652','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32061975">
						<td><div class="wrap t_right"><input type="checkbox" title="어떻게 이별까지 사랑하겠어, 널 사랑하는 거지 곡 선택" class="input_check " name="input_check" value="32061975"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10331947');" title="항해" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/31/947/10331947_500.jpg/melon/resize/120/quality/80/optimize" alt="항해 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32061975');" title="어떻게 이별까지 사랑하겠어, 널 사랑하는 거지 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32061975);" title="어떻게 이별까지 사랑하겠어, 널 사랑하는 거지 재생">어떻게 이별까지 사랑하겠어, 널 사랑하는 거지</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('712452');" title="AKMU (악동뮤지션) - 페이지 이동">AKMU (악동뮤지션)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('712452');" title="AKMU (악동뮤지션) - 페이지 이동">AKMU (악동뮤지션)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10331947');" title="항해 - 페이지 이동">항해</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="어떻게 이별까지 사랑하겠어, 널 사랑하는 거지 좋아요" data-song-no="32061975" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
351,316</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32061975);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32061975');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32061975', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32061975','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32183386">
						<td><div class="wrap t_right"><input type="checkbox" title="Blueming 곡 선택" class="input_check " name="input_check" value="32183386"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10346650');" title="Love poem" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/46/650/10346650_500.jpg/melon/resize/120/quality/80/optimize" alt="Love poem - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32183386');" title="Blueming 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32183386);" title="Blueming 재생">Blueming</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10346650');" title="Love poem - 페이지 이동">Love poem</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Blueming 좋아요" data-song-no="32183386" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
309,709</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32183386);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32183386');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32183386', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32183386','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33248758">
						<td><div class="wrap t_right"><input type="checkbox" title="추억은 만남보다 이별에 남아 곡 선택" class="input_check " name="input_check" value="33248758"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10556610');" title="추억은 만남보다 이별에 남아" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/56/610/10556610_20210129172644_500.jpg/melon/resize/120/quality/80/optimize" alt="추억은 만남보다 이별에 남아 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33248758');" title="추억은 만남보다 이별에 남아 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33248758);" title="추억은 만남보다 이별에 남아 재생">추억은 만남보다 이별에 남아</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('181188');" title="정동하 - 페이지 이동">정동하</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('181188');" title="정동하 - 페이지 이동">정동하</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10556610');" title="추억은 만남보다 이별에 남아 - 페이지 이동">추억은 만남보다 이별에 남아</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="추억은 만남보다 이별에 남아 좋아요" data-song-no="33248758" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
45,205</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33248758);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33248758');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33248758', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33248758','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33372788">
						<td><div class="wrap t_right"><input type="checkbox" title="어푸 (Ah puh) 곡 선택" class="input_check " name="input_check" value="33372788"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC'" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/54/246/10554246_20210325161233_500.jpg/melon/resize/120/quality/80/optimize" alt="IU 5th Album 'LILAC' - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33372788');" title="어푸 (Ah puh) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33372788);" title="어푸 (Ah puh) 재생">어푸 (Ah puh)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC' - 페이지 이동">IU 5th Album 'LILAC'</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="어푸 (Ah puh) 좋아요" data-song-no="33372788" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
82,418</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33372788);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33372788');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33372788', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33372788','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33077590">
						<td><div class="wrap t_right"><input type="checkbox" title="VVS (Feat. JUSTHIS) (Prod. GroovyRoom) 곡 선택" class="input_check " name="input_check" value="33077590"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10521601');" title="쇼미더머니 9 Episode 1" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/21/601/10521601_20201120125511_500.jpg/melon/resize/120/quality/80/optimize" alt="쇼미더머니 9 Episode 1 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33077590');" title="VVS (Feat. JUSTHIS) (Prod. GroovyRoom) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33077590);" title="VVS (Feat. JUSTHIS) (Prod. GroovyRoom) 재생">VVS (Feat. JUSTHIS) (Prod. GroovyRoom)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2866523');" title="미란이 (Mirani) - 페이지 이동">미란이 (Mirani)</a>, <a href="javascript:melon.link.goArtistDetail('2747971');" title="먼치맨(MUNCHMAN) - 페이지 이동">먼치맨(MUNCHMAN)</a>, <a href="javascript:melon.link.goArtistDetail('1703507');" title="Khundi Panda - 페이지 이동">Khundi Panda</a>, <a href="javascript:melon.link.goArtistDetail('2745413');" title="머쉬베놈 (MUSHVENOM) - 페이지 이동">머쉬베놈 (MUSHVENOM)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2866523');" title="미란이 (Mirani) - 페이지 이동">미란이 (Mirani)</a>, <a href="javascript:melon.link.goArtistDetail('2747971');" title="먼치맨(MUNCHMAN) - 페이지 이동">먼치맨(MUNCHMAN)</a>, <a href="javascript:melon.link.goArtistDetail('1703507');" title="Khundi Panda - 페이지 이동">Khundi Panda</a>, <a href="javascript:melon.link.goArtistDetail('2745413');" title="머쉬베놈 (MUSHVENOM) - 페이지 이동">머쉬베놈 (MUSHVENOM)</a></span>
								</div>
								
									<div class="wrap_atist" style="">
										<button type="button" title="아티스트 더보기" class="button_icons etc more_down" data-control="dropdown"><span class="none">아티스트명 더보기</span></button>
										<div class="atist_view" style="display:none;">
											<ul>
												
												<li><a href="javascript:melon.link.goArtistDetail('2866523');" title="미란이 (Mirani) 페이지 이동" class="ellipsis">미란이 (Mirani)</a></li>
												
												<li><a href="javascript:melon.link.goArtistDetail('2747971');" title="먼치맨(MUNCHMAN) 페이지 이동" class="ellipsis">먼치맨(MUNCHMAN)</a></li>
												
												<li><a href="javascript:melon.link.goArtistDetail('1703507');" title="Khundi Panda 페이지 이동" class="ellipsis">Khundi Panda</a></li>
												
												<li><a href="javascript:melon.link.goArtistDetail('2745413');" title="머쉬베놈 (MUSHVENOM) 페이지 이동" class="ellipsis">머쉬베놈 (MUSHVENOM)</a></li>
												
											</ul>
										</div>
									</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10521601');" title="쇼미더머니 9 Episode 1 - 페이지 이동">쇼미더머니 9 Episode 1</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="VVS (Feat. JUSTHIS) (Prod. GroovyRoom) 좋아요" data-song-no="33077590" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
185,118</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33077590);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33077590');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33077590', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33077590','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33077234">
						<td><div class="wrap t_right"><input type="checkbox" title="Life Goes On 곡 선택" class="input_check " name="input_check" value="33077234"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10521521');" title="BE" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/21/521/10521521_20201120112220_500.jpg/melon/resize/120/quality/80/optimize" alt="BE - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33077234');" title="Life Goes On 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33077234);" title="Life Goes On 재생">Life Goes On</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10521521');" title="BE - 페이지 이동">BE</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Life Goes On 좋아요" data-song-no="33077234" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
216,766</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33077234);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33077234');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33077234', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33077234','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33359309">
						<td><div class="wrap t_right"><input type="checkbox" title="Off My Face 곡 선택" class="input_check " name="input_check" value="33359309"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10580103');" title="Justice" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/80/103/10580103_20210319132819_500.jpg/melon/resize/120/quality/80/optimize" alt="Justice - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33359309');" title="Off My Face 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33359309);" title="Off My Face 재생">Off My Face</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('420621');" title="Justin Bieber - 페이지 이동">Justin Bieber</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('420621');" title="Justin Bieber - 페이지 이동">Justin Bieber</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10580103');" title="Justice - 페이지 이동">Justice</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Off My Face 좋아요" data-song-no="33359309" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
49,022</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33359309);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33359309');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33359309', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33359309','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="30244931">
						<td><div class="wrap t_right"><input type="checkbox" title="봄날 곡 선택" class="input_check " name="input_check" value="30244931"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10037969');" title="YOU NEVER WALK ALONE" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/100/37/969/10037969_500.jpg/melon/resize/120/quality/80/optimize" alt="YOU NEVER WALK ALONE - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('30244931');" title="봄날 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',30244931);" title="봄날 재생">봄날</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('672375');" title="방탄소년단 - 페이지 이동">방탄소년단</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10037969');" title="YOU NEVER WALK ALONE - 페이지 이동">YOU NEVER WALK ALONE</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="봄날 좋아요" data-song-no="30244931" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
540,226</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',30244931);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('30244931');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '30244931', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '30244931','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33011180">
						<td><div class="wrap t_right"><input type="checkbox" title="나랑 같이 걸을래 (바른연애 길잡이 X 적재) 곡 선택" class="input_check " name="input_check" value="33011180"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10507546');" title="나랑 같이 걸을래 (바른연애 길잡이 X 적재)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/07/546/10507546_20201022162417_500.jpg/melon/resize/120/quality/80/optimize" alt="나랑 같이 걸을래 (바른연애 길잡이 X 적재) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33011180');" title="나랑 같이 걸을래 (바른연애 길잡이 X 적재) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33011180);" title="나랑 같이 걸을래 (바른연애 길잡이 X 적재) 재생">나랑 같이 걸을래 (바른연애 길잡이 X 적재)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('771375');" title="적재 - 페이지 이동">적재</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('771375');" title="적재 - 페이지 이동">적재</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10507546');" title="나랑 같이 걸을래 (바른연애 길잡이 X 적재) - 페이지 이동">나랑 같이 걸을래 (바른연애 길잡이 X 적재)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="나랑 같이 걸을래 (바른연애 길잡이 X 적재) 좋아요" data-song-no="33011180" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
103,585</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33011180);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33011180');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33011180', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33011180','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33107649">
						<td><div class="wrap t_right"><input type="checkbox" title="그날에 나는 맘이 편했을까 곡 선택" class="input_check " name="input_check" value="33107649"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10527955');" title="그날에 나는 맘이 편했을까" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/27/955/10527955_20201202190217_500.jpg/melon/resize/120/quality/80/optimize" alt="그날에 나는 맘이 편했을까 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33107649');" title="그날에 나는 맘이 편했을까 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33107649);" title="그날에 나는 맘이 편했을까 재생">그날에 나는 맘이 편했을까</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('718655');" title="이예준 - 페이지 이동">이예준</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('718655');" title="이예준 - 페이지 이동">이예준</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10527955');" title="그날에 나는 맘이 편했을까 - 페이지 이동">그날에 나는 맘이 편했을까</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="그날에 나는 맘이 편했을까 좋아요" data-song-no="33107649" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
53,467</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33107649);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33107649');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33107649', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33107649','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32003395">
						<td><div class="wrap t_right"><input type="checkbox" title="흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야 곡 선택" class="input_check " name="input_check" value="32003395"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10320500');" title="멜로가 체질 OST Part 3" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/20/500/10320500_500.jpg/melon/resize/120/quality/80/optimize" alt="멜로가 체질 OST Part 3 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32003395');" title="흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32003395);" title="흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야 재생">흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('648551');" title="장범준 - 페이지 이동">장범준</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('648551');" title="장범준 - 페이지 이동">장범준</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10320500');" title="멜로가 체질 OST Part 3 - 페이지 이동">멜로가 체질 OST Part 3</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야 좋아요" data-song-no="32003395" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
288,692</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32003395);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32003395');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32003395', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32003395','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="31029291">
						<td><div class="wrap t_right"><input type="checkbox" title="2002 곡 선택" class="input_check " name="input_check" value="31029291"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10137250');" title="Speak Your Mind (Deluxe)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/101/37/250/10137250_500.jpg/melon/resize/120/quality/80/optimize" alt="Speak Your Mind (Deluxe) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('31029291');" title="2002 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',31029291);" title="2002 재생">2002</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('870307');" title="Anne-Marie - 페이지 이동">Anne-Marie</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('870307');" title="Anne-Marie - 페이지 이동">Anne-Marie</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10137250');" title="Speak Your Mind (Deluxe) - 페이지 이동">Speak Your Mind (Deluxe)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="2002 좋아요" data-song-no="31029291" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
362,340</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',31029291);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('31029291');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '31029291', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '31029291','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="31509376">
						<td><div class="wrap t_right"><input type="checkbox" title="12:45 (Stripped) 곡 선택" class="input_check " name="input_check" value="31509376"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10235362');" title="12:45 (Stripped)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/102/35/362/10235362_500.jpg/melon/resize/120/quality/80/optimize" alt="12:45 (Stripped) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('31509376');" title="12:45 (Stripped) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',31509376);" title="12:45 (Stripped) 재생">12:45 (Stripped)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('1907334');" title="Etham - 페이지 이동">Etham</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('1907334');" title="Etham - 페이지 이동">Etham</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10235362');" title="12:45 (Stripped) - 페이지 이동">12:45 (Stripped)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="12:45 (Stripped) 좋아요" data-song-no="31509376" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
139,184</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',31509376);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('31509376');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '31509376', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '31509376','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32491274">
						<td><div class="wrap t_right"><input type="checkbox" title="아로하 곡 선택" class="input_check " name="input_check" value="32491274"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10409054');" title="슬기로운 의사생활 OST Part 3" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/09/054/10409054_20200326163459_500.jpg/melon/resize/120/quality/80/optimize" alt="슬기로운 의사생활 OST Part 3 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32491274');" title="아로하 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32491274);" title="아로하 재생">아로하</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('253606');" title="조정석 - 페이지 이동">조정석</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('253606');" title="조정석 - 페이지 이동">조정석</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10409054');" title="슬기로운 의사생활 OST Part 3 - 페이지 이동">슬기로운 의사생활 OST Part 3</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="아로하 좋아요" data-song-no="32491274" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
219,042</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32491274);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32491274');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32491274', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32491274','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32224272">
						<td><div class="wrap t_right"><input type="checkbox" title="METEOR 곡 선택" class="input_check " name="input_check" value="32224272"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10359162');" title="Boyhood" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/59/162/10359162_500.jpg/melon/resize/120/quality/80/optimize" alt="Boyhood - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32224272');" title="METEOR 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32224272);" title="METEOR 재생">METEOR</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('774900');" title="창모 (CHANGMO) - 페이지 이동">창모 (CHANGMO)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('774900');" title="창모 (CHANGMO) - 페이지 이동">창모 (CHANGMO)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10359162');" title="Boyhood - 페이지 이동">Boyhood</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="METEOR 좋아요" data-song-no="32224272" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
263,689</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32224272);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32224272');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32224272', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32224272','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="30962526">
						<td><div class="wrap t_right"><input type="checkbox" title="모든 날, 모든 순간 (Every day, Every Moment) 곡 선택" class="input_check " name="input_check" value="30962526"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10149492');" title="'키스 먼저 할까요?' OST Part.3" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/101/49/492/10149492_500.jpg/melon/resize/120/quality/80/optimize" alt="'키스 먼저 할까요?' OST Part.3 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('30962526');" title="모든 날, 모든 순간 (Every day, Every Moment) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',30962526);" title="모든 날, 모든 순간 (Every day, Every Moment) 재생">모든 날, 모든 순간 (Every day, Every Moment)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('752425');" title="폴킴 - 페이지 이동">폴킴</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('752425');" title="폴킴 - 페이지 이동">폴킴</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10149492');" title="'키스 먼저 할까요?' OST Part.3 - 페이지 이동">'키스 먼저 할까요?' OST Part.3</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="모든 날, 모든 순간 (Every day, Every Moment) 좋아요" data-song-no="30962526" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
369,764</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',30962526);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('30962526');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '30962526', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '30962526','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33405149">
						<td><div class="wrap t_right"><input type="checkbox" title="그냥 안아달란 말야 곡 선택" class="input_check " name="input_check" value="33405149"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10590812');" title="그냥 안아달란 말야" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/90/812/10590812_20210412110756_500.jpg/melon/resize/120/quality/80/optimize" alt="그냥 안아달란 말야 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33405149');" title="그냥 안아달란 말야 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33405149);" title="그냥 안아달란 말야 재생">그냥 안아달란 말야</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('236815');" title="다비치 - 페이지 이동">다비치</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('236815');" title="다비치 - 페이지 이동">다비치</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10590812');" title="그냥 안아달란 말야 - 페이지 이동">그냥 안아달란 말야</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="그냥 안아달란 말야 좋아요" data-song-no="33405149" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
37,182</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33405149);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33405149');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33405149', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33405149','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="3894276">
						<td><div class="wrap t_right"><input type="checkbox" title="오래된 노래 곡 선택" class="input_check " name="input_check" value="3894276"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('2148596');" title="오래된 노래" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/021/48/596/2148596_500.jpg/melon/resize/120/quality/80/optimize" alt="오래된 노래 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('3894276');" title="오래된 노래 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',3894276);" title="오래된 노래 재생">오래된 노래</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('467880');" title="스탠딩 에그 - 페이지 이동">스탠딩 에그</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('467880');" title="스탠딩 에그 - 페이지 이동">스탠딩 에그</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('2148596');" title="오래된 노래 - 페이지 이동">오래된 노래</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="오래된 노래 좋아요" data-song-no="3894276" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
228,727</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',3894276);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('3894276');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '3894276', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '3894276','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32224166">
						<td><div class="wrap t_right"><input type="checkbox" title="너의 번호를 누르고 (Prod. 영화처럼) 곡 선택" class="input_check " name="input_check" value="32224166"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10359126');" title="너의 번호를 누르고" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/59/126/10359126_500.jpg/melon/resize/120/quality/80/optimize" alt="너의 번호를 누르고 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32224166');" title="너의 번호를 누르고 (Prod. 영화처럼) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32224166);" title="너의 번호를 누르고 (Prod. 영화처럼) 재생">너의 번호를 누르고 (Prod. 영화처럼)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('1024489');" title="#안녕 - 페이지 이동">#안녕</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('1024489');" title="#안녕 - 페이지 이동">#안녕</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10359126');" title="너의 번호를 누르고 - 페이지 이동">너의 번호를 누르고</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="너의 번호를 누르고 (Prod. 영화처럼) 좋아요" data-song-no="32224166" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
78,545</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32224166);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32224166');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32224166', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '32224166','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32559781">
						<td><div class="wrap t_right"><input type="checkbox" title="살짝 설렜어 (Nonstop) 곡 선택" class="input_check " name="input_check" value="32559781"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10423289');" title="NONSTOP" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/23/289/10423289_20200427153909_500.jpg/melon/resize/120/quality/80/optimize" alt="NONSTOP - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32559781');" title="살짝 설렜어 (Nonstop) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32559781);" title="살짝 설렜어 (Nonstop) 재생">살짝 설렜어 (Nonstop)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('857994');" title="오마이걸 (OH MY GIRL) - 페이지 이동">오마이걸 (OH MY GIRL)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('857994');" title="오마이걸 (OH MY GIRL) - 페이지 이동">오마이걸 (OH MY GIRL)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10423289');" title="NONSTOP - 페이지 이동">NONSTOP</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="살짝 설렜어 (Nonstop) 좋아요" data-song-no="32559781" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
178,770</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32559781);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32559781');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32559781', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32559781','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33229299">
						<td><div class="wrap t_right"><input type="checkbox" title="이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM) 곡 선택" class="input_check " name="input_check" value="33229299"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10552055');" title="이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/52/055/10552055_20210122153304_500.jpg/melon/resize/120/quality/80/optimize" alt="이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33229299');" title="이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33229299);" title="이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM) 재생">이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('468244');" title="10CM - 페이지 이동">10CM</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('468244');" title="10CM - 페이지 이동">10CM</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10552055');" title="이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM) - 페이지 이동">이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM) 좋아요" data-song-no="33229299" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
68,233</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33229299);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33229299');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33229299', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33229299','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32438894">
						<td><div class="wrap t_right"><input type="checkbox" title="어떻게 지내 (Prod. By VAN.C) 곡 선택" class="input_check " name="input_check" value="32438894"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10399190');" title="어떻게 지내" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/99/190/10399190_20200305151138_500.jpg/melon/resize/120/quality/80/optimize" alt="어떻게 지내 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32438894');" title="어떻게 지내 (Prod. By VAN.C) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32438894);" title="어떻게 지내 (Prod. By VAN.C) 재생">어떻게 지내 (Prod. By VAN.C)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('925515');" title="오반 (OVAN) - 페이지 이동">오반 (OVAN)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('925515');" title="오반 (OVAN) - 페이지 이동">오반 (OVAN)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10399190');" title="어떻게 지내 - 페이지 이동">어떻게 지내</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="어떻게 지내 (Prod. By VAN.C) 좋아요" data-song-no="32438894" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
159,821</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32438894);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32438894');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32438894', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32438894','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32055419">
						<td><div class="wrap t_right"><input type="checkbox" title="Memories 곡 선택" class="input_check " name="input_check" value="32055419"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10330593');" title="JORDI (Deluxe)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/30/593/10330593_20210611111519_500.jpg/melon/resize/120/quality/80/optimize" alt="JORDI (Deluxe) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32055419');" title="Memories 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32055419);" title="Memories 재생">Memories</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('107721');" title="Maroon 5 - 페이지 이동">Maroon 5</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('107721');" title="Maroon 5 - 페이지 이동">Maroon 5</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10330593');" title="JORDI (Deluxe) - 페이지 이동">JORDI (Deluxe)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Memories 좋아요" data-song-no="32055419" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
168,440</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32055419);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32055419');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32055419', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32055419','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33571535">
						<td><div class="wrap t_right"><input type="checkbox" title="추적이는 여름 비가 되어 곡 선택" class="input_check " name="input_check" value="33571535"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10625851');" title="장범준 싱글" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/25/851/10625851_20210611140742_500.jpg/melon/resize/120/quality/80/optimize" alt="장범준 싱글 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33571535');" title="추적이는 여름 비가 되어 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33571535);" title="추적이는 여름 비가 되어 재생">추적이는 여름 비가 되어</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('648551');" title="장범준 - 페이지 이동">장범준</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('648551');" title="장범준 - 페이지 이동">장범준</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10625851');" title="장범준 싱글 - 페이지 이동">장범준 싱글</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="추적이는 여름 비가 되어 좋아요" data-song-no="33571535" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
16,367</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33571535);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33571535');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33571535', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33571535','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="31853557">
						<td><div class="wrap t_right"><input type="checkbox" title="오늘도 빛나는 너에게 (To You My Light) (Feat.이라온) 곡 선택" class="input_check " name="input_check" value="31853557"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10294603');" title="Red Moon : To You My Light" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/102/94/603/10294603_500.jpg/melon/resize/120/quality/80/optimize" alt="Red Moon : To You My Light - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('31853557');" title="오늘도 빛나는 너에게 (To You My Light) (Feat.이라온) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',31853557);" title="오늘도 빛나는 너에게 (To You My Light) (Feat.이라온) 재생">오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('566431');" title="마크툽 (MAKTUB) - 페이지 이동">마크툽 (MAKTUB)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('566431');" title="마크툽 (MAKTUB) - 페이지 이동">마크툽 (MAKTUB)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10294603');" title="Red Moon : To You My Light - 페이지 이동">Red Moon : To You My Light</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="오늘도 빛나는 너에게 (To You My Light) (Feat.이라온) 좋아요" data-song-no="31853557" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
239,176</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',31853557);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('31853557');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '31853557', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '31853557','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32525311">
						<td><div class="wrap t_right"><input type="checkbox" title="사실 나는 (Feat.전건호) 곡 선택" class="input_check " name="input_check" value="32525311"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10416034');" title="사실 나는" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/16/034/10416034_20200410161209_500.jpg/melon/resize/120/quality/80/optimize" alt="사실 나는 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32525311');" title="사실 나는 (Feat.전건호) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32525311);" title="사실 나는 (Feat.전건호) 재생">사실 나는 (Feat.전건호)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2863470');" title="경서예지 - 페이지 이동">경서예지</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2863470');" title="경서예지 - 페이지 이동">경서예지</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10416034');" title="사실 나는 - 페이지 이동">사실 나는</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="사실 나는 (Feat.전건호) 좋아요" data-song-no="32525311" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
75,435</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32525311);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32525311');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32525311', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32525311','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33510308">
						<td><div class="wrap t_right"><input type="checkbox" title="체념 곡 선택" class="input_check " name="input_check" value="33510308"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10613163');" title="MSG워너비 TOP 8 경연곡" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/13/163/10613163_20210521172906_500.jpg/melon/resize/120/quality/80/optimize" alt="MSG워너비 TOP 8 경연곡 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33510308');" title="체념 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33510308);" title="체념 재생">체념</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2939210');" title="정상동기 (김정수, 정기석, 이동휘, 이상이) - 페이지 이동">정상동기 (김정수, 정기석, 이동휘, 이상이)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2939210');" title="정상동기 (김정수, 정기석, 이동휘, 이상이) - 페이지 이동">정상동기 (김정수, 정기석, 이동휘, 이상이)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10613163');" title="MSG워너비 TOP 8 경연곡 - 페이지 이동">MSG워너비 TOP 8 경연곡</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="체념 좋아요" data-song-no="33510308" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
18,522</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33510308);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33510308');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33510308', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33510308','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32156286">
						<td><div class="wrap t_right"><input type="checkbox" title="늦은 밤 너의 집 앞 골목길에서 곡 선택" class="input_check " name="input_check" value="32156286"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10348811');" title="늦은 밤 너의 집 앞 골목길에서" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/48/811/10348811_500.jpg/melon/resize/120/quality/80/optimize" alt="늦은 밤 너의 집 앞 골목길에서 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32156286');" title="늦은 밤 너의 집 앞 골목길에서 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32156286);" title="늦은 밤 너의 집 앞 골목길에서 재생">늦은 밤 너의 집 앞 골목길에서</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('105623');" title="노을 - 페이지 이동">노을</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('105623');" title="노을 - 페이지 이동">노을</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10348811');" title="늦은 밤 너의 집 앞 골목길에서 - 페이지 이동">늦은 밤 너의 집 앞 골목길에서</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="늦은 밤 너의 집 앞 골목길에서 좋아요" data-song-no="32156286" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
181,958</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32156286);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32156286');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32156286', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32156286','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33572275">
						<td><div class="wrap t_right"><input type="checkbox" title="오늘따라 더 미운 그대가 곡 선택" class="input_check " name="input_check" value="33572275"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10626157');" title="오늘따라 더 미운 그대가" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/26/157/10626157_20210611165757_500.jpg/melon/resize/120/quality/80/optimize" alt="오늘따라 더 미운 그대가 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33572275');" title="오늘따라 더 미운 그대가 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33572275);" title="오늘따라 더 미운 그대가 재생">오늘따라 더 미운 그대가</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('979724');" title="전상근 - 페이지 이동">전상근</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('979724');" title="전상근 - 페이지 이동">전상근</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10626157');" title="오늘따라 더 미운 그대가 - 페이지 이동">오늘따라 더 미운 그대가</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="오늘따라 더 미운 그대가 좋아요" data-song-no="33572275" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
12,065</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33572275);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33572275');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33572275', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33572275','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32720013">
						<td><div class="wrap t_right"><input type="checkbox" title="How You Like That 곡 선택" class="input_check " name="input_check" value="32720013"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10451566');" title="How You Like That" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/51/566/10451566_20200626114914_500.jpg/melon/resize/120/quality/80/optimize" alt="How You Like That - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32720013');" title="How You Like That 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32720013);" title="How You Like That 재생">How You Like That</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('995169');" title="BLACKPINK - 페이지 이동">BLACKPINK</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('995169');" title="BLACKPINK - 페이지 이동">BLACKPINK</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10451566');" title="How You Like That - 페이지 이동">How You Like That</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="How You Like That 좋아요" data-song-no="32720013" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
178,860</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32720013);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32720013');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32720013', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32720013','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32998018">
						<td><div class="wrap t_right"><input type="checkbox" title="힘든 건 사랑이 아니다 곡 선택" class="input_check " name="input_check" value="32998018"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10505118');" title="힘든 건 사랑이 아니다" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/05/118/10505118_20201019112710_500.jpg/melon/resize/120/quality/80/optimize" alt="힘든 건 사랑이 아니다 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32998018');" title="힘든 건 사랑이 아니다 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32998018);" title="힘든 건 사랑이 아니다 재생">힘든 건 사랑이 아니다</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('1142');" title="임창정 - 페이지 이동">임창정</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('1142');" title="임창정 - 페이지 이동">임창정</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10505118');" title="힘든 건 사랑이 아니다 - 페이지 이동">힘든 건 사랑이 아니다</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="힘든 건 사랑이 아니다 좋아요" data-song-no="32998018" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
104,970</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32998018);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32998018');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32998018', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32998018','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33347390">
						<td><div class="wrap t_right"><input type="checkbox" title="이렇게 좋아해 본 적이 없어요 곡 선택" class="input_check " name="input_check" value="33347390"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10577197');" title="이렇게 좋아해 본 적이 없어요 (소녀의 세계 X CHEEZE(치즈))" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/77/197/10577197_20210312160109_500.jpg/melon/resize/120/quality/80/optimize" alt="이렇게 좋아해 본 적이 없어요 (소녀의 세계 X CHEEZE(치즈)) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33347390');" title="이렇게 좋아해 본 적이 없어요 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33347390);" title="이렇게 좋아해 본 적이 없어요 재생">이렇게 좋아해 본 적이 없어요</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('597191');" title="CHEEZE (치즈) - 페이지 이동">CHEEZE (치즈)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('597191');" title="CHEEZE (치즈) - 페이지 이동">CHEEZE (치즈)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10577197');" title="이렇게 좋아해 본 적이 없어요 (소녀의 세계 X CHEEZE(치즈)) - 페이지 이동">이렇게 좋아해 본 적이 없어요 (소녀의 세계 X CHEEZE(치즈))</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="이렇게 좋아해 본 적이 없어요 좋아요" data-song-no="33347390" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
44,415</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33347390);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33347390');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33347390', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33347390','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="711626">
						<td><div class="wrap t_right"><input type="checkbox" title="살다가 곡 선택" class="input_check " name="input_check" value="711626"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('50578');" title="살다가" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/000/50/578/50578_500.jpg/melon/resize/120/quality/80/optimize" alt="살다가 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('711626');" title="살다가 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',711626);" title="살다가 재생">살다가</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('108363');" title="SG 워너비 - 페이지 이동">SG 워너비</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('108363');" title="SG 워너비 - 페이지 이동">SG 워너비</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('50578');" title="살다가 - 페이지 이동">살다가</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="살다가 좋아요" data-song-no="711626" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
67,336</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',711626);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('711626');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '711626', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '711626','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33601086">
						<td><div class="wrap t_right"><input type="checkbox" title="허리춤 곡 선택" class="input_check " name="input_check" value="33601086"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10632920');" title="허리춤" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/32/920/10632920_20210621135204_500.jpg/melon/resize/120/quality/80/optimize" alt="허리춤 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33601086');" title="허리춤 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33601086);" title="허리춤 재생">허리춤</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('925515');" title="오반 (OVAN) - 페이지 이동">오반 (OVAN)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('925515');" title="오반 (OVAN) - 페이지 이동">오반 (OVAN)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10632920');" title="허리춤 - 페이지 이동">허리춤</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="허리춤 좋아요" data-song-no="33601086" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
7,599</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33601086);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33601086');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33601086', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33601086','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="31979846">
						<td><div class="wrap t_right"><input type="checkbox" title="Dance Monkey 곡 선택" class="input_check " name="input_check" value="31979846"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10316394');" title="The Kids Are Coming" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/16/394/10316394_500.jpg/melon/resize/120/quality/80/optimize" alt="The Kids Are Coming - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('31979846');" title="Dance Monkey 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',31979846);" title="Dance Monkey 재생">Dance Monkey</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2742009');" title="Tones And I - 페이지 이동">Tones And I</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2742009');" title="Tones And I - 페이지 이동">Tones And I</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10316394');" title="The Kids Are Coming - 페이지 이동">The Kids Are Coming</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Dance Monkey 좋아요" data-song-no="31979846" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
158,576</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',31979846);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('31979846');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '31979846', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '31979846','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32378104">
						<td><div class="wrap t_right"><input type="checkbox" title="마음을 드려요 곡 선택" class="input_check " name="input_check" value="32378104"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10388744');" title="사랑의 불시착 OST Part 11" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/88/744/10388744_20200214175740_500.jpg/melon/resize/120/quality/80/optimize" alt="사랑의 불시착 OST Part 11 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32378104');" title="마음을 드려요 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32378104);" title="마음을 드려요 재생">마음을 드려요</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10388744');" title="사랑의 불시착 OST Part 11 - 페이지 이동">사랑의 불시착 OST Part 11</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="마음을 드려요 좋아요" data-song-no="32378104" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
209,182</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32378104);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32378104');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32378104', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '32378104','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32508053">
						<td><div class="wrap t_right"><input type="checkbox" title="이제 나만 믿어요 곡 선택" class="input_check " name="input_check" value="32508053"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10412319');" title="내일은 미스터트롯 우승자 특전곡" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/12/319/10412319_20200403103006_500.jpg/melon/resize/120/quality/80/optimize" alt="내일은 미스터트롯 우승자 특전곡 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32508053');" title="이제 나만 믿어요 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32508053);" title="이제 나만 믿어요 재생">이제 나만 믿어요</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('994944');" title="임영웅 - 페이지 이동">임영웅</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('994944');" title="임영웅 - 페이지 이동">임영웅</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10412319');" title="내일은 미스터트롯 우승자 특전곡 - 페이지 이동">내일은 미스터트롯 우승자 특전곡</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="이제 나만 믿어요 좋아요" data-song-no="32508053" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
130,659</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32508053);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32508053');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32508053', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '32508053','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33439096">
						<td><div class="wrap t_right"><input type="checkbox" title="너의 발걸음에 빛을 비춰줄게 (Prod. 조영수) 곡 선택" class="input_check " name="input_check" value="33439096"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10598763');" title="너의 발걸음에 빛을 비춰줄게 (Prod. 조영수)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/98/763/10598763_20210427122744_500.jpg/melon/resize/120/quality/80/optimize" alt="너의 발걸음에 빛을 비춰줄게 (Prod. 조영수) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33439096');" title="너의 발걸음에 빛을 비춰줄게 (Prod. 조영수) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33439096);" title="너의 발걸음에 빛을 비춰줄게 (Prod. 조영수) 재생">너의 발걸음에 빛을 비춰줄게 (Prod. 조영수)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('858125');" title="케이시 (Kassy) - 페이지 이동">케이시 (Kassy)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('858125');" title="케이시 (Kassy) - 페이지 이동">케이시 (Kassy)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10598763');" title="너의 발걸음에 빛을 비춰줄게 (Prod. 조영수) - 페이지 이동">너의 발걸음에 빛을 비춰줄게 (Prod. 조영수)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="너의 발걸음에 빛을 비춰줄게 (Prod. 조영수) 좋아요" data-song-no="33439096" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
24,979</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33439096);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33439096');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33439096', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33439096','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33496587">
						<td><div class="wrap t_right"><input type="checkbox" title="다정히 내 이름을 부르면 곡 선택" class="input_check " name="input_check" value="33496587"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10610525');" title="다정히 내 이름을 부르면 (경서예지 x 전건호)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/10/525/10610525_20210518143433_500.jpg/melon/resize/120/quality/80/optimize" alt="다정히 내 이름을 부르면 (경서예지 x 전건호) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33496587');" title="다정히 내 이름을 부르면 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33496587);" title="다정히 내 이름을 부르면 재생">다정히 내 이름을 부르면</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2863470');" title="경서예지 - 페이지 이동">경서예지</a>, <a href="javascript:melon.link.goArtistDetail('2739011');" title="전건호 - 페이지 이동">전건호</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2863470');" title="경서예지 - 페이지 이동">경서예지</a>, <a href="javascript:melon.link.goArtistDetail('2739011');" title="전건호 - 페이지 이동">전건호</a></span>
								</div>
								
									<div class="wrap_atist" style="display:none;">
										<button type="button" title="아티스트 더보기" class="button_icons etc more_down" data-control="dropdown"><span class="none">아티스트명 더보기</span></button>
										<div class="atist_view" style="display:none;">
											<ul>
												
												<li><a href="javascript:melon.link.goArtistDetail('2863470');" title="경서예지 페이지 이동" class="ellipsis">경서예지</a></li>
												
												<li><a href="javascript:melon.link.goArtistDetail('2739011');" title="전건호 페이지 이동" class="ellipsis">전건호</a></li>
												
											</ul>
										</div>
									</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10610525');" title="다정히 내 이름을 부르면 (경서예지 x 전건호) - 페이지 이동">다정히 내 이름을 부르면 (경서예지 x 전건호)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="다정히 내 이름을 부르면 좋아요" data-song-no="33496587" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
19,177</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33496587);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33496587');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33496587', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33496587','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32143487">
						<td><div class="wrap t_right"><input type="checkbox" title="Love poem 곡 선택" class="input_check " name="input_check" value="32143487"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10346650');" title="Love poem" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/46/650/10346650_500.jpg/melon/resize/120/quality/80/optimize" alt="Love poem - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32143487');" title="Love poem 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32143487);" title="Love poem 재생">Love poem</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10346650');" title="Love poem - 페이지 이동">Love poem</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Love poem 좋아요" data-song-no="32143487" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
304,033</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32143487);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32143487');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32143487', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '32143487','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="31388145">
						<td><div class="wrap t_right"><input type="checkbox" title="너를 만나 곡 선택" class="input_check " name="input_check" value="31388145"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10217134');" title="너를 만나" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/102/17/134/10217134_500.jpg/melon/resize/120/quality/80/optimize" alt="너를 만나 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('31388145');" title="너를 만나 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',31388145);" title="너를 만나 재생">너를 만나</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('752425');" title="폴킴 - 페이지 이동">폴킴</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('752425');" title="폴킴 - 페이지 이동">폴킴</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10217134');" title="너를 만나 - 페이지 이동">너를 만나</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="너를 만나 좋아요" data-song-no="31388145" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
289,523</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',31388145);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('31388145');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '31388145', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '31388145','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="31341518">
						<td><div class="wrap t_right"><input type="checkbox" title="Paris In The Rain 곡 선택" class="input_check " name="input_check" value="31341518"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10209752');" title="I met you when I was 18. (the playlist)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/102/09/752/10209752_500.jpg/melon/resize/120/quality/80/optimize" alt="I met you when I was 18. (the playlist) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('31341518');" title="Paris In The Rain 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',31341518);" title="Paris In The Rain 재생">Paris In The Rain</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('1956543');" title="Lauv - 페이지 이동">Lauv</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('1956543');" title="Lauv - 페이지 이동">Lauv</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10209752');" title="I met you when I was 18. (the playlist) - 페이지 이동">I met you when I was 18. (the playlist)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Paris In The Rain 좋아요" data-song-no="31341518" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
254,956</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',31341518);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('31341518');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '31341518', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '31341518','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32871975">
						<td><div class="wrap t_right"><input type="checkbox" title="내 마음이 움찔했던 순간 (취향저격 그녀 X 규현) 곡 선택" class="input_check " name="input_check" value="32871975"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10478925');" title="내 마음이 움찔했던 순간 (취향저격 그녀 X 규현)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/78/925/10478925_20200820171048_500.jpg/melon/resize/120/quality/80/optimize" alt="내 마음이 움찔했던 순간 (취향저격 그녀 X 규현) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32871975');" title="내 마음이 움찔했던 순간 (취향저격 그녀 X 규현) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32871975);" title="내 마음이 움찔했던 순간 (취향저격 그녀 X 규현) 재생">내 마음이 움찔했던 순간 (취향저격 그녀 X 규현)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('205880');" title="규현 (KYUHYUN) - 페이지 이동">규현 (KYUHYUN)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('205880');" title="규현 (KYUHYUN) - 페이지 이동">규현 (KYUHYUN)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10478925');" title="내 마음이 움찔했던 순간 (취향저격 그녀 X 규현) - 페이지 이동">내 마음이 움찔했던 순간 (취향저격 그녀 X 규현)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="내 마음이 움찔했던 순간 (취향저격 그녀 X 규현) 좋아요" data-song-no="32871975" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
105,412</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32871975);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32871975');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32871975', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '32871975','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33372787">
						<td><div class="wrap t_right"><input type="checkbox" title="아이와 나의 바다 곡 선택" class="input_check " name="input_check" value="33372787"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC'" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/54/246/10554246_20210325161233_500.jpg/melon/resize/120/quality/80/optimize" alt="IU 5th Album 'LILAC' - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33372787');" title="아이와 나의 바다 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33372787);" title="아이와 나의 바다 재생">아이와 나의 바다</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC' - 페이지 이동">IU 5th Album 'LILAC'</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="아이와 나의 바다 좋아요" data-song-no="33372787" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
91,986</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33372787);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33372787');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33372787', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33372787','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32853712">
						<td><div class="wrap t_right"><input type="checkbox" title="When We Disco (Duet with 선미) 곡 선택" class="input_check " name="input_check" value="32853712"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10475061');" title="When We Disco" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/75/061/10475061_20200812120927_500.jpg/melon/resize/120/quality/80/optimize" alt="When We Disco - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32853712');" title="When We Disco (Duet with 선미) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32853712);" title="When We Disco (Duet with 선미) 재생">When We Disco (Duet with 선미)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('1130');" title="박진영 - 페이지 이동">박진영</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('1130');" title="박진영 - 페이지 이동">박진영</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10475061');" title="When We Disco - 페이지 이동">When We Disco</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="When We Disco (Duet with 선미) 좋아요" data-song-no="32853712" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
78,598</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32853712);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32853712');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32853712', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32853712','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33164083">
						<td><div class="wrap t_right"><input type="checkbox" title="우린 어쩌다 헤어진 걸까 곡 선택" class="input_check " name="input_check" value="33164083"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10539679');" title="Hello" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/39/679/10539679_20201228153155_500.jpg/melon/resize/120/quality/80/optimize" alt="Hello - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33164083');" title="우린 어쩌다 헤어진 걸까 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33164083);" title="우린 어쩌다 헤어진 걸까 재생">우린 어쩌다 헤어진 걸까</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('28801');" title="허각 - 페이지 이동">허각</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('28801');" title="허각 - 페이지 이동">허각</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10539679');" title="Hello - 페이지 이동">Hello</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="우린 어쩌다 헤어진 걸까 좋아요" data-song-no="33164083" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
34,005</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33164083);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33164083');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33164083', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33164083','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32345931">
						<td><div class="wrap t_right"><input type="checkbox" title="시작 곡 선택" class="input_check " name="input_check" value="32345931"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10381712');" title="이태원 클라쓰 OST Part.2" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/81/712/10381712_20200131110358_500.jpg/melon/resize/120/quality/80/optimize" alt="이태원 클라쓰 OST Part.2 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32345931');" title="시작 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32345931);" title="시작 재생">시작</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('13494');" title="가호 (Gaho) - 페이지 이동">가호 (Gaho)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('13494');" title="가호 (Gaho) - 페이지 이동">가호 (Gaho)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10381712');" title="이태원 클라쓰 OST Part.2 - 페이지 이동">이태원 클라쓰 OST Part.2</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="시작 좋아요" data-song-no="32345931" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
214,342</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32345931);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32345931');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32345931', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32345931','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33508682">
						<td><div class="wrap t_right"><input type="checkbox" title="If You Love Me (Feat. 주헌 (몬스타엑스)) 곡 선택" class="input_check " name="input_check" value="33508682"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10612888');" title="If You Love Me (Feat. 주헌 (몬스타엑스))" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/12/888/10612888_20210521150219_500.jpg/melon/resize/120/quality/80/optimize" alt="If You Love Me (Feat. 주헌 (몬스타엑스)) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33508682');" title="If You Love Me (Feat. 주헌 (몬스타엑스)) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33508682);" title="If You Love Me (Feat. 주헌 (몬스타엑스)) 재생">If You Love Me (Feat. 주헌 (몬스타엑스))</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('433746');" title="NS 윤지 - 페이지 이동">NS 윤지</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('433746');" title="NS 윤지 - 페이지 이동">NS 윤지</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10612888');" title="If You Love Me (Feat. 주헌 (몬스타엑스)) - 페이지 이동">If You Love Me (Feat. 주헌 (몬스타엑스))</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="If You Love Me (Feat. 주헌 (몬스타엑스)) 좋아요" data-song-no="33508682" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
21,026</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33508682);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33508682');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33508682', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33508682','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32187544">
						<td><div class="wrap t_right"><input type="checkbox" title="우리 왜 헤어져야 해 곡 선택" class="input_check " name="input_check" value="32187544"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10353881');" title="우리 왜 헤어져야 해" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/53/881/10353881_500.jpg/melon/resize/120/quality/80/optimize" alt="우리 왜 헤어져야 해 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32187544');" title="우리 왜 헤어져야 해 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32187544);" title="우리 왜 헤어져야 해 재생">우리 왜 헤어져야 해</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2740042');" title="신예영 - 페이지 이동">신예영</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2740042');" title="신예영 - 페이지 이동">신예영</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10353881');" title="우리 왜 헤어져야 해 - 페이지 이동">우리 왜 헤어져야 해</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="우리 왜 헤어져야 해 좋아요" data-song-no="32187544" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
110,255</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32187544);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32187544');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32187544', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32187544','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33260801">
						<td><div class="wrap t_right"><input type="checkbox" title="고백 (바른연애 길잡이 X 허각) 곡 선택" class="input_check " name="input_check" value="33260801"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10559322');" title="고백 (바른연애 길잡이 X 허각)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/59/322/10559322_20210204121013_500.jpg/melon/resize/120/quality/80/optimize" alt="고백 (바른연애 길잡이 X 허각) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33260801');" title="고백 (바른연애 길잡이 X 허각) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33260801);" title="고백 (바른연애 길잡이 X 허각) 재생">고백 (바른연애 길잡이 X 허각)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('28801');" title="허각 - 페이지 이동">허각</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('28801');" title="허각 - 페이지 이동">허각</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10559322');" title="고백 (바른연애 길잡이 X 허각) - 페이지 이동">고백 (바른연애 길잡이 X 허각)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="고백 (바른연애 길잡이 X 허각) 좋아요" data-song-no="33260801" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
36,297</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33260801);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33260801');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33260801', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33260801','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32137576">
						<td><div class="wrap t_right"><input type="checkbox" title="Don't Start Now 곡 선택" class="input_check " name="input_check" value="32137576"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10345880');" title="Future Nostalgia" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/45/880/10345880_20200326181909_500.jpg/melon/resize/120/quality/80/optimize" alt="Future Nostalgia - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32137576');" title="Don't Start Now 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32137576);" title="Don't Start Now 재생">Don't Start Now</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('889721');" title="Dua Lipa - 페이지 이동">Dua Lipa</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('889721');" title="Dua Lipa - 페이지 이동">Dua Lipa</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10345880');" title="Future Nostalgia - 페이지 이동">Future Nostalgia</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Don't Start Now 좋아요" data-song-no="32137576" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
140,660</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32137576);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32137576');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32137576', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32137576','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="30773554">
						<td><div class="wrap t_right"><input type="checkbox" title="Downtown Baby 곡 선택" class="input_check " name="input_check" value="30773554"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10117789');" title="Downtown Baby" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm/album/images/101/17/789/10117789_500.jpg/melon/resize/120/quality/80/optimize" alt="Downtown Baby - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('30773554');" title="Downtown Baby 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',30773554);" title="Downtown Baby 재생">Downtown Baby</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('980594');" title="블루 (BLOO) - 페이지 이동">블루 (BLOO)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('980594');" title="블루 (BLOO) - 페이지 이동">블루 (BLOO)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10117789');" title="Downtown Baby - 페이지 이동">Downtown Baby</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Downtown Baby 좋아요" data-song-no="30773554" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
188,265</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',30773554);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('30773554');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '30773554', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '30773554','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33594897">
						<td><div class="wrap t_right"><input type="checkbox" title="Ready to love 곡 선택" class="input_check " name="input_check" value="33594897"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10632044');" title="SEVENTEEN 8th Mini Album 'Your Choice'" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/32/044/10632044_20210618114846_500.jpg/melon/resize/120/quality/80/optimize" alt="SEVENTEEN 8th Mini Album 'Your Choice' - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33594897');" title="Ready to love 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33594897);" title="Ready to love 재생">Ready to love</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('861436');" title="세븐틴 - 페이지 이동">세븐틴</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('861436');" title="세븐틴 - 페이지 이동">세븐틴</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10632044');" title="SEVENTEEN 8th Mini Album 'Your Choice' - 페이지 이동">SEVENTEEN 8th Mini Album 'Your Choice'</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Ready to love 좋아요" data-song-no="33594897" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
50,156</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33594897);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33594897');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33594897', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33594897','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="31984204">
						<td><div class="wrap t_right"><input type="checkbox" title="안녕 곡 선택" class="input_check " name="input_check" value="31984204"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10317137');" title="호텔 델루나 OST Part.10" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/17/137/10317137_500.jpg/melon/resize/120/quality/80/optimize" alt="호텔 델루나 OST Part.10 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('31984204');" title="안녕 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',31984204);" title="안녕 재생">안녕</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('752425');" title="폴킴 - 페이지 이동">폴킴</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('752425');" title="폴킴 - 페이지 이동">폴킴</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10317137');" title="호텔 델루나 OST Part.10 - 페이지 이동">호텔 델루나 OST Part.10</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="안녕 좋아요" data-song-no="31984204" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
191,985</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',31984204);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('31984204');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '31984204', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '31984204','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33295747">
						<td><div class="wrap t_right"><input type="checkbox" title="함께 했는데 이별은 나 혼자인 거야 곡 선택" class="input_check " name="input_check" value="33295747"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10566182');" title="함께 했는데 이별은 나 혼자인 거야" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/66/182/10566182_20210218105811_500.jpg/melon/resize/120/quality/80/optimize" alt="함께 했는데 이별은 나 혼자인 거야 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33295747');" title="함께 했는데 이별은 나 혼자인 거야 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33295747);" title="함께 했는데 이별은 나 혼자인 거야 재생">함께 했는데 이별은 나 혼자인 거야</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('661792');" title="소정 (레이디스 코드) - 페이지 이동">소정 (레이디스 코드)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('661792');" title="소정 (레이디스 코드) - 페이지 이동">소정 (레이디스 코드)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10566182');" title="함께 했는데 이별은 나 혼자인 거야 - 페이지 이동">함께 했는데 이별은 나 혼자인 거야</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="함께 했는데 이별은 나 혼자인 거야 좋아요" data-song-no="33295747" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
36,397</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33295747);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33295747');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33295747', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33295747','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32122539">
						<td><div class="wrap t_right"><input type="checkbox" title="Maniac 곡 선택" class="input_check " name="input_check" value="32122539"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10343276');" title="Maniac" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/103/43/276/10343276_500.jpg/melon/resize/120/quality/80/optimize" alt="Maniac - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32122539');" title="Maniac 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32122539);" title="Maniac 재생">Maniac</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2398189');" title="Conan Gray - 페이지 이동">Conan Gray</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2398189');" title="Conan Gray - 페이지 이동">Conan Gray</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10343276');" title="Maniac - 페이지 이동">Maniac</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="Maniac 좋아요" data-song-no="32122539" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
131,762</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32122539);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32122539');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32122539', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32122539','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33430095">
						<td><div class="wrap t_right"><input type="checkbox" title="기다릴게 곡 선택" class="input_check " name="input_check" value="33430095"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10596629');" title="기다릴게" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/96/629/10596629_20210422104238_500.jpg/melon/resize/120/quality/80/optimize" alt="기다릴게 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33430095');" title="기다릴게 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33430095);" title="기다릴게 재생">기다릴게</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('43806');" title="하동균 - 페이지 이동">하동균</a>, <a href="javascript:melon.link.goArtistDetail('500423');" title="봉구 - 페이지 이동">봉구</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('43806');" title="하동균 - 페이지 이동">하동균</a>, <a href="javascript:melon.link.goArtistDetail('500423');" title="봉구 - 페이지 이동">봉구</a></span>
								</div>
								
									<div class="wrap_atist" style="display:none;">
										<button type="button" title="아티스트 더보기" class="button_icons etc more_down" data-control="dropdown"><span class="none">아티스트명 더보기</span></button>
										<div class="atist_view" style="display:none;">
											<ul>
												
												<li><a href="javascript:melon.link.goArtistDetail('43806');" title="하동균 페이지 이동" class="ellipsis">하동균</a></li>
												
												<li><a href="javascript:melon.link.goArtistDetail('500423');" title="봉구 페이지 이동" class="ellipsis">봉구</a></li>
												
											</ul>
										</div>
									</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10596629');" title="기다릴게 - 페이지 이동">기다릴게</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="기다릴게 좋아요" data-song-no="33430095" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
20,169</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33430095);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33430095');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33430095', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33430095','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33372784">
						<td><div class="wrap t_right"><input type="checkbox" title="봄 안녕 봄 곡 선택" class="input_check " name="input_check" value="33372784"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC'" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/54/246/10554246_20210325161233_500.jpg/melon/resize/120/quality/80/optimize" alt="IU 5th Album 'LILAC' - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33372784');" title="봄 안녕 봄 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33372784);" title="봄 안녕 봄 재생">봄 안녕 봄</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('261143');" title="아이유 - 페이지 이동">아이유</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10554246');" title="IU 5th Album 'LILAC' - 페이지 이동">IU 5th Album 'LILAC'</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="봄 안녕 봄 좋아요" data-song-no="33372784" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
66,896</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33372784);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33372784');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33372784', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33372784','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="32777869">
						<td><div class="wrap t_right"><input type="checkbox" title="거짓말이라도 해서 널 보고싶어 곡 선택" class="input_check " name="input_check" value="32777869"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10460544');" title="거짓말이라도 해서 널 보고싶어" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/104/60/544/10460544_20200714151651_500.jpg/melon/resize/120/quality/80/optimize" alt="거짓말이라도 해서 널 보고싶어 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('32777869');" title="거짓말이라도 해서 널 보고싶어 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',32777869);" title="거짓말이라도 해서 널 보고싶어 재생">거짓말이라도 해서 널 보고싶어</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('1118');" title="백지영 - 페이지 이동">백지영</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('1118');" title="백지영 - 페이지 이동">백지영</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10460544');" title="거짓말이라도 해서 널 보고싶어 - 페이지 이동">거짓말이라도 해서 널 보고싶어</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="거짓말이라도 해서 널 보고싶어 좋아요" data-song-no="32777869" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
66,085</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',32777869);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('32777869');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '32777869', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '32777869','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33476728">
						<td><div class="wrap t_right"><input type="checkbox" title="서울의 잠 못 이루는 밤 (Feat. 이수현) 곡 선택" class="input_check " name="input_check" value="33476728"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10606892');" title="5.2 (Feat. 이수현)" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/06/892/10606892_20210513100549_500.jpg/melon/resize/120/quality/80/optimize" alt="5.2 (Feat. 이수현) - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33476728');" title="서울의 잠 못 이루는 밤 (Feat. 이수현) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33476728);" title="서울의 잠 못 이루는 밤 (Feat. 이수현) 재생">서울의 잠 못 이루는 밤 (Feat. 이수현)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('468244');" title="10CM - 페이지 이동">10CM</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('468244');" title="10CM - 페이지 이동">10CM</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10606892');" title="5.2 (Feat. 이수현) - 페이지 이동">5.2 (Feat. 이수현)</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="서울의 잠 못 이루는 밤 (Feat. 이수현) 좋아요" data-song-no="33476728" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
30,018</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33476728);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33476728');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33476728', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33476728','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33115807">
						<td><div class="wrap t_right"><input type="checkbox" title="내일이 오면 (Feat. 기리보이, BIG Naughty (서동현)) 곡 선택" class="input_check " name="input_check" value="33115807"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10529161');" title="쇼미더머니 9 Episode 3" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/105/29/161/10529161_20201204130014_500.jpg/melon/resize/120/quality/80/optimize" alt="쇼미더머니 9 Episode 3 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33115807');" title="내일이 오면 (Feat. 기리보이, BIG Naughty (서동현)) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33115807);" title="내일이 오면 (Feat. 기리보이, BIG Naughty (서동현)) 재생">내일이 오면 (Feat. 기리보이, BIG Naughty (서동현))</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('623251');" title="릴보이 (lIlBOI) - 페이지 이동">릴보이 (lIlBOI)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('623251');" title="릴보이 (lIlBOI) - 페이지 이동">릴보이 (lIlBOI)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10529161');" title="쇼미더머니 9 Episode 3 - 페이지 이동">쇼미더머니 9 Episode 3</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="내일이 오면 (Feat. 기리보이, BIG Naughty (서동현)) 좋아요" data-song-no="33115807" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
106,029</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33115807);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33115807');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33115807', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33115807','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33456218">
						<td><div class="wrap t_right"><input type="checkbox" title="맛 (Hot Sauce) 곡 선택" class="input_check " name="input_check" value="33456218"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10602760');" title="맛 (Hot Sauce) - The 1st Album" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/02/760/10602760_20210510153709_500.jpg/melon/resize/120/quality/80/optimize" alt="맛 (Hot Sauce) - The 1st Album - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33456218');" title="맛 (Hot Sauce) 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33456218);" title="맛 (Hot Sauce) 재생">맛 (Hot Sauce)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('1066419');" title="NCT DREAM - 페이지 이동">NCT DREAM</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('1066419');" title="NCT DREAM - 페이지 이동">NCT DREAM</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10602760');" title="맛 (Hot Sauce) - The 1st Album - 페이지 이동">맛 (Hot Sauce) - The 1st Album</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="맛 (Hot Sauce) 좋아요" data-song-no="33456218" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
103,518</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33456218);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33456218');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33456218', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video " onclick="melon.link.goMvDetail('19030101', '33456218','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
<tr data-song-no="33510309">
						<td><div class="wrap t_right"><input type="checkbox" title="만약에 곡 선택" class="input_check " name="input_check" value="33510309"></div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goAlbumDetail('10613163');" title="MSG워너비 TOP 8 경연곡" class="image_typeAll">
								<img onerror="WEBPOCIMG.defaultAlbumImg(this);" width="60" height="60" src="https://cdnimg.melon.co.kr/cm2/album/images/106/13/163/10613163_20210521172906_500.jpg/melon/resize/120/quality/80/optimize" alt="MSG워너비 TOP 8 경연곡 - 페이지 이동">
								<span class="bg_album_frame"></span>
							</a>
						</div></td>
						<td><div class="wrap">
							<a href="javascript:melon.link.goSongDetail('33510309');" title="만약에 곡정보" class="btn button_icons type03 song_info"><span class="none">곡정보</span></a>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									
									
									
									
									
									
									
									
									<a href="javascript:melon.play.playSong('19030101',33510309);" title="만약에 재생">만약에</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('2939212');" title="M.O.M (별루지, 강창모, 박재정, 원슈타인) - 페이지 이동">M.O.M (별루지, 강창모, 박재정, 원슈타인)</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('2939212');" title="M.O.M (별루지, 강창모, 박재정, 원슈타인) - 페이지 이동">M.O.M (별루지, 강창모, 박재정, 원슈타인)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10613163');" title="MSG워너비 TOP 8 경연곡 - 페이지 이동">MSG워너비 TOP 8 경연곡</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="만약에 좋아요" data-song-no="33510309" data-song-menuid="19030101"><span class="odd_span">좋아요</span>
<span class="cnt">
<span class="none">총건수</span>
15,064</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="듣기" class="button_icons play " onclick="melon.play.playSong('19030101',33510309);"><span class="none">듣기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="담기" class="button_icons scrap " onclick="melon.play.addPlayList('33510309');"><span class="none">담기</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="다운로드" class="button_icons download " onclick="melon.buy.goBuyProduct('frm', '33510309', '3C0001', '','0', '19030101');"><span class="none">다운로드</span></button>
						</div></td>
						<td><div class="wrap t_center">
							<button type="button" title="뮤직비디오" class="button_icons video disabled" disabled="disabled" onclick="melon.link.goMvDetail('19030101', '33510309','song');"><span class="none">뮤직비디오</span></button>
						</div></td>
					</tr>
 */
		
		
		
	
	}
	
	


}

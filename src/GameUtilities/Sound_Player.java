
package GameUtilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.player.Player;


public class Sound_Player {
static ArrayList<String> goodSounds = new ArrayList<String>();
static ArrayList<String> badSounds = new ArrayList<String>();
static ArrayList<String> buttonSounds = new ArrayList<String>();
static ArrayList<String> soundsForGame = new ArrayList<String>();
static String shoot = "src\\\\Materials\\\\Sounds\\\\other\\\\fast_shoot.mp3";
static protected FileInputStream f;
static protected Player player;




  public static Random random = new Random();

public static void addButtonSounds()
  {
    buttonSounds.add("src\\\\Materials\\\\Sounds\\\\button\\\\123.mp3");
    buttonSounds.add("src\\\\Materials\\\\Sounds\\\\button\\\\shelk.mp3");

    
  }

public static void addGoodSounds()
  {
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\pole_letter_correct.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\khsm_q10-correct.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\correct answer.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\sms.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\MultimediaPositive_S011TE.750.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\MultimediaPositive_S011TE.735.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\CoinsDropMultiple_S08FO.727.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\CrowdCheerBaseball_SEU02.15.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\HumanCrowdStudio_S08HU.147.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\HumanWhistle_S08HU.2510.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\KidsYeah_S011HU.16.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\MultimediaPositive_S011TE.718.mp3");
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\NotificationMulti_AP1.662.mp3");   
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\NotificationMulti_AP1.665.mp3");    
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\OrientalAccent_SEU04.33.mp3");    
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\HarpGliss_S08MU.685.mp3");    
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\ElectricGuitar_S08MU.372.mp3");    
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\AccentOriental_BWU11.236.mp3");    
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\PianoBluesRiff_S08MU.838.mp3");    
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\AccentAscend_S08MU.1.mp3");  
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\MagicalTwinkle_S08CT.107.mp3");  
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\MusicCharge_S08SP.549.mp3");  
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\PREL_MUSICAL BEEP_PO01.70.mp3");  
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\MusicOrganCharge_S08SP.552.mp3");  
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\ChimeMulti_AP1.395.mp3");  
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\MMFX_CHIME ARPEGGIO BRIGHT BELL_SB01.156.mp3");  
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\radostnoe-ura.mp3");     
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\q6-yes-2008.mp3");     
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\den-pobedy-z_uk-1.mp3");     
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\cartoon-yuppie-shout_mkqozs4o.mp3");     
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\247e5c36a6415c8.mp3");     
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\zastavka-na-vyhod-veduschego.mp3");   
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\w-m-g-world-mix-games-audio-logotip-w-m-g.mp3");          
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\audio_frazy_iz_filmov_h-f_beregis_avtomobilya_-_svobodu_yuriyu_detochkinu!!!.mp3");          
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\audio_frazy_iz_filmov_k-f_dmb_-_povtorim_gavno_vopros!.mp3");         
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\audio_frazy_iz_filmov_k-f_dmb_-_ti_duh_pravilniy....mp3");        
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\audio_frazy_iz_filmov_k-f_ivan_vasilevich_-_lepota!.mp3");        
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\audio_frazy_iz_filmov_k-f_ivan_vasilevich_-_tantsuyut_vse!!!.mp3");        
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\audio_frazy_iz_filmov_k-f_kavkazskaya_plennitsa_-_mashina_zver_slushay!.mp3");        
    goodSounds.add("src\\\\Materials\\\\Sounds\\\\good\\\\audio_frazy_iz_filmov_k-f_kavkazskaya_plennitsa_-_zhit_kak_govoritsya_horosho!.mp3");        
             
    
    
  }
public static void addBadSounds()
  {
        badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\pole_letter_wrong.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\смех гомера.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\mortal.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\wrong.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\61487504_428122223.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\khsm_q6-wrong.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\mario-smert.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\strashnyy-zvuk-dlya-video.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\zvuk-dlya-video--ta-da-da-daaam.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\zvuk-proigrysha--7-1.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\PoliceSirenExt_S08ER.642.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\BuzzerButton_S08TE.317.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\CrashRockDebris_S08IM.183.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\CrowdOh_AP1.1181.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\HumanCrowdStudio_S08HU.182.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\HumanCrowdStudio_S08HU.183.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\HumanCrowdStudio_S08HU.184.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\HumanLaugh_S08HU.342.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\HumanLaugh_S08HU.344.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\WineBottle_AP1.1137.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\maski-shou-naprjazhennyj-moment.mp3");
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_beloe_solntse_pustini_-_ne_govori_nikomu....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_beloe_solntse_pustini_-_pavlini_govorish...mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_beloe_solntse_pustini_-_tebya_kak_srazu_prikonchit....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_brat_-_oruzhie_na_pol_ruki_za_golovu.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_brat_2_-_bili_zhe_lyudi_kak_lyudi....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_brat_2_-_dumat_menshe_nado....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_brilliantovaya_ruka_-_semen_semenich....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_brilliantovaya_ruka_-_shob_ti_izdoh....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dmb_-_eto_vam_ne_eto!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dmb_-_tomu_kto_eto_pridumal....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dmb_-_ya_tebe_seychas_litso_obglodayu!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dzhentlmeni_udachi_-_detochka!_a_vam_ne_kazhetsya....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dzhentlmeni_udachi_-_eto_tebe_ne_meloch....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dzhentlmeni_udachi_-_filonish_gad!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dzhentlmeni_udachi_-_kak_chto_tak_srazu_kosoy....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dzhentlmeni_udachi_-_kakaya_otvratitelnaya_rozha!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dzhentlmeni_udachi_-_kakaya_otvratitelnaya_rozha!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dzhentlmeni_udachi_-_kanay_otsyuda!_roga_pootshibayu...mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dzhentlmeni_udachi_-_slushayte..._zatknites....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_dzhentlmeni_udachi_-_tut_pomnyu_tut..._nichego....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_ivan_vasilevich_-_tfu_na_vas!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_ivan_vasilevich_-_ti_na_chto....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_kavkazskaya_plennitsa_-_budte_dobri_pomedlennee!...mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_kavkazskaya_plennitsa_-_koroche_sklihosovskiy!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_kavkazskaya_plennitsa_-_prekratim_etu_bespoleznuyu....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_kavkazskaya_plennitsa_-_vi_ne_opravdali....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_kin-dza-dza_-_nu_i_zaraza_zhe_ti_rodnoy....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_operatsiya_i_-..._v_tvoem_dome_budet_igrat...mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_operatsiya_i_-_a!_vlip_ochkarik!...mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_operatsiya_i_-_et-to_neserezno!...mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_operatsiya_i_-_oglasite_ves_spisok....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_operatsiya_i_-_stoy!!!_ubyu_student!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_sobache_serdtse_-_abirvalg!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_k-f_sobache_serdtse_-_otlez_gnida....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_m-f_malish_i_karlson_-_nu_ya_tak_ne_igrayu....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_m-f_malish_i_karlson_-_opyat_rozigrish._shalunishka!...mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_m-f_malish_i_karlson_-_otday_plyushku!.mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_m-f_malish_i_karlson_-_spokoystvie!_tolko....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_m-f_maugli_-_akella_promahnulsya....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_m-f_troe_iz_prostokvashino_-_balbes_on._balbes!...mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_m-f_troe_iz_prostokvashino_-_nepravilno_ti_dyadya....mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_osobennosti_natsionalnoy_ohoti_-_chto_eto_bilo...mp3");      
      badSounds.add("src\\\\Materials\\\\Sounds\\\\bad\\\\audio_frazy_iz_filmov_osobennosti_natsionalnoy_ohoti_-_nu_vi_blin_daete....mp3");      
      
  }

public static void addSoundsForGame()
  {
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\ArcadeShooting_S08TE.65.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\CamcorderSwitch_S08TE.335.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\CellClose_S08TE.479.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\CellClose_S08TE.486.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\SteampunkSwitch_S011SF.857.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\ButtonMechanical_AP1.226.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\ButtonPush_S011FO.79.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\ButtonSwitch_S08TE.235.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\ButtonSwitch_S08TE.240.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\ButtonSwitch_S08TE.245.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\ButtonSwitch_S08TE.259.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\ButtonSwitch_S08TE.302.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\ButtonSwitch_S08TE.278.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\MMFX_BUTTON MECHANI_WT01.77.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\MMFX_BUTTON MECHANI_WT01.82.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\MMFX_BUTTON MECHANI_WT01.83.mp3");
    soundsForGame.add("src\\\\Materials\\\\Sounds\\\\other\\\\keyboard\\\\PcKeyboard_S08TE.963.mp3");
  }
    
            public static void playSoundsForGame()
              {
                
            try {
                f = new FileInputStream(soundsForGame.get(random.nextInt(soundsForGame.size())));
                player = new Player(f);
                player.play();
                player.close();
            } catch (Exception ex) {
                Logger.getLogger(Sound_Player.class.getName()).log(Level.SEVERE, null, ex);
            }
                
              }

            public static void playGoodSounds()
              {
                try{
            f = new FileInputStream(goodSounds.get(random.nextInt(goodSounds.size())));          
            player = new Player(f);
            player.play();
            player.close();
            }
            catch(Exception ex)
            {
                
            }
            };
            
            public static void playBadSounds()
              {
                 try{
            f = new FileInputStream(badSounds.get(random.nextInt(badSounds.size())));          
            player = new Player(f);
            player.play();
            player.close();
            }
            catch(Exception ex)
            {
                
            }
                
              };
            
            public static void playButtonSounds()
              {
                try{
            f = new FileInputStream(buttonSounds.get(0));          
            player = new Player(f);
            player.play();
            player.close();
            }
            catch(Exception ex)
            {
                
            }
              } 
            
            
            public static void playButtonSoundsShoot()
            {
                 try{
            f = new FileInputStream(shoot);          
            player = new Player(f);
            player.play();
            player.close();
            }
            catch(Exception ex)
            {
                
            }
            }
                
              
            
            public static void playButtonSoundsBack()
              {
                try{
            f = new FileInputStream(buttonSounds.get(1));          
            player = new Player(f);
            player.play();
            player.close();
            }
            catch(Exception ex)
            {
                
            }
                
              }
            
            
        public static void playMusic(String filepath)
          {
             try{
            f = new FileInputStream(filepath); 
            
            player = new Player(f);
            player.play();
            player.close();
            }
            catch(Exception ex)
            {
                
            }
            };
        protected static Player player1;
        public static void playMusicPlayer1(String filepath)
          {
             try{
            f = new FileInputStream(filepath); 
            
            player1 = new Player(f);
            player1.play();
            player1.close();
            }
            catch(Exception ex)
            {
                
            }
            }
          
            
        public static void stopMusic()
                  {
                       try{
            
            player.close();
            }
            catch(Exception ex)
            {
                
            }
            }
        
        public static void stopMusicPlayer1()
        {
                       try{
            
            player1.close();
            }
            catch(Exception ex)
            {
                
            }
        }
        

       
        



}


        
        
        

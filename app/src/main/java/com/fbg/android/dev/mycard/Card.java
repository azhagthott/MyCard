package com.fbg.android.dev.mycard;

/**
 * Created by fran on 08-09-16.
 */

public class Card extends User {

    // card info
    private int id;
    private String name;

    // card design
    private String mainText;
    private String subText;
    private String phone;
    private String email;
    private String web;
    private String profilePicture;
    private String logo;
    private String backgroundImage;
    private String backgroundColor;
    private String foregroundColor;
    private String color1;
    private String color2;
    private String color3;
    private String color4;

    // url
    private String urlPinterest;
    private String urlLinkedin;
    private String urlDribbble;
    private String urlBehance;
    private String urlTwitter;
    private String urlFacebook;
    private String urlInstagram;
    private String urlCustom;

    public Card(int id, String name, String mainText, String subText, String phone, String email, String web, String profilePicture, String logo, String backgroundImage, String backgroundColor, String foregroundColor, String color1, String color2, String color3, String color4, String urlPinterest, String urlLinkedin, String urlDribbble, String urlBehance, String urlTwitter, String urlFacebook, String urlInstagram, String urlCustom) {
        this.id = id;
        this.name = name;
        this.mainText = mainText;
        this.subText = subText;
        this.phone = phone;
        this.email = email;
        this.web = web;
        this.profilePicture = profilePicture;
        this.logo = logo;
        this.backgroundImage = backgroundImage;
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.color4 = color4;
        this.urlPinterest = urlPinterest;
        this.urlLinkedin = urlLinkedin;
        this.urlDribbble = urlDribbble;
        this.urlBehance = urlBehance;
        this.urlTwitter = urlTwitter;
        this.urlFacebook = urlFacebook;
        this.urlInstagram = urlInstagram;
        this.urlCustom = urlCustom;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getColor3() {
        return color3;
    }

    public void setColor3(String color3) {
        this.color3 = color3;
    }

    public String getColor4() {
        return color4;
    }

    public void setColor4(String color4) {
        this.color4 = color4;
    }

    public String getUrlPinterest() {
        return urlPinterest;
    }

    public void setUrlPinterest(String urlPinterest) {
        this.urlPinterest = urlPinterest;
    }

    public String getUrlLinkedin() {
        return urlLinkedin;
    }

    public void setUrlLinkedin(String urlLinkedin) {
        this.urlLinkedin = urlLinkedin;
    }

    public String getUrlDribbble() {
        return urlDribbble;
    }

    public void setUrlDribbble(String urlDribbble) {
        this.urlDribbble = urlDribbble;
    }

    public String getUrlBehance() {
        return urlBehance;
    }

    public void setUrlBehance(String urlBehance) {
        this.urlBehance = urlBehance;
    }

    public String getUrlTwitter() {
        return urlTwitter;
    }

    public void setUrlTwitter(String urlTwitter) {
        this.urlTwitter = urlTwitter;
    }

    public String getUrlFacebook() {
        return urlFacebook;
    }

    public void setUrlFacebook(String urlFacebook) {
        this.urlFacebook = urlFacebook;
    }

    public String getUrlInstagram() {
        return urlInstagram;
    }

    public void setUrlInstagram(String urlInstagram) {
        this.urlInstagram = urlInstagram;
    }

    public String getUrlCustom() {
        return urlCustom;
    }

    public void setUrlCustom(String urlCustom) {
        this.urlCustom = urlCustom;
    }
}

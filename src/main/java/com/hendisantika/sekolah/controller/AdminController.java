package com.hendisantika.sekolah.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : sekolah
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/03/20
 * Time: 08.40
 */
@Slf4j
@Controller
@RequestMapping("admin")
public class AdminController {
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        log.info("Menampilkan data untuk Halaman Dashboard.");
        model.addAttribute("waktu", LocalDateTime.now());
        return "admin/dashboard";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/inbox")
    public String inbox(Model model) {
        log.info("Menampilkan data untuk Halaman List Inbox.");
        model.addAttribute("waktu", LocalDateTime.now());
        return "admin/dashboard";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/komentar")
    public String komentar(Model model) {
        log.info("Menampilkan data untuk Halaman List Komentar.");
        model.addAttribute("waktu", LocalDateTime.now());
        return "admin/dashboard";
    }

}

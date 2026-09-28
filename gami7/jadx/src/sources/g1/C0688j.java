package g1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.InterfaceC0456e;
import androidx.lifecycle.InterfaceC0470t;

/* renamed from: g1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688j implements InterfaceC0456e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0472v f7729h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f7730i;

    public C0688j(EmojiCompatInitializer emojiCompatInitializer, C0472v c0472v) {
        this.f7730i = emojiCompatInitializer;
        this.f7729h = c0472v;
    }

    @Override // androidx.lifecycle.InterfaceC0456e
    public final void b(InterfaceC0470t interfaceC0470t) {
        this.f7730i.getClass();
        (Build.VERSION.SDK_INT >= 28 ? AbstractC0680b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new l(), 500L);
        this.f7729h.f(this);
    }
}

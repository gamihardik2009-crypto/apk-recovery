package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: b.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2.c f7029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.c f7030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.a f7031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.a f7032d;

    public C0495s(y2.c cVar, y2.c cVar2, y2.a aVar, y2.a aVar2) {
        this.f7029a = cVar;
        this.f7030b = cVar2;
        this.f7031c = aVar;
        this.f7032d = aVar2;
    }

    public final void onBackCancelled() {
        this.f7032d.c();
    }

    public final void onBackInvoked() {
        this.f7031c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        z2.h.f(backEvent, "backEvent");
        this.f7030b.l(new C0478b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        z2.h.f(backEvent, "backEvent");
        this.f7029a.l(new C0478b(backEvent));
    }
}

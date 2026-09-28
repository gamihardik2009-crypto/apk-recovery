package g1;

import B1.C;
import android.os.Build;

/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683e extends l0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0684f f7714d;

    public C0683e(C0684f c0684f) {
        this.f7714d = c0684f;
    }

    @Override // l0.c
    public final void H(Throwable th) {
        this.f7714d.f7715a.e(th);
    }

    @Override // l0.c
    public final void I(K1.i iVar) {
        C0684f c0684f = this.f7714d;
        c0684f.f7717c = iVar;
        K1.i iVar2 = c0684f.f7717c;
        C0687i c0687i = c0684f.f7715a;
        c0684f.f7716b = new Q1.r(iVar2, c0687i.f7726g, c0687i.f7728i, Build.VERSION.SDK_INT >= 34 ? m.a() : C.S());
        c0684f.f7715a.f();
    }
}

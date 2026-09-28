package b1;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* renamed from: b1.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0518O {

    /* renamed from: b, reason: collision with root package name */
    public static final C0521S f7108b;

    /* renamed from: a, reason: collision with root package name */
    public final C0521S f7109a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f7108b = (i2 >= 30 ? new C0511H() : i2 >= 29 ? new C0510G() : new C0509F()).b().f7111a.a().f7111a.b().f7111a.c();
    }

    public C0518O(C0521S c0521s) {
        this.f7109a = c0521s;
    }

    public C0521S a() {
        return this.f7109a;
    }

    public C0521S b() {
        return this.f7109a;
    }

    public C0521S c() {
        return this.f7109a;
    }

    public void d(View view) {
    }

    public C0528e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0518O)) {
            return false;
        }
        C0518O c0518o = (C0518O) obj;
        return n() == c0518o.n() && m() == c0518o.m() && Objects.equals(k(), c0518o.k()) && Objects.equals(i(), c0518o.i()) && Objects.equals(e(), c0518o.e());
    }

    public W0.b f(int i2) {
        return W0.b.f5890e;
    }

    public W0.b g(int i2) {
        if ((i2 & 8) == 0) {
            return W0.b.f5890e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public W0.b h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), e());
    }

    public W0.b i() {
        return W0.b.f5890e;
    }

    public W0.b j() {
        return k();
    }

    public W0.b k() {
        return W0.b.f5890e;
    }

    public W0.b l() {
        return k();
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i2) {
        return true;
    }

    public void p(W0.b[] bVarArr) {
    }

    public void q(C0521S c0521s) {
    }

    public void r(W0.b bVar) {
    }
}

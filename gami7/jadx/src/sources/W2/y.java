package W2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n2.AbstractC0961m;
import n2.C0971w;

/* loaded from: classes.dex */
public abstract class y implements U2.f, InterfaceC0404e {

    /* renamed from: a, reason: collision with root package name */
    public final String f6166a;

    /* renamed from: b, reason: collision with root package name */
    public final C0414o f6167b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6168c;

    /* renamed from: d, reason: collision with root package name */
    public int f6169d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f6170e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f6171f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f6172g;

    /* renamed from: h, reason: collision with root package name */
    public Map f6173h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0862d f6174i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0862d f6175j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0862d f6176k;

    public y(String str, C0414o c0414o, int i2) {
        z2.h.f(str, "serialName");
        this.f6166a = str;
        this.f6167b = c0414o;
        this.f6168c = i2;
        this.f6169d = -1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f6170e = strArr;
        int i4 = this.f6168c;
        this.f6171f = new List[i4];
        this.f6172g = new boolean[i4];
        this.f6173h = C0971w.f9166h;
        EnumC0863e enumC0863e = EnumC0863e.f8643h;
        this.f6174i = B2.a.x(enumC0863e, new x(this, 1));
        this.f6175j = B2.a.x(enumC0863e, new x(this, 2));
        this.f6176k = B2.a.x(enumC0863e, new x(this, 0));
    }

    @Override // U2.f
    public final String a(int i2) {
        return this.f6170e[i2];
    }

    @Override // U2.f
    public final String b() {
        return this.f6166a;
    }

    @Override // W2.InterfaceC0404e
    public final Set c() {
        return this.f6173h.keySet();
    }

    @Override // U2.f
    public U2.f d(int i2) {
        return ((T2.a[]) this.f6174i.getValue())[i2].b();
    }

    @Override // U2.f
    public B1.C e() {
        return U2.j.f5825f;
    }

    @Override // U2.f
    public final int f() {
        return this.f6168c;
    }

    public int hashCode() {
        return ((Number) this.f6176k.getValue()).intValue();
    }

    public String toString() {
        return AbstractC0961m.L(B1.C.m0(0, this.f6168c), ", ", B1.t.k(new StringBuilder(), this.f6166a, '('), ")", new A0.n(20, this), 24);
    }
}

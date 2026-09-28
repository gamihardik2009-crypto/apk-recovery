package C0;

import java.util.List;
import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final C0024g f451a;

    /* renamed from: b, reason: collision with root package name */
    public final K f452b;

    /* renamed from: c, reason: collision with root package name */
    public final List f453c;

    /* renamed from: d, reason: collision with root package name */
    public final int f454d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f455e;

    /* renamed from: f, reason: collision with root package name */
    public final int f456f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.b f457g;

    /* renamed from: h, reason: collision with root package name */
    public final O0.k f458h;

    /* renamed from: i, reason: collision with root package name */
    public final H0.d f459i;

    /* renamed from: j, reason: collision with root package name */
    public final long f460j;

    public G(C0024g c0024g, K k3, List list, int i2, boolean z3, int i3, O0.b bVar, O0.k kVar, H0.d dVar, long j3) {
        this.f451a = c0024g;
        this.f452b = k3;
        this.f453c = list;
        this.f454d = i2;
        this.f455e = z3;
        this.f456f = i3;
        this.f457g = bVar;
        this.f458h = kVar;
        this.f459i = dVar;
        this.f460j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return z2.h.a(this.f451a, g3.f451a) && z2.h.a(this.f452b, g3.f452b) && z2.h.a(this.f453c, g3.f453c) && this.f454d == g3.f454d && this.f455e == g3.f455e && K1.f.t(this.f456f, g3.f456f) && z2.h.a(this.f457g, g3.f457g) && this.f458h == g3.f458h && z2.h.a(this.f459i, g3.f459i) && O0.a.b(this.f460j, g3.f460j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f460j) + ((this.f459i.hashCode() + ((this.f458h.hashCode() + ((this.f457g.hashCode() + AbstractC0837j.b(this.f456f, B1.t.f((((this.f453c.hashCode() + ((this.f452b.hashCode() + (this.f451a.hashCode() * 31)) * 31)) * 31) + this.f454d) * 31, 31, this.f455e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f451a) + ", style=" + this.f452b + ", placeholders=" + this.f453c + ", maxLines=" + this.f454d + ", softWrap=" + this.f455e + ", overflow=" + ((Object) K1.f.S(this.f456f)) + ", density=" + this.f457g + ", layoutDirection=" + this.f458h + ", fontFamilyResolver=" + this.f459i + ", constraints=" + ((Object) O0.a.k(this.f460j)) + ')';
    }
}

package U2;

import B1.C;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f5798a;

    /* renamed from: b, reason: collision with root package name */
    public final F2.b f5799b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5800c;

    public b(g gVar, F2.b bVar) {
        this.f5798a = gVar;
        this.f5799b = bVar;
        this.f5800c = gVar.f5813a + '<' + ((z2.d) bVar).b() + '>';
    }

    @Override // U2.f
    public final String a(int i2) {
        return this.f5798a.a(i2);
    }

    @Override // U2.f
    public final String b() {
        return this.f5800c;
    }

    @Override // U2.f
    public final f d(int i2) {
        return this.f5798a.d(i2);
    }

    @Override // U2.f
    public final C e() {
        return this.f5798a.e();
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && z2.h.a(this.f5798a, bVar.f5798a) && z2.h.a(bVar.f5799b, this.f5799b);
    }

    @Override // U2.f
    public final int f() {
        return this.f5798a.f();
    }

    public final int hashCode() {
        return this.f5800c.hashCode() + (this.f5799b.hashCode() * 31);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f5799b + ", original: " + this.f5798a + ')';
    }
}

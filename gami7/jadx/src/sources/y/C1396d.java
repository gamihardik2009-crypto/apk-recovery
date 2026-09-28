package y;

import O0.k;
import a.AbstractC0423a;
import b0.f;
import c0.AbstractC0569I;
import c0.C0567G;
import c0.C0568H;
import c0.InterfaceC0576P;
import z2.h;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1396d implements InterfaceC0576P {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1393a f11482h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1393a f11483i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1393a f11484j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1393a f11485k;

    public C1396d(InterfaceC1393a interfaceC1393a, InterfaceC1393a interfaceC1393a2, InterfaceC1393a interfaceC1393a3, InterfaceC1393a interfaceC1393a4) {
        this.f11482h = interfaceC1393a;
        this.f11483i = interfaceC1393a2;
        this.f11484j = interfaceC1393a3;
        this.f11485k = interfaceC1393a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [y.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [y.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [y.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [y.a] */
    public static C1396d a(C1396d c1396d, C1394b c1394b, C1394b c1394b2, C1394b c1394b3, C1394b c1394b4, int i2) {
        C1394b c1394b5 = c1394b;
        if ((i2 & 1) != 0) {
            c1394b5 = c1396d.f11482h;
        }
        C1394b c1394b6 = c1394b2;
        if ((i2 & 2) != 0) {
            c1394b6 = c1396d.f11483i;
        }
        C1394b c1394b7 = c1394b3;
        if ((i2 & 4) != 0) {
            c1394b7 = c1396d.f11484j;
        }
        C1394b c1394b8 = c1394b4;
        if ((i2 & 8) != 0) {
            c1394b8 = c1396d.f11485k;
        }
        c1396d.getClass();
        return new C1396d(c1394b5, c1394b6, c1394b7, c1394b8);
    }

    @Override // c0.InterfaceC0576P
    public final AbstractC0569I c(long j3, k kVar, O0.b bVar) {
        float a3 = this.f11482h.a(j3, bVar);
        float a4 = this.f11483i.a(j3, bVar);
        float a5 = this.f11484j.a(j3, bVar);
        float a6 = this.f11485k.a(j3, bVar);
        float c3 = f.c(j3);
        float f3 = a3 + a6;
        if (f3 > c3) {
            float f4 = c3 / f3;
            a3 *= f4;
            a6 *= f4;
        }
        float f5 = a4 + a5;
        if (f5 > c3) {
            float f6 = c3 / f5;
            a4 *= f6;
            a5 *= f6;
        }
        if (a3 < 0.0f || a4 < 0.0f || a5 < 0.0f || a6 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a3 + ", topEnd = " + a4 + ", bottomEnd = " + a5 + ", bottomStart = " + a6 + ")!").toString());
        }
        if (a3 + a4 + a5 + a6 == 0.0f) {
            return new C0567G(AbstractC0423a.n(0L, j3));
        }
        b0.d n3 = AbstractC0423a.n(0L, j3);
        k kVar2 = k.f5148h;
        float f7 = kVar == kVar2 ? a3 : a4;
        long d3 = B2.a.d(f7, f7);
        if (kVar == kVar2) {
            a3 = a4;
        }
        long d4 = B2.a.d(a3, a3);
        float f8 = kVar == kVar2 ? a5 : a6;
        long d5 = B2.a.d(f8, f8);
        if (kVar != kVar2) {
            a6 = a5;
        }
        return new C0568H(new b0.e(n3.f7060a, n3.f7061b, n3.f7062c, n3.f7063d, d3, d4, d5, B2.a.d(a6, a6)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1396d)) {
            return false;
        }
        C1396d c1396d = (C1396d) obj;
        if (!h.a(this.f11482h, c1396d.f11482h)) {
            return false;
        }
        if (!h.a(this.f11483i, c1396d.f11483i)) {
            return false;
        }
        if (h.a(this.f11484j, c1396d.f11484j)) {
            return h.a(this.f11485k, c1396d.f11485k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11485k.hashCode() + ((this.f11484j.hashCode() + ((this.f11483i.hashCode() + (this.f11482h.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f11482h + ", topEnd = " + this.f11483i + ", bottomEnd = " + this.f11484j + ", bottomStart = " + this.f11485k + ')';
    }
}

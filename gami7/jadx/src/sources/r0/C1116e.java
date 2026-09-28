package r0;

import java.util.Map;
import n2.AbstractC0946A;
import t0.C1267z;

/* renamed from: r0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116e implements InterfaceC1096J, InterfaceC1126o {

    /* renamed from: h, reason: collision with root package name */
    public final C1267z f9867h;

    public C1116e(C1267z c1267z) {
        this.f9867h = c1267z;
    }

    @Override // r0.InterfaceC1096J
    public final InterfaceC1095I C(int i2, int i3, Map map, y2.c cVar) {
        return this.f9867h.V(i2, i3, map, cVar);
    }

    @Override // r0.InterfaceC1126o
    public final boolean F() {
        return false;
    }

    @Override // O0.b
    public final long G(long j3) {
        return this.f9867h.G(j3);
    }

    @Override // O0.b
    public final long J(float f3) {
        return this.f9867h.J(f3);
    }

    @Override // O0.b
    public final long M(long j3) {
        return this.f9867h.M(j3);
    }

    @Override // O0.b
    public final float P(float f3) {
        return this.f9867h.c() * f3;
    }

    @Override // O0.b
    public final float Q(long j3) {
        return this.f9867h.Q(j3);
    }

    @Override // r0.InterfaceC1096J
    public final InterfaceC1095I V(int i2, int i3, Map map, y2.c cVar) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new C1115d(i2, i3, map, cVar, this, 0);
        }
        AbstractC0946A.r("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // O0.b
    public final float c() {
        return this.f9867h.c();
    }

    @Override // O0.b
    public final long g0(float f3) {
        return this.f9867h.g0(f3);
    }

    @Override // r0.InterfaceC1126o
    public final O0.k getLayoutDirection() {
        return this.f9867h.f10546s.f10403y;
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f9867h.l(f3);
    }

    @Override // O0.b
    public final int m0(long j3) {
        return this.f9867h.m0(j3);
    }

    @Override // O0.b
    public final float o0(int i2) {
        return this.f9867h.o0(i2);
    }

    @Override // O0.b
    public final float p0(long j3) {
        return this.f9867h.p0(j3);
    }

    @Override // O0.b
    public final float r0(float f3) {
        return f3 / this.f9867h.c();
    }

    @Override // O0.b
    public final float s() {
        return this.f9867h.s();
    }
}

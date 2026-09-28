package r0;

import java.util.Map;
import n2.AbstractC0946A;

/* renamed from: r0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128q implements InterfaceC1096J, InterfaceC1126o {

    /* renamed from: h, reason: collision with root package name */
    public final O0.k f9885h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1126o f9886i;

    public C1128q(InterfaceC1126o interfaceC1126o, O0.k kVar) {
        this.f9885h = kVar;
        this.f9886i = interfaceC1126o;
    }

    @Override // r0.InterfaceC1126o
    public final boolean F() {
        return this.f9886i.F();
    }

    @Override // O0.b
    public final long G(long j3) {
        return this.f9886i.G(j3);
    }

    @Override // O0.b
    public final long J(float f3) {
        return this.f9886i.J(f3);
    }

    @Override // O0.b
    public final long M(long j3) {
        return this.f9886i.M(j3);
    }

    @Override // O0.b
    public final float P(float f3) {
        return this.f9886i.P(f3);
    }

    @Override // O0.b
    public final float Q(long j3) {
        return this.f9886i.Q(j3);
    }

    @Override // r0.InterfaceC1096J
    public final InterfaceC1095I V(int i2, int i3, Map map, y2.c cVar) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new C1127p(i2, i3, map);
        }
        AbstractC0946A.r("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // O0.b
    public final float c() {
        return this.f9886i.c();
    }

    @Override // O0.b
    public final long g0(float f3) {
        return this.f9886i.g0(f3);
    }

    @Override // r0.InterfaceC1126o
    public final O0.k getLayoutDirection() {
        return this.f9885h;
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f9886i.l(f3);
    }

    @Override // O0.b
    public final int m0(long j3) {
        return this.f9886i.m0(j3);
    }

    @Override // O0.b
    public final float o0(int i2) {
        return this.f9886i.o0(i2);
    }

    @Override // O0.b
    public final float p0(long j3) {
        return this.f9886i.p0(j3);
    }

    @Override // O0.b
    public final float r0(float f3) {
        return this.f9886i.r0(f3);
    }

    @Override // O0.b
    public final float s() {
        return this.f9886i.s();
    }
}

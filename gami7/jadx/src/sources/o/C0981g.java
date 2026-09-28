package o;

import R0.A;
import a.AbstractC0423a;
import n2.AbstractC0960l;

/* renamed from: o.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981g implements A {

    /* renamed from: a, reason: collision with root package name */
    public final long f9192a;

    public C0981g(long j3) {
        this.f9192a = j3;
    }

    @Override // R0.A
    public final long a(O0.i iVar, long j3, O0.k kVar, long j4) {
        int i2 = iVar.f5143a;
        long j5 = this.f9192a;
        return AbstractC0423a.m(AbstractC0960l.f(i2 + ((int) (j5 >> 32)), (int) (j4 >> 32), (int) (j3 >> 32), kVar == O0.k.f5148h), AbstractC0960l.f(iVar.f5144b + ((int) (j5 & 4294967295L)), (int) (j4 & 4294967295L), (int) (j3 & 4294967295L), true));
    }
}

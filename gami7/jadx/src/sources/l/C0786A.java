package l;

import a.AbstractC0423a;
import c0.AbstractC0598q;
import e0.AbstractC0655e;
import e0.InterfaceC0654d;
import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import t0.C1238G;

/* renamed from: l.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0786A extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8107i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f8108j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f8109k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f8110l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8111m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0786A(Object obj, long j3, long j4, Object obj2, int i2) {
        super(1);
        this.f8107i = i2;
        this.f8110l = obj;
        this.f8108j = j3;
        this.f8109k = j4;
        this.f8111m = obj2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f8107i) {
            case 0:
                AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
                long j3 = this.f8108j;
                long j4 = this.f8109k;
                abstractC1102P.getClass();
                long m3 = AbstractC0423a.m(((int) (j3 >> 32)) + ((int) (j4 >> 32)), ((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L)));
                AbstractC1103Q abstractC1103Q = (AbstractC1103Q) this.f8110l;
                AbstractC1102P.a(abstractC1102P, abstractC1103Q);
                abstractC1103Q.l0(O0.h.c(m3, abstractC1103Q.f9838l), 0.0f, (y2.c) this.f8111m);
                break;
            default:
                C1238G c1238g = (C1238G) obj;
                c1238g.a();
                InterfaceC0654d.O(c1238g, (AbstractC0598q) this.f8110l, this.f8108j, this.f8109k, 0.0f, (AbstractC0655e) this.f8111m, 104);
                break;
        }
        return C0880v.f8657a;
    }
}

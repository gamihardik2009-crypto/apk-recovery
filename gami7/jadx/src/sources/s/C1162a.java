package s;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.C1125n;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1162a extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1125n f10111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f10112j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10113k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10115m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f10116n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10117o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1162a(C1125n c1125n, float f3, int i2, int i3, int i4, AbstractC1103Q abstractC1103Q, int i5) {
        super(1);
        this.f10111i = c1125n;
        this.f10112j = f3;
        this.f10113k = i2;
        this.f10114l = i3;
        this.f10115m = i4;
        this.f10116n = abstractC1103Q;
        this.f10117o = i5;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        boolean z3 = this.f10111i instanceof C1125n;
        AbstractC1103Q abstractC1103Q = this.f10116n;
        int i2 = this.f10115m;
        int i3 = this.f10113k;
        float f3 = this.f10112j;
        int i4 = z3 ? 0 : !O0.e.a(f3, Float.NaN) ? i3 : (this.f10114l - i2) - abstractC1103Q.f9834h;
        if (!z3) {
            i3 = 0;
        } else if (O0.e.a(f3, Float.NaN)) {
            i3 = (this.f10117o - i2) - abstractC1103Q.f9835i;
        }
        AbstractC1102P.f(abstractC1102P, abstractC1103Q, i4, i3);
        return C0880v.f8657a;
    }
}

package l;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799h extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q[] f8213i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0800i f8214j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8215k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8216l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(AbstractC1103Q[] abstractC1103QArr, C0800i c0800i, int i2, int i3) {
        super(1);
        this.f8213i = abstractC1103QArr;
        this.f8214j = c0800i;
        this.f8215k = i2;
        this.f8216l = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        for (AbstractC1103Q abstractC1103Q : this.f8213i) {
            if (abstractC1103Q != null) {
                long a3 = this.f8214j.f8217a.f8226b.a(l0.c.e(abstractC1103Q.f9834h, abstractC1103Q.f9835i), l0.c.e(this.f8215k, this.f8216l), O0.k.f5148h);
                AbstractC1102P.d(abstractC1102P, abstractC1103Q, (int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
        }
        return C0880v.f8657a;
    }
}

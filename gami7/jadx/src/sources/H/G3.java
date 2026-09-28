package H;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;

/* loaded from: classes.dex */
public final class G3 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1520i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1521j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1522k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f1523l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1524m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1525n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G3(AbstractC1103Q abstractC1103Q, int i2, int i3, AbstractC1103Q abstractC1103Q2, int i4, int i5) {
        super(1);
        this.f1520i = abstractC1103Q;
        this.f1521j = i2;
        this.f1522k = i3;
        this.f1523l = abstractC1103Q2;
        this.f1524m = i4;
        this.f1525n = i5;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        AbstractC1102P.f(abstractC1102P, this.f1520i, this.f1521j, this.f1522k);
        AbstractC1102P.f(abstractC1102P, this.f1523l, this.f1524m, this.f1525n);
        return C0880v.f8657a;
    }
}

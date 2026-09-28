package t;

import n.c0;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: t.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1224s extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public C1228w f10329k;

    /* renamed from: l, reason: collision with root package name */
    public c0 f10330l;

    /* renamed from: m, reason: collision with root package name */
    public y2.e f10331m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f10332n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1228w f10333o;

    /* renamed from: p, reason: collision with root package name */
    public int f10334p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1224s(C1228w c1228w, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f10333o = c1228w;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f10332n = obj;
        this.f10334p |= Integer.MIN_VALUE;
        return this.f10333o.e(null, null, this);
    }
}

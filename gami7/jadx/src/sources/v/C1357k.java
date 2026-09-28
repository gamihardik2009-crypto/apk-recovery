package v;

import m2.C0880v;
import p.InterfaceC1012d0;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;
import t.C1210e;

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357k extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public z2.o f11361l;

    /* renamed from: m, reason: collision with root package name */
    public z2.s f11362m;

    /* renamed from: n, reason: collision with root package name */
    public z2.q f11363n;

    /* renamed from: o, reason: collision with root package name */
    public float f11364o;

    /* renamed from: p, reason: collision with root package name */
    public float f11365p;
    public float q;

    /* renamed from: r, reason: collision with root package name */
    public int f11366r;

    /* renamed from: s, reason: collision with root package name */
    public int f11367s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f11368t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11369u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ O0.b f11370v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1210e f11371w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11372x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f11373y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357k(int i2, O0.b bVar, C1210e c1210e, int i3, int i4, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11369u = i2;
        this.f11370v = bVar;
        this.f11371w = c1210e;
        this.f11372x = i3;
        this.f11373y = i4;
    }

    public static final boolean r(boolean z3, C1210e c1210e, int i2, int i3) {
        if (z3) {
            if (c1210e.b() <= i2 && (c1210e.b() != i2 || c1210e.f10233a.f10346d.b() <= i3)) {
                return false;
            }
        } else if (c1210e.b() >= i2 && (c1210e.b() != i2 || c1210e.f10233a.f10346d.b() >= i3)) {
            return false;
        }
        return true;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1357k) m((InterfaceC1012d0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1357k c1357k = new C1357k(this.f11369u, this.f11370v, this.f11371w, this.f11372x, this.f11373y, interfaceC1073d);
        c1357k.f11368t = obj;
        return c1357k;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0182 -> B:16:0x0189). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    public final java.lang.Object p(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1357k.p(java.lang.Object):java.lang.Object");
    }
}

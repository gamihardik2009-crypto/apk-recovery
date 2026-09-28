package n;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: n.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902j extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public C0905m f8792k;

    /* renamed from: l, reason: collision with root package name */
    public long f8793l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8794m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0905m f8795n;

    /* renamed from: o, reason: collision with root package name */
    public int f8796o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0902j(C0905m c0905m, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8795n = c0905m;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8794m = obj;
        this.f8796o |= Integer.MIN_VALUE;
        return this.f8795n.f(0L, null, this);
    }
}

package m0;

import Q1.r;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854b extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8614k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f8615l;

    /* renamed from: m, reason: collision with root package name */
    public int f8616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0854b(r rVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8615l = rVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8614k = obj;
        this.f8616m |= Integer.MIN_VALUE;
        return this.f8615l.a(0L, 0L, this);
    }
}

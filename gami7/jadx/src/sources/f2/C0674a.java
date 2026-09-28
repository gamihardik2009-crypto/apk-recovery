package f2;

import Q1.p;
import R1.f;
import U1.d;
import com.example.bulksmsscheduler.utils.SmsWorker;
import java.util.Iterator;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674a extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public SmsWorker f7698k;

    /* renamed from: l, reason: collision with root package name */
    public p f7699l;

    /* renamed from: m, reason: collision with root package name */
    public d f7700m;

    /* renamed from: n, reason: collision with root package name */
    public Iterator f7701n;

    /* renamed from: o, reason: collision with root package name */
    public f f7702o;

    /* renamed from: p, reason: collision with root package name */
    public R1.b f7703p;
    public /* synthetic */ Object q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SmsWorker f7704r;

    /* renamed from: s, reason: collision with root package name */
    public int f7705s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0674a(SmsWorker smsWorker, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f7704r = smsWorker;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.q = obj;
        this.f7705s |= Integer.MIN_VALUE;
        return this.f7704r.f(this);
    }
}

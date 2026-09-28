package V;

import J.V;
import J2.B;
import J2.C0325w;
import J2.InterfaceC0328z;
import n.C0886E;
import n2.AbstractC0946A;
import t0.AbstractC1248f;
import t0.InterfaceC1255m;
import t0.Z;
import t0.c0;
import u0.C1314v;

/* loaded from: classes.dex */
public abstract class n implements InterfaceC1255m {

    /* renamed from: i, reason: collision with root package name */
    public O2.e f5859i;

    /* renamed from: j, reason: collision with root package name */
    public int f5860j;

    /* renamed from: l, reason: collision with root package name */
    public n f5862l;

    /* renamed from: m, reason: collision with root package name */
    public n f5863m;

    /* renamed from: n, reason: collision with root package name */
    public c0 f5864n;

    /* renamed from: o, reason: collision with root package name */
    public Z f5865o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5866p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5867r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5868s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5869t;

    /* renamed from: h, reason: collision with root package name */
    public n f5858h = this;

    /* renamed from: k, reason: collision with root package name */
    public int f5861k = -1;

    public void A0() {
        if (!(!this.f5869t)) {
            AbstractC0946A.r("node attached multiple times");
            throw null;
        }
        if (!(this.f5865o != null)) {
            AbstractC0946A.r("attach invoked on a node without a coordinator");
            throw null;
        }
        this.f5869t = true;
        this.f5867r = true;
    }

    public void B0() {
        if (!this.f5869t) {
            AbstractC0946A.r("Cannot detach a node that is not attached");
            throw null;
        }
        if (!(!this.f5867r)) {
            AbstractC0946A.r("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (!(!this.f5868s)) {
            AbstractC0946A.r("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.f5869t = false;
        O2.e eVar = this.f5859i;
        if (eVar != null) {
            B.c(eVar, new V("The Modifier.Node was detached", 1));
            this.f5859i = null;
        }
    }

    public void C0() {
    }

    public void D0() {
    }

    public void E0() {
    }

    public void F0() {
        if (this.f5869t) {
            E0();
        } else {
            AbstractC0946A.r("reset() called on an unattached node");
            throw null;
        }
    }

    public void G0() {
        if (!this.f5869t) {
            AbstractC0946A.r("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f5867r) {
            AbstractC0946A.r("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f5867r = false;
        C0();
        this.f5868s = true;
    }

    public void H0() {
        if (!this.f5869t) {
            AbstractC0946A.r("node detached multiple times");
            throw null;
        }
        if (!(this.f5865o != null)) {
            AbstractC0946A.r("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f5868s) {
            AbstractC0946A.r("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f5868s = false;
        D0();
    }

    public void I0(n nVar) {
        this.f5858h = nVar;
    }

    public void J0(Z z3) {
        this.f5865o = z3;
    }

    public final InterfaceC0328z y0() {
        O2.e eVar = this.f5859i;
        if (eVar != null) {
            return eVar;
        }
        O2.e a3 = B.a(((C1314v) AbstractC1248f.w(this)).getCoroutineContext().A(new J2.c0((J2.Z) ((C1314v) AbstractC1248f.w(this)).getCoroutineContext().s(C0325w.f4437i))));
        this.f5859i = a3;
        return a3;
    }

    public boolean z0() {
        return !(this instanceof C0886E);
    }
}
